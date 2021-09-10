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

        public Criteria andNearly1WeekIsNull() {
            addCriterion("nearly_1_week is null");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekIsNotNull() {
            addCriterion("nearly_1_week is not null");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekEqualTo(BigDecimal value) {
            addCriterion("nearly_1_week =", value, "nearly1Week");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekNotEqualTo(BigDecimal value) {
            addCriterion("nearly_1_week <>", value, "nearly1Week");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGreaterThan(BigDecimal value) {
            addCriterion("nearly_1_week >", value, "nearly1Week");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_week >=", value, "nearly1Week");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekLessThan(BigDecimal value) {
            addCriterion("nearly_1_week <", value, "nearly1Week");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_week <=", value, "nearly1Week");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekIn(List<BigDecimal> values) {
            addCriterion("nearly_1_week in", values, "nearly1Week");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekNotIn(List<BigDecimal> values) {
            addCriterion("nearly_1_week not in", values, "nearly1Week");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_week between", value1, value2, "nearly1Week");
            return (Criteria) this;
        }

        public Criteria andNearly1WeekNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_week not between", value1, value2, "nearly1Week");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthIsNull() {
            addCriterion("nearly_1_month is null");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthIsNotNull() {
            addCriterion("nearly_1_month is not null");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthEqualTo(BigDecimal value) {
            addCriterion("nearly_1_month =", value, "nearly1Month");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthNotEqualTo(BigDecimal value) {
            addCriterion("nearly_1_month <>", value, "nearly1Month");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGreaterThan(BigDecimal value) {
            addCriterion("nearly_1_month >", value, "nearly1Month");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_month >=", value, "nearly1Month");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthLessThan(BigDecimal value) {
            addCriterion("nearly_1_month <", value, "nearly1Month");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_month <=", value, "nearly1Month");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthIn(List<BigDecimal> values) {
            addCriterion("nearly_1_month in", values, "nearly1Month");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthNotIn(List<BigDecimal> values) {
            addCriterion("nearly_1_month not in", values, "nearly1Month");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_month between", value1, value2, "nearly1Month");
            return (Criteria) this;
        }

        public Criteria andNearly1MonthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_month not between", value1, value2, "nearly1Month");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthIsNull() {
            addCriterion("nearly_3_month is null");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthIsNotNull() {
            addCriterion("nearly_3_month is not null");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthEqualTo(BigDecimal value) {
            addCriterion("nearly_3_month =", value, "nearly3Month");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthNotEqualTo(BigDecimal value) {
            addCriterion("nearly_3_month <>", value, "nearly3Month");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGreaterThan(BigDecimal value) {
            addCriterion("nearly_3_month >", value, "nearly3Month");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_3_month >=", value, "nearly3Month");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthLessThan(BigDecimal value) {
            addCriterion("nearly_3_month <", value, "nearly3Month");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_3_month <=", value, "nearly3Month");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthIn(List<BigDecimal> values) {
            addCriterion("nearly_3_month in", values, "nearly3Month");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthNotIn(List<BigDecimal> values) {
            addCriterion("nearly_3_month not in", values, "nearly3Month");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_3_month between", value1, value2, "nearly3Month");
            return (Criteria) this;
        }

        public Criteria andNearly3MonthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_3_month not between", value1, value2, "nearly3Month");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthIsNull() {
            addCriterion("nearly_6_month is null");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthIsNotNull() {
            addCriterion("nearly_6_month is not null");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthEqualTo(BigDecimal value) {
            addCriterion("nearly_6_month =", value, "nearly6Month");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthNotEqualTo(BigDecimal value) {
            addCriterion("nearly_6_month <>", value, "nearly6Month");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGreaterThan(BigDecimal value) {
            addCriterion("nearly_6_month >", value, "nearly6Month");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_6_month >=", value, "nearly6Month");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthLessThan(BigDecimal value) {
            addCriterion("nearly_6_month <", value, "nearly6Month");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_6_month <=", value, "nearly6Month");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthIn(List<BigDecimal> values) {
            addCriterion("nearly_6_month in", values, "nearly6Month");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthNotIn(List<BigDecimal> values) {
            addCriterion("nearly_6_month not in", values, "nearly6Month");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_6_month between", value1, value2, "nearly6Month");
            return (Criteria) this;
        }

        public Criteria andNearly6MonthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_6_month not between", value1, value2, "nearly6Month");
            return (Criteria) this;
        }

        public Criteria andNearly1YearIsNull() {
            addCriterion("nearly_1_year is null");
            return (Criteria) this;
        }

        public Criteria andNearly1YearIsNotNull() {
            addCriterion("nearly_1_year is not null");
            return (Criteria) this;
        }

        public Criteria andNearly1YearEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year =", value, "nearly1Year");
            return (Criteria) this;
        }

        public Criteria andNearly1YearNotEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year <>", value, "nearly1Year");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGreaterThan(BigDecimal value) {
            addCriterion("nearly_1_year >", value, "nearly1Year");
            return (Criteria) this;
        }

        public Criteria andNearly1YearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year >=", value, "nearly1Year");
            return (Criteria) this;
        }

        public Criteria andNearly1YearLessThan(BigDecimal value) {
            addCriterion("nearly_1_year <", value, "nearly1Year");
            return (Criteria) this;
        }

        public Criteria andNearly1YearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_1_year <=", value, "nearly1Year");
            return (Criteria) this;
        }

        public Criteria andNearly1YearIn(List<BigDecimal> values) {
            addCriterion("nearly_1_year in", values, "nearly1Year");
            return (Criteria) this;
        }

        public Criteria andNearly1YearNotIn(List<BigDecimal> values) {
            addCriterion("nearly_1_year not in", values, "nearly1Year");
            return (Criteria) this;
        }

        public Criteria andNearly1YearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_year between", value1, value2, "nearly1Year");
            return (Criteria) this;
        }

        public Criteria andNearly1YearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_1_year not between", value1, value2, "nearly1Year");
            return (Criteria) this;
        }

        public Criteria andNearly2YearIsNull() {
            addCriterion("nearly_2_year is null");
            return (Criteria) this;
        }

        public Criteria andNearly2YearIsNotNull() {
            addCriterion("nearly_2_year is not null");
            return (Criteria) this;
        }

        public Criteria andNearly2YearEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year =", value, "nearly2Year");
            return (Criteria) this;
        }

        public Criteria andNearly2YearNotEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year <>", value, "nearly2Year");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGreaterThan(BigDecimal value) {
            addCriterion("nearly_2_year >", value, "nearly2Year");
            return (Criteria) this;
        }

        public Criteria andNearly2YearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year >=", value, "nearly2Year");
            return (Criteria) this;
        }

        public Criteria andNearly2YearLessThan(BigDecimal value) {
            addCriterion("nearly_2_year <", value, "nearly2Year");
            return (Criteria) this;
        }

        public Criteria andNearly2YearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_2_year <=", value, "nearly2Year");
            return (Criteria) this;
        }

        public Criteria andNearly2YearIn(List<BigDecimal> values) {
            addCriterion("nearly_2_year in", values, "nearly2Year");
            return (Criteria) this;
        }

        public Criteria andNearly2YearNotIn(List<BigDecimal> values) {
            addCriterion("nearly_2_year not in", values, "nearly2Year");
            return (Criteria) this;
        }

        public Criteria andNearly2YearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_2_year between", value1, value2, "nearly2Year");
            return (Criteria) this;
        }

        public Criteria andNearly2YearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_2_year not between", value1, value2, "nearly2Year");
            return (Criteria) this;
        }

        public Criteria andNearly3YearIsNull() {
            addCriterion("nearly_3_year is null");
            return (Criteria) this;
        }

        public Criteria andNearly3YearIsNotNull() {
            addCriterion("nearly_3_year is not null");
            return (Criteria) this;
        }

        public Criteria andNearly3YearEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year =", value, "nearly3Year");
            return (Criteria) this;
        }

        public Criteria andNearly3YearNotEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year <>", value, "nearly3Year");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGreaterThan(BigDecimal value) {
            addCriterion("nearly_3_year >", value, "nearly3Year");
            return (Criteria) this;
        }

        public Criteria andNearly3YearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year >=", value, "nearly3Year");
            return (Criteria) this;
        }

        public Criteria andNearly3YearLessThan(BigDecimal value) {
            addCriterion("nearly_3_year <", value, "nearly3Year");
            return (Criteria) this;
        }

        public Criteria andNearly3YearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nearly_3_year <=", value, "nearly3Year");
            return (Criteria) this;
        }

        public Criteria andNearly3YearIn(List<BigDecimal> values) {
            addCriterion("nearly_3_year in", values, "nearly3Year");
            return (Criteria) this;
        }

        public Criteria andNearly3YearNotIn(List<BigDecimal> values) {
            addCriterion("nearly_3_year not in", values, "nearly3Year");
            return (Criteria) this;
        }

        public Criteria andNearly3YearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_3_year between", value1, value2, "nearly3Year");
            return (Criteria) this;
        }

        public Criteria andNearly3YearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nearly_3_year not between", value1, value2, "nearly3Year");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearIsNull() {
            addCriterion("since_this_year is null");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearIsNotNull() {
            addCriterion("since_this_year is not null");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearEqualTo(BigDecimal value) {
            addCriterion("since_this_year =", value, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearNotEqualTo(BigDecimal value) {
            addCriterion("since_this_year <>", value, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGreaterThan(BigDecimal value) {
            addCriterion("since_this_year >", value, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("since_this_year >=", value, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearLessThan(BigDecimal value) {
            addCriterion("since_this_year <", value, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("since_this_year <=", value, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearIn(List<BigDecimal> values) {
            addCriterion("since_this_year in", values, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearNotIn(List<BigDecimal> values) {
            addCriterion("since_this_year not in", values, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("since_this_year between", value1, value2, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("since_this_year not between", value1, value2, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishIsNull() {
            addCriterion("since_establish is null");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishIsNotNull() {
            addCriterion("since_establish is not null");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishEqualTo(BigDecimal value) {
            addCriterion("since_establish =", value, "sinceEstablish");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishNotEqualTo(BigDecimal value) {
            addCriterion("since_establish <>", value, "sinceEstablish");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGreaterThan(BigDecimal value) {
            addCriterion("since_establish >", value, "sinceEstablish");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("since_establish >=", value, "sinceEstablish");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishLessThan(BigDecimal value) {
            addCriterion("since_establish <", value, "sinceEstablish");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishLessThanOrEqualTo(BigDecimal value) {
            addCriterion("since_establish <=", value, "sinceEstablish");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishIn(List<BigDecimal> values) {
            addCriterion("since_establish in", values, "sinceEstablish");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishNotIn(List<BigDecimal> values) {
            addCriterion("since_establish not in", values, "sinceEstablish");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("since_establish between", value1, value2, "sinceEstablish");
            return (Criteria) this;
        }

        public Criteria andSinceEstablishNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("since_establish not between", value1, value2, "sinceEstablish");
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

        public Criteria andUnknown1IsNull() {
            addCriterion("unknown_1 is null");
            return (Criteria) this;
        }

        public Criteria andUnknown1IsNotNull() {
            addCriterion("unknown_1 is not null");
            return (Criteria) this;
        }

        public Criteria andUnknown1EqualTo(Integer value) {
            addCriterion("unknown_1 =", value, "unknown1");
            return (Criteria) this;
        }

        public Criteria andUnknown1NotEqualTo(Integer value) {
            addCriterion("unknown_1 <>", value, "unknown1");
            return (Criteria) this;
        }

        public Criteria andUnknown1GreaterThan(Integer value) {
            addCriterion("unknown_1 >", value, "unknown1");
            return (Criteria) this;
        }

        public Criteria andUnknown1GreaterThanOrEqualTo(Integer value) {
            addCriterion("unknown_1 >=", value, "unknown1");
            return (Criteria) this;
        }

        public Criteria andUnknown1LessThan(Integer value) {
            addCriterion("unknown_1 <", value, "unknown1");
            return (Criteria) this;
        }

        public Criteria andUnknown1LessThanOrEqualTo(Integer value) {
            addCriterion("unknown_1 <=", value, "unknown1");
            return (Criteria) this;
        }

        public Criteria andUnknown1In(List<Integer> values) {
            addCriterion("unknown_1 in", values, "unknown1");
            return (Criteria) this;
        }

        public Criteria andUnknown1NotIn(List<Integer> values) {
            addCriterion("unknown_1 not in", values, "unknown1");
            return (Criteria) this;
        }

        public Criteria andUnknown1Between(Integer value1, Integer value2) {
            addCriterion("unknown_1 between", value1, value2, "unknown1");
            return (Criteria) this;
        }

        public Criteria andUnknown1NotBetween(Integer value1, Integer value2) {
            addCriterion("unknown_1 not between", value1, value2, "unknown1");
            return (Criteria) this;
        }

        public Criteria andCustomIsNull() {
            addCriterion("custom is null");
            return (Criteria) this;
        }

        public Criteria andCustomIsNotNull() {
            addCriterion("custom is not null");
            return (Criteria) this;
        }

        public Criteria andCustomEqualTo(BigDecimal value) {
            addCriterion("custom =", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotEqualTo(BigDecimal value) {
            addCriterion("custom <>", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomGreaterThan(BigDecimal value) {
            addCriterion("custom >", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("custom >=", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomLessThan(BigDecimal value) {
            addCriterion("custom <", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomLessThanOrEqualTo(BigDecimal value) {
            addCriterion("custom <=", value, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomIn(List<BigDecimal> values) {
            addCriterion("custom in", values, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotIn(List<BigDecimal> values) {
            addCriterion("custom not in", values, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custom between", value1, value2, "custom");
            return (Criteria) this;
        }

        public Criteria andCustomNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custom not between", value1, value2, "custom");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNull() {
            addCriterion("service_charge is null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNotNull() {
            addCriterion("service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeEqualTo(BigDecimal value) {
            addCriterion("service_charge =", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotEqualTo(BigDecimal value) {
            addCriterion("service_charge <>", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThan(BigDecimal value) {
            addCriterion("service_charge >", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_charge >=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThan(BigDecimal value) {
            addCriterion("service_charge <", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_charge <=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIn(List<BigDecimal> values) {
            addCriterion("service_charge in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotIn(List<BigDecimal> values) {
            addCriterion("service_charge not in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_charge between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_charge not between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeIsNull() {
            addCriterion("discount_service_charge is null");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeIsNotNull() {
            addCriterion("discount_service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeEqualTo(BigDecimal value) {
            addCriterion("discount_service_charge =", value, "discountServiceCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeNotEqualTo(BigDecimal value) {
            addCriterion("discount_service_charge <>", value, "discountServiceCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeGreaterThan(BigDecimal value) {
            addCriterion("discount_service_charge >", value, "discountServiceCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_service_charge >=", value, "discountServiceCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeLessThan(BigDecimal value) {
            addCriterion("discount_service_charge <", value, "discountServiceCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_service_charge <=", value, "discountServiceCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeIn(List<BigDecimal> values) {
            addCriterion("discount_service_charge in", values, "discountServiceCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeNotIn(List<BigDecimal> values) {
            addCriterion("discount_service_charge not in", values, "discountServiceCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_service_charge between", value1, value2, "discountServiceCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountServiceChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_service_charge not between", value1, value2, "discountServiceCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andUnknown2IsNull() {
            addCriterion("unknown_2 is null");
            return (Criteria) this;
        }

        public Criteria andUnknown2IsNotNull() {
            addCriterion("unknown_2 is not null");
            return (Criteria) this;
        }

        public Criteria andUnknown2EqualTo(BigDecimal value) {
            addCriterion("unknown_2 =", value, "unknown2");
            return (Criteria) this;
        }

        public Criteria andUnknown2NotEqualTo(BigDecimal value) {
            addCriterion("unknown_2 <>", value, "unknown2");
            return (Criteria) this;
        }

        public Criteria andUnknown2GreaterThan(BigDecimal value) {
            addCriterion("unknown_2 >", value, "unknown2");
            return (Criteria) this;
        }

        public Criteria andUnknown2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unknown_2 >=", value, "unknown2");
            return (Criteria) this;
        }

        public Criteria andUnknown2LessThan(BigDecimal value) {
            addCriterion("unknown_2 <", value, "unknown2");
            return (Criteria) this;
        }

        public Criteria andUnknown2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("unknown_2 <=", value, "unknown2");
            return (Criteria) this;
        }

        public Criteria andUnknown2In(List<BigDecimal> values) {
            addCriterion("unknown_2 in", values, "unknown2");
            return (Criteria) this;
        }

        public Criteria andUnknown2NotIn(List<BigDecimal> values) {
            addCriterion("unknown_2 not in", values, "unknown2");
            return (Criteria) this;
        }

        public Criteria andUnknown2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("unknown_2 between", value1, value2, "unknown2");
            return (Criteria) this;
        }

        public Criteria andUnknown2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unknown_2 not between", value1, value2, "unknown2");
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