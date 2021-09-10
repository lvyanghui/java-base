package com.lyh.fund.service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lyh.fund.domain.FundDetailInfo;
import com.lyh.fund.domain.FundDetailInfoExample;
import com.lyh.fund.domain.ResultData;
import com.lyh.fund.mapper.FundDetailInfoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.lyh.fund.utils.ToolUtils.getBigDecimal;
import static com.lyh.fund.utils.ToolUtils.getDate;

/**
 * Created by lvyanghui
 * 2021/9/6 22:15
 */
@Service
public class FundService {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    FundDetailInfoMapper fundDetailInfoMapper;

    public String getFunds(){
        //4. 设置header的Get请求
        String url = "http://fund.eastmoney.com/data/rankhandler.aspx?op=ph&dt=kf&ft=all&rs=&gs=0&sc=lnzf&st=desc&sd=2019-12-10&ed=2020-12-10&qdii=&tabSubtype=,,,,,&pi=1&pn=10000&dx=1&v=0.17771342305527527";
        HttpHeaders headers = new HttpHeaders();

        headers.add("Host","fund.eastmoney.com");
        headers.add("Referer","http://fund.eastmoney.com/data/fundranking.html");
        headers.add("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36");
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<String>(headers), String.class);

        return response.getBody();

    }

    private ResultData getResultData(String result){
        try {
            Pattern pattern = Pattern.compile("\\{.*\\}");
            Matcher matcher = pattern.matcher(result);
            if(matcher.find()){
                ObjectMapper mapper = new ObjectMapper();
                //允许使用未带引号的字段名
                mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
                //允许使用单引号
                mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
                ResultData resultData = mapper.readValue(matcher.group(), ResultData.class);
                return resultData;
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    public String insertFund(){
        String funds = getFunds();
        ResultData resultData = getResultData(funds);

        List<FundDetailInfo> infoList = getList(resultData);
        for(FundDetailInfo info : infoList){
            insertOrUpdate(info);
        }
        return "success";
    }

    private void insertOrUpdate(FundDetailInfo info){
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.createCriteria().andFundCodeEqualTo(info.getFundCode());
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        if(null == infoList || infoList.size() == 0){
            fundDetailInfoMapper.insertSelective(info);
        }else{
            FundDetailInfo detailInfo = infoList.get(0);
            BeanUtils.copyProperties(info,detailInfo,"id");
            fundDetailInfoMapper.updateByPrimaryKeySelective(detailInfo);
        }
    }
    private List<FundDetailInfo> getList(ResultData resultData){
        List<FundDetailInfo> infoList = new ArrayList<>();
        for(String data : resultData.getDatas()){
            infoList.add(buildInfo(data));
        }
        return infoList;
    }

    private FundDetailInfo buildInfo(String data){

        FundDetailInfo info = new FundDetailInfo();
        String[] split = data.split(",",-1);

        info.setFundCode(split[0]);
        info.setFundName(split[1]);
        info.setFundPinyin(split[2]);
        info.setFundDate(getDate(split[3]));
        info.setNetAssetValue(getBigDecimal(split[4]));
        info.setAccumulatedNet(getBigDecimal(split[5]));
        info.setDailyGrowRate(getBigDecimal(split[6]));
        info.setNearly1Week(getBigDecimal(split[7]));
        info.setNearly1Month(getBigDecimal(split[8]));
        info.setNearly3Month(getBigDecimal(split[9]));
        info.setNearly6Month(getBigDecimal(split[10]));
        info.setNearly1Year(getBigDecimal(split[11]));
        info.setNearly2Year(getBigDecimal(split[12]));
        info.setNearly3Year(getBigDecimal(split[13]));
        info.setSinceThisYear(getBigDecimal(split[14]));
        info.setSinceEstablish(getBigDecimal(split[15]));
        info.setEstablishDate(getDate(split[16]));
        info.setUnknown1(Integer.parseInt(split[17]));
        info.setCustom(getBigDecimal(split[18]));
        info.setServiceCharge(getBigDecimal(split[19].replace("%","")));
        info.setDiscountServiceCharge(getBigDecimal(split[20].replace("%","")));
        info.setDiscount(getBigDecimal(split[21]));
        info.setUnknown2(getBigDecimal(split[24]));

        return info;
    }
}
