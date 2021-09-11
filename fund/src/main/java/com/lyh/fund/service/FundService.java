package com.lyh.fund.service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
        String all = "http://fund.eastmoney.com/data/rankhandler.aspx?op=ph&dt=kf&ft=all&rs=&gs=0&sc=lnzf&st=desc&sd=2019-12-10&ed=2020-12-10&qdii=&tabSubtype=,,,,,&pi=1&pn=10000&dx=1&v=0.17771342305527527";
        String gp = "http://fund.eastmoney.com/data/rankhandler.aspx?op=ph&dt=kf&ft=gp&rs=&gs=0&sc=lnzf&st=desc&sd=2019-12-10&ed=2020-12-10&qdii=&tabSubtype=,,,,,&pi=1&pn=10000&dx=1&v=0.7484586769252701";
        String hh = "http://fund.eastmoney.com/data/rankhandler.aspx?op=ph&dt=kf&ft=hh&rs=&gs=0&sc=lnzf&st=desc&sd=2019-12-10&ed=2020-12-10&qdii=&tabSubtype=,,,,,&pi=1&pn=10000&dx=1&v=0.9177684847271779";
        String zq = "http://fund.eastmoney.com/data/rankhandler.aspx?op=ph&dt=kf&ft=zq&rs=&gs=0&sc=lnzf&st=desc&sd=2019-12-10&ed=2020-12-10&qdii=|&tabSubtype=,,,,,&pi=1&pn=10000&dx=1&v=0.6739977870119034";
        String zs = "http://fund.eastmoney.com/data/rankhandler.aspx?op=ph&dt=kf&ft=zs&rs=&gs=0&sc=lnzf&st=desc&sd=2019-12-10&ed=2020-12-10&qdii=|&tabSubtype=,,,,,&pi=1&pn=10000&dx=1&v=0.05849205757584319";
        String qdii = "http://fund.eastmoney.com/data/rankhandler.aspx?op=ph&dt=kf&ft=qdii&rs=&gs=0&sc=lnzf&st=desc&sd=2019-12-10&ed=2020-12-10&qdii=&tabSubtype=,,,,,&pi=1&pn=10000&dx=1&v=0.310210851784956";
        String lof = "http://fund.eastmoney.com/data/rankhandler.aspx?op=ph&dt=kf&ft=lof&rs=&gs=0&sc=lnzf&st=desc&sd=2019-12-10&ed=2020-12-10&qdii=&tabSubtype=,,,,,&pi=1&pn=10000&dx=1&v=0.1347115704917503";
        String fof = "http://fund.eastmoney.com/data/rankhandler.aspx?op=ph&dt=kf&ft=fof&rs=&gs=0&sc=lnzf&st=desc&sd=2019-12-10&ed=2020-12-10&qdii=&tabSubtype=,,,,,&pi=1&pn=10000&dx=1&v=0.8594913765963186";
        HttpHeaders headers = new HttpHeaders();

        headers.add("Host","fund.eastmoney.com");
        headers.add("Referer","http://fund.eastmoney.com/data/fundranking.html");
        headers.add("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36");
        ResponseEntity<String> response = restTemplate.exchange(all, HttpMethod.GET, new HttpEntity<String>(headers), String.class);

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
            detailInfo.setUpdateTime(new Date());
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
        info.setNearly1WeekGrowRate(getBigDecimal(split[7]));
        info.setNearly1MonthGrowRate(getBigDecimal(split[8]));
        info.setNearly3MonthGrowRate(getBigDecimal(split[9]));
        info.setNearly6MonthGrowRate(getBigDecimal(split[10]));
        info.setNearly1YearGrowRate(getBigDecimal(split[11]));
        info.setNearly2YearGrowRate(getBigDecimal(split[12]));
        info.setNearly3YearGrowRate(getBigDecimal(split[13]));
        info.setSinceThisYearGrowRate(getBigDecimal(split[14]));
        info.setSinceEstablishGrowRate(getBigDecimal(split[15]));
        info.setEstablishDate(getDate(split[16]));
        info.setLockPeriod(getBigDecimal(split[17]));
        info.setCustomGrowRate(getBigDecimal(split[18]));
        info.setServiceChargeRate(getBigDecimal(split[19].replace("%","")));
        info.setDiscountServiceChargeRate(getBigDecimal(split[20].replace("%","")));
        info.setDiscountRate(getBigDecimal(split[21]));
        info.setNearly5YearGrowRate(getBigDecimal(split[24]));

        info.setCreateTime(new Date());
        info.setUpdateTime(new Date());
        return info;
    }

    public PageInfo<FundDetailInfo> queryFundsByPage(){

        Page page = PageHelper.startPage(1, 10);
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.setOrderByClause("id asc");
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        PageInfo<FundDetailInfo> pageInfo = new PageInfo<>(infoList);
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        return pageInfo;
    }


    private int getLimit(FundDetailInfoExample example,int divisor){
        long count = fundDetailInfoMapper.countByExample(example);
        return (int)(count / divisor);
    }

    private BigDecimal get1YearMin(){
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.createCriteria().andNearly1YearGrowRateIsNotNull();
        int limit = getLimit(example,4);
        System.out.println("1Year limit " + limit);
        PageHelper.startPage(1, limit);
        example.setOrderByClause("nearly_1_year_grow_rate desc");
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        return infoList.get(infoList.size() - 1).getNearly1YearGrowRate();
    }

    public List<String> get1YearCode(){
        BigDecimal min = get1YearMin();
        System.out.println("1Year min " + min);
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.createCriteria().andNearly1YearGrowRateGreaterThanOrEqualTo(min);
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        List<String> collect = infoList.stream().map(FundDetailInfo::getFundCode).collect(Collectors.toList());
        return collect;
    }

    private BigDecimal get2YearMin(){
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.createCriteria().andNearly2YearGrowRateIsNotNull();
        int limit = getLimit(example,4);
        System.out.println("2Year limit " + limit);
        PageHelper.startPage(1, limit);
        example.setOrderByClause("nearly_2_year_grow_rate desc");
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        return infoList.get(infoList.size() - 1).getNearly2YearGrowRate();
    }

    public List<String> get2YearCode(){
        BigDecimal min = get2YearMin();
        System.out.println("2Year min " + min);
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.createCriteria().andNearly2YearGrowRateGreaterThanOrEqualTo(min);
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        List<String> collect = infoList.stream().map(FundDetailInfo::getFundCode).collect(Collectors.toList());
        return collect;
    }

    private BigDecimal get3YearMin(){
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.createCriteria().andNearly3YearGrowRateIsNotNull();
        int limit = getLimit(example,4);
        System.out.println("3Year limit " + limit);
        PageHelper.startPage(1, limit);
        example.setOrderByClause("nearly_3_year_grow_rate desc");
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        return infoList.get(infoList.size() - 1).getNearly3YearGrowRate();
    }

    public List<String> get3YearCode(){
        BigDecimal min = get3YearMin();
        System.out.println("3Year min " + min);
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.createCriteria().andNearly3YearGrowRateGreaterThanOrEqualTo(min);
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        List<String> collect = infoList.stream().map(FundDetailInfo::getFundCode).collect(Collectors.toList());
        return collect;
    }

    private BigDecimal get5YearMin(){
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.createCriteria().andNearly5YearGrowRateIsNotNull();
        int limit = getLimit(example,4);
        System.out.println("5Year limit " + limit);
        PageHelper.startPage(1, limit);
        example.setOrderByClause("nearly_5_year_grow_rate desc");
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        return infoList.get(infoList.size() - 1).getNearly5YearGrowRate();
    }

    public List<String> get5YearCode(){
        BigDecimal min = get5YearMin();
        System.out.println("5Year min " + min);
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.createCriteria().andNearly5YearGrowRateGreaterThanOrEqualTo(min);
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        List<String> collect = infoList.stream().map(FundDetailInfo::getFundCode).collect(Collectors.toList());
        return collect;
    }

    private BigDecimal get3MonthMin(){
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.createCriteria().andNearly3MonthGrowRateIsNotNull();
        int limit = getLimit(example,3);
        System.out.println("3Month limit " + limit);
        PageHelper.startPage(1, limit);
        example.setOrderByClause("nearly_3_month_grow_rate desc");
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        return infoList.get(infoList.size() - 1).getNearly3MonthGrowRate();
    }

    public List<String> get3MonthCode(){
        BigDecimal min = get3MonthMin();
        System.out.println("3Month min " + min);
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.createCriteria().andNearly3MonthGrowRateGreaterThanOrEqualTo(min);
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        List<String> collect = infoList.stream().map(FundDetailInfo::getFundCode).collect(Collectors.toList());
        return collect;
    }

    private BigDecimal get6MonthMin(){
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.createCriteria().andNearly6MonthGrowRateIsNotNull();
        int limit = getLimit(example,3);
        System.out.println("6Month limit " + limit);
        PageHelper.startPage(1, limit);
        example.setOrderByClause("nearly_6_month_grow_rate desc");
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        return infoList.get(infoList.size() - 1).getNearly6MonthGrowRate();
    }

    public List<String> get6MonthCode(){
        BigDecimal min = get6MonthMin();
        System.out.println("6Month min " + min);
        FundDetailInfoExample example = new FundDetailInfoExample();
        example.createCriteria().andNearly6MonthGrowRateGreaterThanOrEqualTo(min);
        List<FundDetailInfo> infoList = fundDetailInfoMapper.selectByExample(example);
        List<String> collect = infoList.stream().map(FundDetailInfo::getFundCode).collect(Collectors.toList());
        return collect;
    }

    //按照4433法则计算排名靠前的基金
    public List<String> getCode(){
        List<String> codes = get1YearCode();
        codes.retainAll(get2YearCode());
        codes.retainAll(get3YearCode());
        codes.retainAll(get5YearCode());
        codes.retainAll(get3MonthCode());
        codes.retainAll(get6MonthCode());

        return codes;
    }
}
