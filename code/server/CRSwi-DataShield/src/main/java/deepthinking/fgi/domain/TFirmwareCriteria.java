package deepthinking.fgi.domain;

import java.util.ArrayList;
import java.util.List;

public class TFirmwareCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_firmware
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_firmware
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_firmware
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_firmware
     *
     * @mbg.generated
     */
    public TFirmwareCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_firmware
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_firmware
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_firmware
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_firmware
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_firmware
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_firmware
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_firmware
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
     * This method corresponds to the database table t_firmware
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
     * This method corresponds to the database table t_firmware
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_firmware
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
     * This class corresponds to the database table t_firmware
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

        public Criteria andFirmwareCodeIsNull() {
            addCriterion("firmware_code is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareCodeIsNotNull() {
            addCriterion("firmware_code is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareCodeEqualTo(Integer value) {
            addCriterion("firmware_code =", value, "firmwareCode");
            return (Criteria) this;
        }

        public Criteria andFirmwareCodeNotEqualTo(Integer value) {
            addCriterion("firmware_code <>", value, "firmwareCode");
            return (Criteria) this;
        }

        public Criteria andFirmwareCodeGreaterThan(Integer value) {
            addCriterion("firmware_code >", value, "firmwareCode");
            return (Criteria) this;
        }

        public Criteria andFirmwareCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("firmware_code >=", value, "firmwareCode");
            return (Criteria) this;
        }

        public Criteria andFirmwareCodeLessThan(Integer value) {
            addCriterion("firmware_code <", value, "firmwareCode");
            return (Criteria) this;
        }

        public Criteria andFirmwareCodeLessThanOrEqualTo(Integer value) {
            addCriterion("firmware_code <=", value, "firmwareCode");
            return (Criteria) this;
        }

        public Criteria andFirmwareCodeIn(List<Integer> values) {
            addCriterion("firmware_code in", values, "firmwareCode");
            return (Criteria) this;
        }

        public Criteria andFirmwareCodeNotIn(List<Integer> values) {
            addCriterion("firmware_code not in", values, "firmwareCode");
            return (Criteria) this;
        }

        public Criteria andFirmwareCodeBetween(Integer value1, Integer value2) {
            addCriterion("firmware_code between", value1, value2, "firmwareCode");
            return (Criteria) this;
        }

        public Criteria andFirmwareCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("firmware_code not between", value1, value2, "firmwareCode");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionIsNull() {
            addCriterion("firmware_version is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionIsNotNull() {
            addCriterion("firmware_version is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionEqualTo(String value) {
            addCriterion("firmware_version =", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionNotEqualTo(String value) {
            addCriterion("firmware_version <>", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionGreaterThan(String value) {
            addCriterion("firmware_version >", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionGreaterThanOrEqualTo(String value) {
            addCriterion("firmware_version >=", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionLessThan(String value) {
            addCriterion("firmware_version <", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionLessThanOrEqualTo(String value) {
            addCriterion("firmware_version <=", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionLike(String value) {
            addCriterion("firmware_version like", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionNotLike(String value) {
            addCriterion("firmware_version not like", value, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionIn(List<String> values) {
            addCriterion("firmware_version in", values, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionNotIn(List<String> values) {
            addCriterion("firmware_version not in", values, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionBetween(String value1, String value2) {
            addCriterion("firmware_version between", value1, value2, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareVersionNotBetween(String value1, String value2) {
            addCriterion("firmware_version not between", value1, value2, "firmwareVersion");
            return (Criteria) this;
        }

        public Criteria andFirmwareSizeIsNull() {
            addCriterion("firmware_size is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareSizeIsNotNull() {
            addCriterion("firmware_size is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareSizeEqualTo(Double value) {
            addCriterion("firmware_size =", value, "firmwareSize");
            return (Criteria) this;
        }

        public Criteria andFirmwareSizeNotEqualTo(Double value) {
            addCriterion("firmware_size <>", value, "firmwareSize");
            return (Criteria) this;
        }

        public Criteria andFirmwareSizeGreaterThan(Double value) {
            addCriterion("firmware_size >", value, "firmwareSize");
            return (Criteria) this;
        }

        public Criteria andFirmwareSizeGreaterThanOrEqualTo(Double value) {
            addCriterion("firmware_size >=", value, "firmwareSize");
            return (Criteria) this;
        }

        public Criteria andFirmwareSizeLessThan(Double value) {
            addCriterion("firmware_size <", value, "firmwareSize");
            return (Criteria) this;
        }

        public Criteria andFirmwareSizeLessThanOrEqualTo(Double value) {
            addCriterion("firmware_size <=", value, "firmwareSize");
            return (Criteria) this;
        }

        public Criteria andFirmwareSizeIn(List<Double> values) {
            addCriterion("firmware_size in", values, "firmwareSize");
            return (Criteria) this;
        }

        public Criteria andFirmwareSizeNotIn(List<Double> values) {
            addCriterion("firmware_size not in", values, "firmwareSize");
            return (Criteria) this;
        }

        public Criteria andFirmwareSizeBetween(Double value1, Double value2) {
            addCriterion("firmware_size between", value1, value2, "firmwareSize");
            return (Criteria) this;
        }

        public Criteria andFirmwareSizeNotBetween(Double value1, Double value2) {
            addCriterion("firmware_size not between", value1, value2, "firmwareSize");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5IsNull() {
            addCriterion("firmware_md5 is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5IsNotNull() {
            addCriterion("firmware_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5EqualTo(String value) {
            addCriterion("firmware_md5 =", value, "firmwareMd5");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5NotEqualTo(String value) {
            addCriterion("firmware_md5 <>", value, "firmwareMd5");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5GreaterThan(String value) {
            addCriterion("firmware_md5 >", value, "firmwareMd5");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5GreaterThanOrEqualTo(String value) {
            addCriterion("firmware_md5 >=", value, "firmwareMd5");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5LessThan(String value) {
            addCriterion("firmware_md5 <", value, "firmwareMd5");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5LessThanOrEqualTo(String value) {
            addCriterion("firmware_md5 <=", value, "firmwareMd5");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5Like(String value) {
            addCriterion("firmware_md5 like", value, "firmwareMd5");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5NotLike(String value) {
            addCriterion("firmware_md5 not like", value, "firmwareMd5");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5In(List<String> values) {
            addCriterion("firmware_md5 in", values, "firmwareMd5");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5NotIn(List<String> values) {
            addCriterion("firmware_md5 not in", values, "firmwareMd5");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5Between(String value1, String value2) {
            addCriterion("firmware_md5 between", value1, value2, "firmwareMd5");
            return (Criteria) this;
        }

        public Criteria andFirmwareMd5NotBetween(String value1, String value2) {
            addCriterion("firmware_md5 not between", value1, value2, "firmwareMd5");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathIsNull() {
            addCriterion("firmware_path is null");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathIsNotNull() {
            addCriterion("firmware_path is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathEqualTo(String value) {
            addCriterion("firmware_path =", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathNotEqualTo(String value) {
            addCriterion("firmware_path <>", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathGreaterThan(String value) {
            addCriterion("firmware_path >", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathGreaterThanOrEqualTo(String value) {
            addCriterion("firmware_path >=", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathLessThan(String value) {
            addCriterion("firmware_path <", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathLessThanOrEqualTo(String value) {
            addCriterion("firmware_path <=", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathLike(String value) {
            addCriterion("firmware_path like", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathNotLike(String value) {
            addCriterion("firmware_path not like", value, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathIn(List<String> values) {
            addCriterion("firmware_path in", values, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathNotIn(List<String> values) {
            addCriterion("firmware_path not in", values, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathBetween(String value1, String value2) {
            addCriterion("firmware_path between", value1, value2, "firmwarePath");
            return (Criteria) this;
        }

        public Criteria andFirmwarePathNotBetween(String value1, String value2) {
            addCriterion("firmware_path not between", value1, value2, "firmwarePath");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_firmware
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
     * This class corresponds to the database table t_firmware
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