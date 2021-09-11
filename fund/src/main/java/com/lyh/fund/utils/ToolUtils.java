package com.lyh.fund.utils;

import com.lyh.fund.domain.FundDetailInfo;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by lvyanghui
 * 2021/9/10 22:19
 */
public class ToolUtils {

    public static void main(String[] args) {
        String data = "009559,嘉实稳惠6个月持有期混合C,JSWH6GYCYQHHC,2021-09-10,1.0590,1.0590,0.04,0.79,1.38,2.87,3.92,,," +
                ",4.93,5.90,2020-11-27,1,,,0.00%,,,,";
        /*String data = "000011,华夏大盘精选混合A,HXDPJXHHA,2021-09-10,20.9370,27.7410,0.10,-0.22,0.44,3.58,9.78,26.01,70.62," +
                "112.01,6.60,4163.02,2004-08-11,1,48.8697,1.50%,0.15%,1,0.15%,1,136.32";*/
        String[] split = data.split(",",-1);
        FundDetailInfo info = new FundDetailInfo();
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
        System.out.println(info.toString());
    }

    public static Date getDate(String data){
        DateFormat dateFormat = DateFormat.getDateInstance();
        try {
            Date date = dateFormat.parse(data);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static BigDecimal getBigDecimal(String data){
        
        if(null == data || "".equals(data)){
            return null;
        }else{
            return new BigDecimal(data);
        }
        
    }
}
