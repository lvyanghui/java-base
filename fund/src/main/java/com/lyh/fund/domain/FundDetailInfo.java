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

    private BigDecimal nearly1Week;

    private BigDecimal nearly1Month;

    private BigDecimal nearly3Month;

    private BigDecimal nearly6Month;

    private BigDecimal nearly1Year;

    private BigDecimal nearly2Year;

    private BigDecimal nearly3Year;

    private BigDecimal sinceThisYear;

    private BigDecimal sinceEstablish;

    private Date establishDate;

    private Integer unknown1;

    private BigDecimal custom;

    private BigDecimal serviceCharge;

    private BigDecimal discountServiceCharge;

    private BigDecimal discount;

    private BigDecimal unknown2;

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

    public BigDecimal getNearly1Week() {
        return nearly1Week;
    }

    public void setNearly1Week(BigDecimal nearly1Week) {
        this.nearly1Week = nearly1Week;
    }

    public BigDecimal getNearly1Month() {
        return nearly1Month;
    }

    public void setNearly1Month(BigDecimal nearly1Month) {
        this.nearly1Month = nearly1Month;
    }

    public BigDecimal getNearly3Month() {
        return nearly3Month;
    }

    public void setNearly3Month(BigDecimal nearly3Month) {
        this.nearly3Month = nearly3Month;
    }

    public BigDecimal getNearly6Month() {
        return nearly6Month;
    }

    public void setNearly6Month(BigDecimal nearly6Month) {
        this.nearly6Month = nearly6Month;
    }

    public BigDecimal getNearly1Year() {
        return nearly1Year;
    }

    public void setNearly1Year(BigDecimal nearly1Year) {
        this.nearly1Year = nearly1Year;
    }

    public BigDecimal getNearly2Year() {
        return nearly2Year;
    }

    public void setNearly2Year(BigDecimal nearly2Year) {
        this.nearly2Year = nearly2Year;
    }

    public BigDecimal getNearly3Year() {
        return nearly3Year;
    }

    public void setNearly3Year(BigDecimal nearly3Year) {
        this.nearly3Year = nearly3Year;
    }

    public BigDecimal getSinceThisYear() {
        return sinceThisYear;
    }

    public void setSinceThisYear(BigDecimal sinceThisYear) {
        this.sinceThisYear = sinceThisYear;
    }

    public BigDecimal getSinceEstablish() {
        return sinceEstablish;
    }

    public void setSinceEstablish(BigDecimal sinceEstablish) {
        this.sinceEstablish = sinceEstablish;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public Integer getUnknown1() {
        return unknown1;
    }

    public void setUnknown1(Integer unknown1) {
        this.unknown1 = unknown1;
    }

    public BigDecimal getCustom() {
        return custom;
    }

    public void setCustom(BigDecimal custom) {
        this.custom = custom;
    }

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public BigDecimal getDiscountServiceCharge() {
        return discountServiceCharge;
    }

    public void setDiscountServiceCharge(BigDecimal discountServiceCharge) {
        this.discountServiceCharge = discountServiceCharge;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getUnknown2() {
        return unknown2;
    }

    public void setUnknown2(BigDecimal unknown2) {
        this.unknown2 = unknown2;
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