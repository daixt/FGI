package deepthinking.fgi.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TDsdataRecordCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public TDsdataRecordCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
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

        public Criteria andDatafileCodeIsNull() {
            addCriterion("datafile_code is null");
            return (Criteria) this;
        }

        public Criteria andDatafileCodeIsNotNull() {
            addCriterion("datafile_code is not null");
            return (Criteria) this;
        }

        public Criteria andDatafileCodeEqualTo(Integer value) {
            addCriterion("datafile_code =", value, "datafileCode");
            return (Criteria) this;
        }

        public Criteria andDatafileCodeNotEqualTo(Integer value) {
            addCriterion("datafile_code <>", value, "datafileCode");
            return (Criteria) this;
        }

        public Criteria andDatafileCodeGreaterThan(Integer value) {
            addCriterion("datafile_code >", value, "datafileCode");
            return (Criteria) this;
        }

        public Criteria andDatafileCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("datafile_code >=", value, "datafileCode");
            return (Criteria) this;
        }

        public Criteria andDatafileCodeLessThan(Integer value) {
            addCriterion("datafile_code <", value, "datafileCode");
            return (Criteria) this;
        }

        public Criteria andDatafileCodeLessThanOrEqualTo(Integer value) {
            addCriterion("datafile_code <=", value, "datafileCode");
            return (Criteria) this;
        }

        public Criteria andDatafileCodeIn(List<Integer> values) {
            addCriterion("datafile_code in", values, "datafileCode");
            return (Criteria) this;
        }

        public Criteria andDatafileCodeNotIn(List<Integer> values) {
            addCriterion("datafile_code not in", values, "datafileCode");
            return (Criteria) this;
        }

        public Criteria andDatafileCodeBetween(Integer value1, Integer value2) {
            addCriterion("datafile_code between", value1, value2, "datafileCode");
            return (Criteria) this;
        }

        public Criteria andDatafileCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("datafile_code not between", value1, value2, "datafileCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(Integer value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(Integer value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(Integer value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(Integer value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(Integer value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<Integer> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<Integer> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(Integer value1, Integer value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andDatafileNameIsNull() {
            addCriterion("datafile_name is null");
            return (Criteria) this;
        }

        public Criteria andDatafileNameIsNotNull() {
            addCriterion("datafile_name is not null");
            return (Criteria) this;
        }

        public Criteria andDatafileNameEqualTo(String value) {
            addCriterion("datafile_name =", value, "datafileName");
            return (Criteria) this;
        }

        public Criteria andDatafileNameNotEqualTo(String value) {
            addCriterion("datafile_name <>", value, "datafileName");
            return (Criteria) this;
        }

        public Criteria andDatafileNameGreaterThan(String value) {
            addCriterion("datafile_name >", value, "datafileName");
            return (Criteria) this;
        }

        public Criteria andDatafileNameGreaterThanOrEqualTo(String value) {
            addCriterion("datafile_name >=", value, "datafileName");
            return (Criteria) this;
        }

        public Criteria andDatafileNameLessThan(String value) {
            addCriterion("datafile_name <", value, "datafileName");
            return (Criteria) this;
        }

        public Criteria andDatafileNameLessThanOrEqualTo(String value) {
            addCriterion("datafile_name <=", value, "datafileName");
            return (Criteria) this;
        }

        public Criteria andDatafileNameLike(String value) {
            addCriterion("datafile_name like", value, "datafileName");
            return (Criteria) this;
        }

        public Criteria andDatafileNameNotLike(String value) {
            addCriterion("datafile_name not like", value, "datafileName");
            return (Criteria) this;
        }

        public Criteria andDatafileNameIn(List<String> values) {
            addCriterion("datafile_name in", values, "datafileName");
            return (Criteria) this;
        }

        public Criteria andDatafileNameNotIn(List<String> values) {
            addCriterion("datafile_name not in", values, "datafileName");
            return (Criteria) this;
        }

        public Criteria andDatafileNameBetween(String value1, String value2) {
            addCriterion("datafile_name between", value1, value2, "datafileName");
            return (Criteria) this;
        }

        public Criteria andDatafileNameNotBetween(String value1, String value2) {
            addCriterion("datafile_name not between", value1, value2, "datafileName");
            return (Criteria) this;
        }

        public Criteria andDatafileTimeIsNull() {
            addCriterion("datafile_time is null");
            return (Criteria) this;
        }

        public Criteria andDatafileTimeIsNotNull() {
            addCriterion("datafile_time is not null");
            return (Criteria) this;
        }

        public Criteria andDatafileTimeEqualTo(Date value) {
            addCriterionForJDBCDate("datafile_time =", value, "datafileTime");
            return (Criteria) this;
        }

        public Criteria andDatafileTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("datafile_time <>", value, "datafileTime");
            return (Criteria) this;
        }

        public Criteria andDatafileTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("datafile_time >", value, "datafileTime");
            return (Criteria) this;
        }

        public Criteria andDatafileTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datafile_time >=", value, "datafileTime");
            return (Criteria) this;
        }

        public Criteria andDatafileTimeLessThan(Date value) {
            addCriterionForJDBCDate("datafile_time <", value, "datafileTime");
            return (Criteria) this;
        }

        public Criteria andDatafileTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datafile_time <=", value, "datafileTime");
            return (Criteria) this;
        }

        public Criteria andDatafileTimeIn(List<Date> values) {
            addCriterionForJDBCDate("datafile_time in", values, "datafileTime");
            return (Criteria) this;
        }

        public Criteria andDatafileTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("datafile_time not in", values, "datafileTime");
            return (Criteria) this;
        }

        public Criteria andDatafileTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datafile_time between", value1, value2, "datafileTime");
            return (Criteria) this;
        }

        public Criteria andDatafileTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datafile_time not between", value1, value2, "datafileTime");
            return (Criteria) this;
        }

        public Criteria andDataConsistencyIsNull() {
            addCriterion("data_consistency is null");
            return (Criteria) this;
        }

        public Criteria andDataConsistencyIsNotNull() {
            addCriterion("data_consistency is not null");
            return (Criteria) this;
        }

        public Criteria andDataConsistencyEqualTo(Integer value) {
            addCriterion("data_consistency =", value, "dataConsistency");
            return (Criteria) this;
        }

        public Criteria andDataConsistencyNotEqualTo(Integer value) {
            addCriterion("data_consistency <>", value, "dataConsistency");
            return (Criteria) this;
        }

        public Criteria andDataConsistencyGreaterThan(Integer value) {
            addCriterion("data_consistency >", value, "dataConsistency");
            return (Criteria) this;
        }

        public Criteria andDataConsistencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_consistency >=", value, "dataConsistency");
            return (Criteria) this;
        }

        public Criteria andDataConsistencyLessThan(Integer value) {
            addCriterion("data_consistency <", value, "dataConsistency");
            return (Criteria) this;
        }

        public Criteria andDataConsistencyLessThanOrEqualTo(Integer value) {
            addCriterion("data_consistency <=", value, "dataConsistency");
            return (Criteria) this;
        }

        public Criteria andDataConsistencyIn(List<Integer> values) {
            addCriterion("data_consistency in", values, "dataConsistency");
            return (Criteria) this;
        }

        public Criteria andDataConsistencyNotIn(List<Integer> values) {
            addCriterion("data_consistency not in", values, "dataConsistency");
            return (Criteria) this;
        }

        public Criteria andDataConsistencyBetween(Integer value1, Integer value2) {
            addCriterion("data_consistency between", value1, value2, "dataConsistency");
            return (Criteria) this;
        }

        public Criteria andDataConsistencyNotBetween(Integer value1, Integer value2) {
            addCriterion("data_consistency not between", value1, value2, "dataConsistency");
            return (Criteria) this;
        }

        public Criteria andDataUrlIsNull() {
            addCriterion("data_url is null");
            return (Criteria) this;
        }

        public Criteria andDataUrlIsNotNull() {
            addCriterion("data_url is not null");
            return (Criteria) this;
        }

        public Criteria andDataUrlEqualTo(String value) {
            addCriterion("data_url =", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlNotEqualTo(String value) {
            addCriterion("data_url <>", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlGreaterThan(String value) {
            addCriterion("data_url >", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlGreaterThanOrEqualTo(String value) {
            addCriterion("data_url >=", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlLessThan(String value) {
            addCriterion("data_url <", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlLessThanOrEqualTo(String value) {
            addCriterion("data_url <=", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlLike(String value) {
            addCriterion("data_url like", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlNotLike(String value) {
            addCriterion("data_url not like", value, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlIn(List<String> values) {
            addCriterion("data_url in", values, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlNotIn(List<String> values) {
            addCriterion("data_url not in", values, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlBetween(String value1, String value2) {
            addCriterion("data_url between", value1, value2, "dataUrl");
            return (Criteria) this;
        }

        public Criteria andDataUrlNotBetween(String value1, String value2) {
            addCriterion("data_url not between", value1, value2, "dataUrl");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_dsdata_record
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
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