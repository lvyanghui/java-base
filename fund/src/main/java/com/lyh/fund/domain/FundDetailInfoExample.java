package com.lyh.fund.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FundDetailInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundDetailInfoExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFundCodeIsNull() {
            addCriterion("fund_code is null");
            return (Criteria) this;
        }

        public Criteria andFundCodeIsNotNull() {
            addCriterion("fund_code is not null");
            return (Criteria) this;
        }

        public Criteria andFundCodeEqualTo(String value) {
            addCriterion("fund_code =", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotEqualTo(String value) {
            addCriterion("fund_code <>", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThan(String value) {
            addCriterion("fund_code >", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_code >=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThan(String value) {
            addCriterion("fund_code <", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThanOrEqualTo(String value) {
            addCriterion("fund_code <=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLike(String value) {
            addCriterion("fund_code like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotLike(String value) {
            addCriterion("fund_code not like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeIn(List<String> values) {
            addCriterion("fund_code in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotIn(List<String> values) {
            addCriterion("fund_code not in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeBetween(String value1, String value2) {
            addCriterion("fund_code between", value1, value2, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotBetween(String value1, String value2) {
            addCriterion("fund_code not between", value1, value2, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNull() {
            addCriterion("fund_name is null");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNotNull() {
            addCriterion("fund_name is not null");
            return (Criteria) this;
        }

        public Criteria andFundNameEqualTo(String value) {
            addCriterion("fund_name =", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotEqualTo(String value) {
            addCriterion("fund_name <>", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThan(String value) {
            addCriterion("fund_name >", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThanOrEqualTo(String value) {
            addCriterion("fund_name >=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThan(String value) {
            addCriterion("fund_name <", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThanOrEqualTo(String value) {
            addCriterion("fund_name <=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLike(String value) {
            addCriterion("fund_name like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotLike(String value) {
            addCriterion("fund_name not like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameIn(List<String> values) {
            addCriterion("fund_name in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotIn(List<String> values) {
            addCriterion("fund_name not in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameBetween(String value1, String value2) {
            addCriterion("fund_name between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotBetween(String value1, String value2) {
            addCriterion("fund_name not between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundPinyinIsNull() {
            addCriterion("fund_pinyin is null");
            return (Criteria) this;
        }

        public Criteria andFundPinyinIsNotNull() {
            addCriterion("fund_pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andFundPinyinEqualTo(String value) {
            addCriterion("fund_pinyin =", value, "fundPinyin");
            return (Criteria) this;
        }

        public Criteria andFundPinyinNotEqualTo(String value) {
            addCriterion("fund_pinyin <>", value, "fundPinyin");
            return (Criteria) this;
        }

        public Criteria andFundPinyinGreaterThan(String value) {
            addCriterion("fund_pinyin >", value, "fundPinyin");
            return (Criteria) this;
        }

        public Criteria andFundPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("fund_pinyin >=", value, "fundPinyin");
            return (Criteria) this;
        }

        public Criteria andFundPinyinLessThan(String value) {
            addCriterion("fund_pinyin <", value, "fundPinyin");
            return (Criteria) this;
        }

        public Criteria andFundPinyinLessThanOrEqualTo(String value) {
            addCriterion("fund_pinyin <=", value, "fundPinyin");
            return (Criteria) this;
        }

        public Criteria andFundPinyinLike(String value) {
            addCriterion("fund_pinyin like", value, "fundPinyin");
            return (Criteria) this;
        }

        public Criteria andFundPinyinNotLike(String value) {
            addCriterion("fund_pinyin not like", value, "fundPinyin");
            return (Criteria) this;
        }

        public Criteria andFundPinyinIn(List<String> values) {
            addCriterion("fund_pinyin in", values, "fundPinyin");
            return (Criteria) this;
        }

        public Criteria andFundPinyinNotIn(List<String> values) {
            addCriterion("fund_pinyin not in", values, "fundPinyin");
            return (Criteria) this;
        }

        public Criteria andFundPinyinBetween(String value1, String value2) {
            addCriterion("fund_pinyin between", value1, value2, "fundPinyin");
            return (Criteria) this;
        }

        public Criteria andFundPinyinNotBetween(String value1, String value2) {
            addCriterion("fund_pinyin not between", value1, value2, "fundPinyin");
            return (Criteria) this;
        }

        public Criteria andFundDateIsNull() {
            addCriterion("fund_date is null");
            return (Criteria) this;
        }

        public Criteria andFundDateIsNotNull() {
            addCriterion("fund_date is not null");
            return (Criteria) this;
        }

        public Criteria andFundDateEqualTo(Date value) {
            addCriterionForJDBCDate("fund_date =", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("fund_date <>", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateGreaterThan(Date value) {
            addCriterionForJDBCDate("fund_date >", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fund_date >=", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateLessThan(Date value) {
            addCriterionForJDBCDate("fund_date <", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fund_date <=", value, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateIn(List<Date> values) {
            addCriterionForJDBCDate("fund_date in", values, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("fund_date not in", values, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fund_date between", value1, value2, "fundDate");
            return (Criteria) this;
        }

        public Criteria andFundDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fund_date not between", value1, value2, "fundDate");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueIsNull() {
            addCriterion("net_asset_value is null");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueIsNotNull() {
            addCriterion("net_asset_value is not null");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueEqualTo(BigDecimal value) {
            addCriterion("net_asset_value =", value, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueNotEqualTo(BigDecimal value) {
            addCriterion("net_asset_value <>", value, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueGreaterThan(BigDecimal value) {
            addCriterion("net_asset_value >", value, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("net_asset_value >=", value, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueLessThan(BigDecimal value) {
            addCriterion("net_asset_value <", value, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("net_asset_value <=", value, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueIn(List<BigDecimal> values) {
            addCriterion("net_asset_value in", values, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueNotIn(List<BigDecimal> values) {
            addCriterion("net_asset_value not in", values, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_asset_value between", value1, value2, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_asset_value not between", value1, value2, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetIsNull() {
            addCriterion("accumulated_net is null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetIsNotNull() {
            addCriterion("accumulated_net is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetEqualTo(BigDecimal value) {
            addCriterion("accumulated_net =", value, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetNotEqualTo(BigDecimal value) {
            addCriterion("accumulated_net <>", value, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetGreaterThan(BigDecimal value) {
            addCriterion("accumulated_net >", value, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("accumulated_net >=", value, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetLessThan(BigDecimal value) {
            addCriterion("accumulated_net <", value, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("accumulated_net <=", value, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetIn(List<BigDecimal> values) {
            addCriterion("accumulated_net in", values, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetNotIn(List<BigDecimal> values) {
            addCriterion("accumulated_net not in", values, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accumulated_net between", value1, value2, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accumulated_net not between", value1, value2, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andDailyGrowRateIsNull() {
            addCriterion("daily_grow_rate is null");
            return (Criteria) this;
        }

        public Criteria andDailyGrowRateIsNotNull() {
            addCriterion("daily_grow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDailyGrowRateEqualTo(BigDecimal value) {
            addCriterion("daily_grow_rate =", value, "dailyGrowRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowRateNotEqualTo(BigDecimal value) {
            addCriterion("daily_grow_rate <>", value, "dailyGrowRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowRateGreaterThan(BigDecimal value) {
            addCriterion("daily_grow_rate >", value, "dailyGrowRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("daily_grow_rate >=", value, "dailyGrowRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowRateLessThan(BigDecimal value) {
            addCriterion("daily_grow_rate <", value, "dailyGrowRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("daily_grow_rate <=", value, "dailyGrowRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowRateIn(List<BigDecimal> values) {
            addCriterion("daily_grow_rate in", values, "dailyGrowRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowRateNotIn(List<BigDecimal> values) {
            addCriterion("daily_grow_rate not in", values, "dailyGrowRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daily_grow_rate between", value1, value2, "dailyGrowRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daily_grow_rate not between", value1, value2, "dailyGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGrowRateIsNull() {
            addCriterion("nearly_1_week_grow_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGrowRateIsNotNull() {
            addCriterion("nearly_1_week_grow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGrowRateEqualTo(BigDecimal value) {
            addCriterion("nearly_1_week_grow_rate =", value, "nearly1WeekGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGrowRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_1_week_grow_rate <>", value, "nearly1WeekGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGrowRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_1_week_grow_rate >", value, "nearly1WeekGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGrowRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_week_grow_rate >=", value, "nearly1WeekGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGrowRateLessThan(BigDecimal value) {
            addCriterion("nearly_1_week_grow_rate <", value, "nearly1WeekGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGrowRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_week_grow_rate <=", value, "nearly1WeekGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGrowRateIn(List<BigDecimal> values) {
            addCriterion("nearly_1_week_grow_rate in", values, "nearly1WeekGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGrowRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_1_week_grow_rate not in", values, "nearly1WeekGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGrowRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_week_grow_rate between", value1, value2, "nearly1WeekGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGrowRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_week_grow_rate not between", value1, value2, "nearly1WeekGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGrowRateIsNull() {
            addCriterion("nearly_1_month_grow_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGrowRateIsNotNull() {
            addCriterion("nearly_1_month_grow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGrowRateEqualTo(BigDecimal value) {
            addCriterion("nearly_1_month_grow_rate =", value, "nearly1MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGrowRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_1_month_grow_rate <>", value, "nearly1MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGrowRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_1_month_grow_rate >", value, "nearly1MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGrowRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_month_grow_rate >=", value, "nearly1MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGrowRateLessThan(BigDecimal value) {
            addCriterion("nearly_1_month_grow_rate <", value, "nearly1MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGrowRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_month_grow_rate <=", value, "nearly1MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGrowRateIn(List<BigDecimal> values) {
            addCriterion("nearly_1_month_grow_rate in", values, "nearly1MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGrowRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_1_month_grow_rate not in", values, "nearly1MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGrowRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_month_grow_rate between", value1, value2, "nearly1MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGrowRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_month_grow_rate not between", value1, value2, "nearly1MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGrowRateIsNull() {
            addCriterion("nearly_3_month_grow_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGrowRateIsNotNull() {
            addCriterion("nearly_3_month_grow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGrowRateEqualTo(BigDecimal value) {
            addCriterion("nearly_3_month_grow_rate =", value, "nearly3MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGrowRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_3_month_grow_rate <>", value, "nearly3MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGrowRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_3_month_grow_rate >", value, "nearly3MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGrowRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_3_month_grow_rate >=", value, "nearly3MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGrowRateLessThan(BigDecimal value) {
            addCriterion("nearly_3_month_grow_rate <", value, "nearly3MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGrowRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_3_month_grow_rate <=", value, "nearly3MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGrowRateIn(List<BigDecimal> values) {
            addCriterion("nearly_3_month_grow_rate in", values, "nearly3MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGrowRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_3_month_grow_rate not in", values, "nearly3MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGrowRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_3_month_grow_rate between", value1, value2, "nearly3MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGrowRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_3_month_grow_rate not between", value1, value2, "nearly3MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGrowRateIsNull() {
            addCriterion("nearly_6_month_grow_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGrowRateIsNotNull() {
            addCriterion("nearly_6_month_grow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGrowRateEqualTo(BigDecimal value) {
            addCriterion("nearly_6_month_grow_rate =", value, "nearly6MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGrowRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_6_month_grow_rate <>", value, "nearly6MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGrowRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_6_month_grow_rate >", value, "nearly6MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGrowRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_6_month_grow_rate >=", value, "nearly6MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGrowRateLessThan(BigDecimal value) {
            addCriterion("nearly_6_month_grow_rate <", value, "nearly6MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGrowRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_6_month_grow_rate <=", value, "nearly6MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGrowRateIn(List<BigDecimal> values) {
            addCriterion("nearly_6_month_grow_rate in", values, "nearly6MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGrowRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_6_month_grow_rate not in", values, "nearly6MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGrowRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_6_month_grow_rate between", value1, value2, "nearly6MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGrowRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_6_month_grow_rate not between", value1, value2, "nearly6MonthGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGrowRateIsNull() {
            addCriterion("nearly_1_year_grow_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGrowRateIsNotNull() {
            addCriterion("nearly_1_year_grow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGrowRateEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year_grow_rate =", value, "nearly1YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGrowRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year_grow_rate <>", value, "nearly1YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGrowRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_1_year_grow_rate >", value, "nearly1YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGrowRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year_grow_rate >=", value, "nearly1YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGrowRateLessThan(BigDecimal value) {
            addCriterion("nearly_1_year_grow_rate <", value, "nearly1YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGrowRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year_grow_rate <=", value, "nearly1YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGrowRateIn(List<BigDecimal> values) {
            addCriterion("nearly_1_year_grow_rate in", values, "nearly1YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGrowRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_1_year_grow_rate not in", values, "nearly1YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGrowRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_year_grow_rate between", value1, value2, "nearly1YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGrowRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_year_grow_rate not between", value1, value2, "nearly1YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGrowRateIsNull() {
            addCriterion("nearly_2_year_grow_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGrowRateIsNotNull() {
            addCriterion("nearly_2_year_grow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGrowRateEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year_grow_rate =", value, "nearly2YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGrowRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year_grow_rate <>", value, "nearly2YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGrowRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_2_year_grow_rate >", value, "nearly2YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGrowRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year_grow_rate >=", value, "nearly2YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGrowRateLessThan(BigDecimal value) {
            addCriterion("nearly_2_year_grow_rate <", value, "nearly2YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGrowRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year_grow_rate <=", value, "nearly2YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGrowRateIn(List<BigDecimal> values) {
            addCriterion("nearly_2_year_grow_rate in", values, "nearly2YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGrowRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_2_year_grow_rate not in", values, "nearly2YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGrowRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_2_year_grow_rate between", value1, value2, "nearly2YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGrowRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_2_year_grow_rate not between", value1, value2, "nearly2YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGrowRateIsNull() {
            addCriterion("nearly_3_year_grow_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGrowRateIsNotNull() {
            addCriterion("nearly_3_year_grow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGrowRateEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year_grow_rate =", value, "nearly3YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGrowRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year_grow_rate <>", value, "nearly3YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGrowRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_3_year_grow_rate >", value, "nearly3YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGrowRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year_grow_rate >=", value, "nearly3YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGrowRateLessThan(BigDecimal value) {
            addCriterion("nearly_3_year_grow_rate <", value, "nearly3YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGrowRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year_grow_rate <=", value, "nearly3YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGrowRateIn(List<BigDecimal> values) {
            addCriterion("nearly_3_year_grow_rate in", values, "nearly3YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGrowRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_3_year_grow_rate not in", values, "nearly3YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGrowRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_3_year_grow_rate between", value1, value2, "nearly3YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGrowRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_3_year_grow_rate not between", value1, value2, "nearly3YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly5YearGrowRateIsNull() {
            addCriterion("nearly_5_year_grow_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly5YearGrowRateIsNotNull() {
            addCriterion("nearly_5_year_grow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly5YearGrowRateEqualTo(BigDecimal value) {
            addCriterion("nearly_5_year_grow_rate =", value, "nearly5YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly5YearGrowRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_5_year_grow_rate <>", value, "nearly5YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly5YearGrowRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_5_year_grow_rate >", value, "nearly5YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly5YearGrowRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_5_year_grow_rate >=", value, "nearly5YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly5YearGrowRateLessThan(BigDecimal value) {
            addCriterion("nearly_5_year_grow_rate <", value, "nearly5YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly5YearGrowRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_5_year_grow_rate <=", value, "nearly5YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly5YearGrowRateIn(List<BigDecimal> values) {
            addCriterion("nearly_5_year_grow_rate in", values, "nearly5YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly5YearGrowRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_5_year_grow_rate not in", values, "nearly5YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly5YearGrowRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_5_year_grow_rate between", value1, value2, "nearly5YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly5YearGrowRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_5_year_grow_rate not between", value1, value2, "nearly5YearGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGrowRateIsNull() {
            addCriterion("since_this_year_grow_rate is null");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGrowRateIsNotNull() {
            addCriterion("since_this_year_grow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGrowRateEqualTo(BigDecimal value) {
            addCriterion("since_this_year_grow_rate =", value, "sinceThisYearGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGrowRateNotEqualTo(BigDecimal value) {
            addCriterion("since_this_year_grow_rate <>", value, "sinceThisYearGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGrowRateGreaterThan(BigDecimal value) {
            addCriterion("since_this_year_grow_rate >", value, "sinceThisYearGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGrowRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("since_this_year_grow_rate >=", value, "sinceThisYearGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGrowRateLessThan(BigDecimal value) {
            addCriterion("since_this_year_grow_rate <", value, "sinceThisYearGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGrowRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("since_this_year_grow_rate <=", value, "sinceThisYearGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGrowRateIn(List<BigDecimal> values) {
            addCriterion("since_this_year_grow_rate in", values, "sinceThisYearGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGrowRateNotIn(List<BigDecimal> values) {
            addCriterion("since_this_year_grow_rate not in", values, "sinceThisYearGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGrowRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("since_this_year_grow_rate between", value1, value2, "sinceThisYearGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGrowRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("since_this_year_grow_rate not between", value1, value2, "sinceThisYearGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGrowRateIsNull() {
            addCriterion("since_establish_grow_rate is null");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGrowRateIsNotNull() {
            addCriterion("since_establish_grow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGrowRateEqualTo(BigDecimal value) {
            addCriterion("since_establish_grow_rate =", value, "sinceEstablishGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGrowRateNotEqualTo(BigDecimal value) {
            addCriterion("since_establish_grow_rate <>", value, "sinceEstablishGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGrowRateGreaterThan(BigDecimal value) {
            addCriterion("since_establish_grow_rate >", value, "sinceEstablishGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGrowRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("since_establish_grow_rate >=", value, "sinceEstablishGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGrowRateLessThan(BigDecimal value) {
            addCriterion("since_establish_grow_rate <", value, "sinceEstablishGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGrowRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("since_establish_grow_rate <=", value, "sinceEstablishGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGrowRateIn(List<BigDecimal> values) {
            addCriterion("since_establish_grow_rate in", values, "sinceEstablishGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGrowRateNotIn(List<BigDecimal> values) {
            addCriterion("since_establish_grow_rate not in", values, "sinceEstablishGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGrowRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("since_establish_grow_rate between", value1, value2, "sinceEstablishGrowRate");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGrowRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("since_establish_grow_rate not between", value1, value2, "sinceEstablishGrowRate");
            return (Criteria) this;
        }

        public Criteria andCustomGrowRateIsNull() {
            addCriterion("custom_grow_rate is null");
            return (Criteria) this;
        }

        public Criteria andCustomGrowRateIsNotNull() {
            addCriterion("custom_grow_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCustomGrowRateEqualTo(BigDecimal value) {
            addCriterion("custom_grow_rate =", value, "customGrowRate");
            return (Criteria) this;
        }

        public Criteria andCustomGrowRateNotEqualTo(BigDecimal value) {
            addCriterion("custom_grow_rate <>", value, "customGrowRate");
            return (Criteria) this;
        }

        public Criteria andCustomGrowRateGreaterThan(BigDecimal value) {
            addCriterion("custom_grow_rate >", value, "customGrowRate");
            return (Criteria) this;
        }

        public Criteria andCustomGrowRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("custom_grow_rate >=", value, "customGrowRate");
            return (Criteria) this;
        }

        public Criteria andCustomGrowRateLessThan(BigDecimal value) {
            addCriterion("custom_grow_rate <", value, "customGrowRate");
            return (Criteria) this;
        }

        public Criteria andCustomGrowRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("custom_grow_rate <=", value, "customGrowRate");
            return (Criteria) this;
        }

        public Criteria andCustomGrowRateIn(List<BigDecimal> values) {
            addCriterion("custom_grow_rate in", values, "customGrowRate");
            return (Criteria) this;
        }

        public Criteria andCustomGrowRateNotIn(List<BigDecimal> values) {
            addCriterion("custom_grow_rate not in", values, "customGrowRate");
            return (Criteria) this;
        }

        public Criteria andCustomGrowRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custom_grow_rate between", value1, value2, "customGrowRate");
            return (Criteria) this;
        }

        public Criteria andCustomGrowRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custom_grow_rate not between", value1, value2, "customGrowRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearWaveRateIsNull() {
            addCriterion("nearly_1_year_wave_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly1YearWaveRateIsNotNull() {
            addCriterion("nearly_1_year_wave_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly1YearWaveRateEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year_wave_rate =", value, "nearly1YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearWaveRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year_wave_rate <>", value, "nearly1YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearWaveRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_1_year_wave_rate >", value, "nearly1YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearWaveRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year_wave_rate >=", value, "nearly1YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearWaveRateLessThan(BigDecimal value) {
            addCriterion("nearly_1_year_wave_rate <", value, "nearly1YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearWaveRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year_wave_rate <=", value, "nearly1YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearWaveRateIn(List<BigDecimal> values) {
            addCriterion("nearly_1_year_wave_rate in", values, "nearly1YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearWaveRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_1_year_wave_rate not in", values, "nearly1YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearWaveRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_year_wave_rate between", value1, value2, "nearly1YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearWaveRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_year_wave_rate not between", value1, value2, "nearly1YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearWaveRateIsNull() {
            addCriterion("nearly_2_year_wave_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly2YearWaveRateIsNotNull() {
            addCriterion("nearly_2_year_wave_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly2YearWaveRateEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year_wave_rate =", value, "nearly2YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearWaveRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year_wave_rate <>", value, "nearly2YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearWaveRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_2_year_wave_rate >", value, "nearly2YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearWaveRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year_wave_rate >=", value, "nearly2YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearWaveRateLessThan(BigDecimal value) {
            addCriterion("nearly_2_year_wave_rate <", value, "nearly2YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearWaveRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year_wave_rate <=", value, "nearly2YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearWaveRateIn(List<BigDecimal> values) {
            addCriterion("nearly_2_year_wave_rate in", values, "nearly2YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearWaveRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_2_year_wave_rate not in", values, "nearly2YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearWaveRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_2_year_wave_rate between", value1, value2, "nearly2YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearWaveRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_2_year_wave_rate not between", value1, value2, "nearly2YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearWaveRateIsNull() {
            addCriterion("nearly_3_year_wave_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly3YearWaveRateIsNotNull() {
            addCriterion("nearly_3_year_wave_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly3YearWaveRateEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year_wave_rate =", value, "nearly3YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearWaveRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year_wave_rate <>", value, "nearly3YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearWaveRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_3_year_wave_rate >", value, "nearly3YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearWaveRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year_wave_rate >=", value, "nearly3YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearWaveRateLessThan(BigDecimal value) {
            addCriterion("nearly_3_year_wave_rate <", value, "nearly3YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearWaveRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year_wave_rate <=", value, "nearly3YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearWaveRateIn(List<BigDecimal> values) {
            addCriterion("nearly_3_year_wave_rate in", values, "nearly3YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearWaveRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_3_year_wave_rate not in", values, "nearly3YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearWaveRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_3_year_wave_rate between", value1, value2, "nearly3YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearWaveRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_3_year_wave_rate not between", value1, value2, "nearly3YearWaveRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearSharpRateIsNull() {
            addCriterion("nearly_1_year_sharp_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly1YearSharpRateIsNotNull() {
            addCriterion("nearly_1_year_sharp_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly1YearSharpRateEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year_sharp_rate =", value, "nearly1YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearSharpRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year_sharp_rate <>", value, "nearly1YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearSharpRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_1_year_sharp_rate >", value, "nearly1YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearSharpRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year_sharp_rate >=", value, "nearly1YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearSharpRateLessThan(BigDecimal value) {
            addCriterion("nearly_1_year_sharp_rate <", value, "nearly1YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearSharpRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year_sharp_rate <=", value, "nearly1YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearSharpRateIn(List<BigDecimal> values) {
            addCriterion("nearly_1_year_sharp_rate in", values, "nearly1YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearSharpRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_1_year_sharp_rate not in", values, "nearly1YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearSharpRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_year_sharp_rate between", value1, value2, "nearly1YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly1YearSharpRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_year_sharp_rate not between", value1, value2, "nearly1YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearSharpRateIsNull() {
            addCriterion("nearly_2_year_sharp_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly2YearSharpRateIsNotNull() {
            addCriterion("nearly_2_year_sharp_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly2YearSharpRateEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year_sharp_rate =", value, "nearly2YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearSharpRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year_sharp_rate <>", value, "nearly2YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearSharpRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_2_year_sharp_rate >", value, "nearly2YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearSharpRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year_sharp_rate >=", value, "nearly2YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearSharpRateLessThan(BigDecimal value) {
            addCriterion("nearly_2_year_sharp_rate <", value, "nearly2YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearSharpRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year_sharp_rate <=", value, "nearly2YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearSharpRateIn(List<BigDecimal> values) {
            addCriterion("nearly_2_year_sharp_rate in", values, "nearly2YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearSharpRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_2_year_sharp_rate not in", values, "nearly2YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearSharpRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_2_year_sharp_rate between", value1, value2, "nearly2YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly2YearSharpRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_2_year_sharp_rate not between", value1, value2, "nearly2YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearSharpRateIsNull() {
            addCriterion("nearly_3_year_sharp_rate is null");
            return (Criteria) this;
        }

        public Criteria andNearly3YearSharpRateIsNotNull() {
            addCriterion("nearly_3_year_sharp_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNearly3YearSharpRateEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year_sharp_rate =", value, "nearly3YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearSharpRateNotEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year_sharp_rate <>", value, "nearly3YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearSharpRateGreaterThan(BigDecimal value) {
            addCriterion("nearly_3_year_sharp_rate >", value, "nearly3YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearSharpRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year_sharp_rate >=", value, "nearly3YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearSharpRateLessThan(BigDecimal value) {
            addCriterion("nearly_3_year_sharp_rate <", value, "nearly3YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearSharpRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year_sharp_rate <=", value, "nearly3YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearSharpRateIn(List<BigDecimal> values) {
            addCriterion("nearly_3_year_sharp_rate in", values, "nearly3YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearSharpRateNotIn(List<BigDecimal> values) {
            addCriterion("nearly_3_year_sharp_rate not in", values, "nearly3YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearSharpRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_3_year_sharp_rate between", value1, value2, "nearly3YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andNearly3YearSharpRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_3_year_sharp_rate not between", value1, value2, "nearly3YearSharpRate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIsNull() {
            addCriterion("establish_date is null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIsNotNull() {
            addCriterion("establish_date is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateEqualTo(Date value) {
            addCriterionForJDBCDate("establish_date =", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("establish_date <>", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("establish_date >", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("establish_date >=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThan(Date value) {
            addCriterionForJDBCDate("establish_date <", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("establish_date <=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIn(List<Date> values) {
            addCriterionForJDBCDate("establish_date in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("establish_date not in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("establish_date between", value1, value2, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("establish_date not between", value1, value2, "establishDate");
            return (Criteria) this;
        }

        public Criteria andFundManagerIsNull() {
            addCriterion("fund_manager is null");
            return (Criteria) this;
        }

        public Criteria andFundManagerIsNotNull() {
            addCriterion("fund_manager is not null");
            return (Criteria) this;
        }

        public Criteria andFundManagerEqualTo(String value) {
            addCriterion("fund_manager =", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotEqualTo(String value) {
            addCriterion("fund_manager <>", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerGreaterThan(String value) {
            addCriterion("fund_manager >", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerGreaterThanOrEqualTo(String value) {
            addCriterion("fund_manager >=", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerLessThan(String value) {
            addCriterion("fund_manager <", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerLessThanOrEqualTo(String value) {
            addCriterion("fund_manager <=", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerLike(String value) {
            addCriterion("fund_manager like", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotLike(String value) {
            addCriterion("fund_manager not like", value, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerIn(List<String> values) {
            addCriterion("fund_manager in", values, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotIn(List<String> values) {
            addCriterion("fund_manager not in", values, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerBetween(String value1, String value2) {
            addCriterion("fund_manager between", value1, value2, "fundManager");
            return (Criteria) this;
        }

        public Criteria andFundManagerNotBetween(String value1, String value2) {
            addCriterion("fund_manager not between", value1, value2, "fundManager");
            return (Criteria) this;
        }

        public Criteria andManagerStartDateIsNull() {
            addCriterion("manager_start_date is null");
            return (Criteria) this;
        }

        public Criteria andManagerStartDateIsNotNull() {
            addCriterion("manager_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andManagerStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("manager_start_date =", value, "managerStartDate");
            return (Criteria) this;
        }

        public Criteria andManagerStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("manager_start_date <>", value, "managerStartDate");
            return (Criteria) this;
        }

        public Criteria andManagerStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("manager_start_date >", value, "managerStartDate");
            return (Criteria) this;
        }

        public Criteria andManagerStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("manager_start_date >=", value, "managerStartDate");
            return (Criteria) this;
        }

        public Criteria andManagerStartDateLessThan(Date value) {
            addCriterionForJDBCDate("manager_start_date <", value, "managerStartDate");
            return (Criteria) this;
        }

        public Criteria andManagerStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("manager_start_date <=", value, "managerStartDate");
            return (Criteria) this;
        }

        public Criteria andManagerStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("manager_start_date in", values, "managerStartDate");
            return (Criteria) this;
        }

        public Criteria andManagerStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("manager_start_date not in", values, "managerStartDate");
            return (Criteria) this;
        }

        public Criteria andManagerStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("manager_start_date between", value1, value2, "managerStartDate");
            return (Criteria) this;
        }

        public Criteria andManagerStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("manager_start_date not between", value1, value2, "managerStartDate");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerIsNull() {
            addCriterion("previous_fund_manager is null");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerIsNotNull() {
            addCriterion("previous_fund_manager is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerEqualTo(String value) {
            addCriterion("previous_fund_manager =", value, "previousFundManager");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerNotEqualTo(String value) {
            addCriterion("previous_fund_manager <>", value, "previousFundManager");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerGreaterThan(String value) {
            addCriterion("previous_fund_manager >", value, "previousFundManager");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerGreaterThanOrEqualTo(String value) {
            addCriterion("previous_fund_manager >=", value, "previousFundManager");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerLessThan(String value) {
            addCriterion("previous_fund_manager <", value, "previousFundManager");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerLessThanOrEqualTo(String value) {
            addCriterion("previous_fund_manager <=", value, "previousFundManager");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerLike(String value) {
            addCriterion("previous_fund_manager like", value, "previousFundManager");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerNotLike(String value) {
            addCriterion("previous_fund_manager not like", value, "previousFundManager");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerIn(List<String> values) {
            addCriterion("previous_fund_manager in", values, "previousFundManager");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerNotIn(List<String> values) {
            addCriterion("previous_fund_manager not in", values, "previousFundManager");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerBetween(String value1, String value2) {
            addCriterion("previous_fund_manager between", value1, value2, "previousFundManager");
            return (Criteria) this;
        }

        public Criteria andPreviousFundManagerNotBetween(String value1, String value2) {
            addCriterion("previous_fund_manager not between", value1, value2, "previousFundManager");
            return (Criteria) this;
        }

        public Criteria andPreviousManagerStartDateIsNull() {
            addCriterion("previous_manager_start_date is null");
            return (Criteria) this;
        }

        public Criteria andPreviousManagerStartDateIsNotNull() {
            addCriterion("previous_manager_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousManagerStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("previous_manager_start_date =", value, "previousManagerStartDate");
            return (Criteria) this;
        }

        public Criteria andPreviousManagerStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("previous_manager_start_date <>", value, "previousManagerStartDate");
            return (Criteria) this;
        }

        public Criteria andPreviousManagerStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("previous_manager_start_date >", value, "previousManagerStartDate");
            return (Criteria) this;
        }

        public Criteria andPreviousManagerStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("previous_manager_start_date >=", value, "previousManagerStartDate");
            return (Criteria) this;
        }

        public Criteria andPreviousManagerStartDateLessThan(Date value) {
            addCriterionForJDBCDate("previous_manager_start_date <", value, "previousManagerStartDate");
            return (Criteria) this;
        }

        public Criteria andPreviousManagerStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("previous_manager_start_date <=", value, "previousManagerStartDate");
            return (Criteria) this;
        }

        public Criteria andPreviousManagerStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("previous_manager_start_date in", values, "previousManagerStartDate");
            return (Criteria) this;
        }

        public Criteria andPreviousManagerStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("previous_manager_start_date not in", values, "previousManagerStartDate");
            return (Criteria) this;
        }

        public Criteria andPreviousManagerStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("previous_manager_start_date between", value1, value2, "previousManagerStartDate");
            return (Criteria) this;
        }

        public Criteria andPreviousManagerStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("previous_manager_start_date not between", value1, value2, "previousManagerStartDate");
            return (Criteria) this;
        }

        public Criteria andLockPeriodIsNull() {
            addCriterion("lock_period is null");
            return (Criteria) this;
        }

        public Criteria andLockPeriodIsNotNull() {
            addCriterion("lock_period is not null");
            return (Criteria) this;
        }

        public Criteria andLockPeriodEqualTo(BigDecimal value) {
            addCriterion("lock_period =", value, "lockPeriod");
            return (Criteria) this;
        }

        public Criteria andLockPeriodNotEqualTo(BigDecimal value) {
            addCriterion("lock_period <>", value, "lockPeriod");
            return (Criteria) this;
        }

        public Criteria andLockPeriodGreaterThan(BigDecimal value) {
            addCriterion("lock_period >", value, "lockPeriod");
            return (Criteria) this;
        }

        public Criteria andLockPeriodGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lock_period >=", value, "lockPeriod");
            return (Criteria) this;
        }

        public Criteria andLockPeriodLessThan(BigDecimal value) {
            addCriterion("lock_period <", value, "lockPeriod");
            return (Criteria) this;
        }

        public Criteria andLockPeriodLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lock_period <=", value, "lockPeriod");
            return (Criteria) this;
        }

        public Criteria andLockPeriodIn(List<BigDecimal> values) {
            addCriterion("lock_period in", values, "lockPeriod");
            return (Criteria) this;
        }

        public Criteria andLockPeriodNotIn(List<BigDecimal> values) {
            addCriterion("lock_period not in", values, "lockPeriod");
            return (Criteria) this;
        }

        public Criteria andLockPeriodBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lock_period between", value1, value2, "lockPeriod");
            return (Criteria) this;
        }

        public Criteria andLockPeriodNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lock_period not between", value1, value2, "lockPeriod");
            return (Criteria) this;
        }

        public Criteria andServiceChargeRateIsNull() {
            addCriterion("service_charge_rate is null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeRateIsNotNull() {
            addCriterion("service_charge_rate is not null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeRateEqualTo(BigDecimal value) {
            addCriterion("service_charge_rate =", value, "serviceChargeRate");
            return (Criteria) this;
        }

        public Criteria andServiceChargeRateNotEqualTo(BigDecimal value) {
            addCriterion("service_charge_rate <>", value, "serviceChargeRate");
            return (Criteria) this;
        }

        public Criteria andServiceChargeRateGreaterThan(BigDecimal value) {
            addCriterion("service_charge_rate >", value, "serviceChargeRate");
            return (Criteria) this;
        }

        public Criteria andServiceChargeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_charge_rate >=", value, "serviceChargeRate");
            return (Criteria) this;
        }

        public Criteria andServiceChargeRateLessThan(BigDecimal value) {
            addCriterion("service_charge_rate <", value, "serviceChargeRate");
            return (Criteria) this;
        }

        public Criteria andServiceChargeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_charge_rate <=", value, "serviceChargeRate");
            return (Criteria) this;
        }

        public Criteria andServiceChargeRateIn(List<BigDecimal> values) {
            addCriterion("service_charge_rate in", values, "serviceChargeRate");
            return (Criteria) this;
        }

        public Criteria andServiceChargeRateNotIn(List<BigDecimal> values) {
            addCriterion("service_charge_rate not in", values, "serviceChargeRate");
            return (Criteria) this;
        }

        public Criteria andServiceChargeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_charge_rate between", value1, value2, "serviceChargeRate");
            return (Criteria) this;
        }

        public Criteria andServiceChargeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_charge_rate not between", value1, value2, "serviceChargeRate");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeRateIsNull() {
            addCriterion("discount_service_charge_rate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeRateIsNotNull() {
            addCriterion("discount_service_charge_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeRateEqualTo(BigDecimal value) {
            addCriterion("discount_service_charge_rate =", value, "discountServiceChargeRate");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeRateNotEqualTo(BigDecimal value) {
            addCriterion("discount_service_charge_rate <>", value, "discountServiceChargeRate");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeRateGreaterThan(BigDecimal value) {
            addCriterion("discount_service_charge_rate >", value, "discountServiceChargeRate");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_service_charge_rate >=", value, "discountServiceChargeRate");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeRateLessThan(BigDecimal value) {
            addCriterion("discount_service_charge_rate <", value, "discountServiceChargeRate");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_service_charge_rate <=", value, "discountServiceChargeRate");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeRateIn(List<BigDecimal> values) {
            addCriterion("discount_service_charge_rate in", values, "discountServiceChargeRate");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeRateNotIn(List<BigDecimal> values) {
            addCriterion("discount_service_charge_rate not in", values, "discountServiceChargeRate");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_service_charge_rate between", value1, value2, "discountServiceChargeRate");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_service_charge_rate not between", value1, value2, "discountServiceChargeRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNull() {
            addCriterion("discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNotNull() {
            addCriterion("discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateEqualTo(BigDecimal value) {
            addCriterion("discount_rate =", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotEqualTo(BigDecimal value) {
            addCriterion("discount_rate <>", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThan(BigDecimal value) {
            addCriterion("discount_rate >", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_rate >=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThan(BigDecimal value) {
            addCriterion("discount_rate <", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_rate <=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIn(List<BigDecimal> values) {
            addCriterion("discount_rate in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotIn(List<BigDecimal> values) {
            addCriterion("discount_rate not in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_rate between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_rate not between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}