package com.lyh.fund.domain;

import java.math.BigDecimal;
import java.util.Date;

public class FundDetailInfo {
    private Integer id;

    private String fundCode;

    private String fundName;

    private String fundPinyin;

    private Date fundDate;

    private BigDecimal netAssetValue;

    private BigDecimal accumulatedNet;

    private BigDecimal dailyGrowRate;

    private BigDecimal nearly1WeekGrowRate;

    private BigDecimal nearly1MonthGrowRate;

    private BigDecimal nearly3MonthGrowRate;

    private BigDecimal nearly6MonthGrowRate;

    private BigDecimal nearly1YearGrowRate;

    private BigDecimal nearly2YearGrowRate;

    private BigDecimal nearly3YearGrowRate;

    private BigDecimal nearly5YearGrowRate;

    private BigDecimal sinceThisYearGrowRate;

    private BigDecimal sinceEstablishGrowRate;

    private BigDecimal customGrowRate;

    private BigDecimal nearly1YearWaveRate;

    private BigDecimal nearly2YearWaveRate;

    private BigDecimal nearly3YearWaveRate;

    private BigDecimal nearly1YearSharpRate;

    private BigDecimal nearly2YearSharpRate;

    private BigDecimal nearly3YearSharpRate;

    private Date establishDate;

    private String fundManager;

    private Date managerStartDate;

    private String previousFundManager;

    private Date previousManagerStartDate;

    private BigDecimal lockPeriod;

    private BigDecimal serviceChargeRate;

    private BigDecimal discountServiceChargeRate;

    private BigDecimal discountRate;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName == null ? null : fundName.trim();
    }

    public String getFundPinyin() {
        return fundPinyin;
    }

    public void setFundPinyin(String fundPinyin) {
        this.fundPinyin = fundPinyin == null ? null : fundPinyin.trim();
    }

    public Date getFundDate() {
        return fundDate;
    }

    public void setFundDate(Date fundDate) {
        this.fundDate = fundDate;
    }

    public BigDecimal getNetAssetValue() {
        return netAssetValue;
    }

    public void setNetAssetValue(BigDecimal netAssetValue) {
        this.netAssetValue = netAssetValue;
    }

    public BigDecimal getAccumulatedNet() {
        return accumulatedNet;
    }

    public void setAccumulatedNet(BigDecimal accumulatedNet) {
        this.accumulatedNet = accumulatedNet;
    }

    public BigDecimal getDailyGrowRate() {
        return dailyGrowRate;
    }

    public void setDailyGrowRate(BigDecimal dailyGrowRate) {
        this.dailyGrowRate = dailyGrowRate;
    }

    public BigDecimal getNearly1WeekGrowRate() {
        return nearly1WeekGrowRate;
    }

    public void setNearly1WeekGrowRate(BigDecimal nearly1WeekGrowRate) {
        this.nearly1WeekGrowRate = nearly1WeekGrowRate;
    }

    public BigDecimal getNearly1MonthGrowRate() {
        return nearly1MonthGrowRate;
    }

    public void setNearly1MonthGrowRate(BigDecimal nearly1MonthGrowRate) {
        this.nearly1MonthGrowRate = nearly1MonthGrowRate;
    }

    public BigDecimal getNearly3MonthGrowRate() {
        return nearly3MonthGrowRate;
    }

    public void setNearly3MonthGrowRate(BigDecimal nearly3MonthGrowRate) {
        this.nearly3MonthGrowRate = nearly3MonthGrowRate;
    }

    public BigDecimal getNearly6MonthGrowRate() {
        return nearly6MonthGrowRate;
    }

    public void setNearly6MonthGrowRate(BigDecimal nearly6MonthGrowRate) {
        this.nearly6MonthGrowRate = nearly6MonthGrowRate;
    }

    public BigDecimal getNearly1YearGrowRate() {
        return nearly1YearGrowRate;
    }

    public void setNearly1YearGrowRate(BigDecimal nearly1YearGrowRate) {
        this.nearly1YearGrowRate = nearly1YearGrowRate;
    }

    public BigDecimal getNearly2YearGrowRate() {
        return nearly2YearGrowRate;
    }

    public void setNearly2YearGrowRate(BigDecimal nearly2YearGrowRate) {
        this.nearly2YearGrowRate = nearly2YearGrowRate;
    }

    public BigDecimal getNearly3YearGrowRate() {
        return nearly3YearGrowRate;
    }

    public void setNearly3YearGrowRate(BigDecimal nearly3YearGrowRate) {
        this.nearly3YearGrowRate = nearly3YearGrowRate;
    }

    public BigDecimal getNearly5YearGrowRate() {
        return nearly5YearGrowRate;
    }

    public void setNearly5YearGrowRate(BigDecimal nearly5YearGrowRate) {
        this.nearly5YearGrowRate = nearly5YearGrowRate;
    }

    public BigDecimal getSinceThisYearGrowRate() {
        return sinceThisYearGrowRate;
    }

    public void setSinceThisYearGrowRate(BigDecimal sinceThisYearGrowRate) {
        this.sinceThisYearGrowRate = sinceThisYearGrowRate;
    }

    public BigDecimal getSinceEstablishGrowRate() {
        return sinceEstablishGrowRate;
    }

    public void setSinceEstablishGrowRate(BigDecimal sinceEstablishGrowRate) {
        this.sinceEstablishGrowRate = sinceEstablishGrowRate;
    }

    public BigDecimal getCustomGrowRate() {
        return customGrowRate;
    }

    public void setCustomGrowRate(BigDecimal customGrowRate) {
        this.customGrowRate = customGrowRate;
    }

    public BigDecimal getNearly1YearWaveRate() {
        return nearly1YearWaveRate;
    }

    public void setNearly1YearWaveRate(BigDecimal nearly1YearWaveRate) {
        this.nearly1YearWaveRate = nearly1YearWaveRate;
    }

    public BigDecimal getNearly2YearWaveRate() {
        return nearly2YearWaveRate;
    }

    public void setNearly2YearWaveRate(BigDecimal nearly2YearWaveRate) {
        this.nearly2YearWaveRate = nearly2YearWaveRate;
    }

    public BigDecimal getNearly3YearWaveRate() {
        return nearly3YearWaveRate;
    }

    public void setNearly3YearWaveRate(BigDecimal nearly3YearWaveRate) {
        this.nearly3YearWaveRate = nearly3YearWaveRate;
    }

    public BigDecimal getNearly1YearSharpRate() {
        return nearly1YearSharpRate;
    }

    public void setNearly1YearSharpRate(BigDecimal nearly1YearSharpRate) {
        this.nearly1YearSharpRate = nearly1YearSharpRate;
    }

    public BigDecimal getNearly2YearSharpRate() {
        return nearly2YearSharpRate;
    }

    public void setNearly2YearSharpRate(BigDecimal nearly2YearSharpRate) {
        this.nearly2YearSharpRate = nearly2YearSharpRate;
    }

    public BigDecimal getNearly3YearSharpRate() {
        return nearly3YearSharpRate;
    }

    public void setNearly3YearSharpRate(BigDecimal nearly3YearSharpRate) {
        this.nearly3YearSharpRate = nearly3YearSharpRate;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public String getFundManager() {
        return fundManager;
    }

    public void setFundManager(String fundManager) {
        this.fundManager = fundManager == null ? null : fundManager.trim();
    }

    public Date getManagerStartDate() {
        return managerStartDate;
    }

    public void setManagerStartDate(Date managerStartDate) {
        this.managerStartDate = managerStartDate;
    }

    public String getPreviousFundManager() {
        return previousFundManager;
    }

    public void setPreviousFundManager(String previousFundManager) {
        this.previousFundManager = previousFundManager == null ? null : previousFundManager.trim();
    }

    public Date getPreviousManagerStartDate() {
        return previousManagerStartDate;
    }

    public void setPreviousManagerStartDate(Date previousManagerStartDate) {
        this.previousManagerStartDate = previousManagerStartDate;
    }

    public BigDecimal getLockPeriod() {
        return lockPeriod;
    }

    public void setLockPeriod(BigDecimal lockPeriod) {
        this.lockPeriod = lockPeriod;
    }

    public BigDecimal getServiceChargeRate() {
        return serviceChargeRate;
    }

    public void setServiceChargeRate(BigDecimal serviceChargeRate) {
        this.serviceChargeRate = serviceChargeRate;
    }

    public BigDecimal getDiscountServiceChargeRate() {
        return discountServiceChargeRate;
    }

    public void setDiscountServiceChargeRate(BigDecimal discountServiceChargeRate) {
        this.discountServiceChargeRate = discountServiceChargeRate;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}