package deepthinking.fgi.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TWorkordersCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_workorders
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_workorders
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_workorders
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_workorders
     *
     * @mbg.generated
     */
    public TWorkordersCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_workorders
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_workorders
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_workorders
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_workorders
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_workorders
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_workorders
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_workorders
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
     * This method corresponds to the database table t_workorders
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
     * This method corresponds to the database table t_workorders
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_workorders
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
     * This class corresponds to the database table t_workorders
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

        public Criteria andOrganizationCodeIsNull() {
            addCriterion("organization_code is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNotNull() {
            addCriterion("organization_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeEqualTo(Integer value) {
            addCriterion("organization_code =", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotEqualTo(Integer value) {
            addCriterion("organization_code <>", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThan(Integer value) {
            addCriterion("organization_code >", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("organization_code >=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThan(Integer value) {
            addCriterion("organization_code <", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThanOrEqualTo(Integer value) {
            addCriterion("organization_code <=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIn(List<Integer> values) {
            addCriterion("organization_code in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotIn(List<Integer> values) {
            addCriterion("organization_code not in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeBetween(Integer value1, Integer value2) {
            addCriterion("organization_code between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("organization_code not between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andInspectorCodeIsNull() {
            addCriterion("inspector_code is null");
            return (Criteria) this;
        }

        public Criteria andInspectorCodeIsNotNull() {
            addCriterion("inspector_code is not null");
            return (Criteria) this;
        }

        public Criteria andInspectorCodeEqualTo(Integer value) {
            addCriterion("inspector_code =", value, "inspectorCode");
            return (Criteria) this;
        }

        public Criteria andInspectorCodeNotEqualTo(Integer value) {
            addCriterion("inspector_code <>", value, "inspectorCode");
            return (Criteria) this;
        }

        public Criteria andInspectorCodeGreaterThan(Integer value) {
            addCriterion("inspector_code >", value, "inspectorCode");
            return (Criteria) this;
        }

        public Criteria andInspectorCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspector_code >=", value, "inspectorCode");
            return (Criteria) this;
        }

        public Criteria andInspectorCodeLessThan(Integer value) {
            addCriterion("inspector_code <", value, "inspectorCode");
            return (Criteria) this;
        }

        public Criteria andInspectorCodeLessThanOrEqualTo(Integer value) {
            addCriterion("inspector_code <=", value, "inspectorCode");
            return (Criteria) this;
        }

        public Criteria andInspectorCodeIn(List<Integer> values) {
            addCriterion("inspector_code in", values, "inspectorCode");
            return (Criteria) this;
        }

        public Criteria andInspectorCodeNotIn(List<Integer> values) {
            addCriterion("inspector_code not in", values, "inspectorCode");
            return (Criteria) this;
        }

        public Criteria andInspectorCodeBetween(Integer value1, Integer value2) {
            addCriterion("inspector_code between", value1, value2, "inspectorCode");
            return (Criteria) this;
        }

        public Criteria andInspectorCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("inspector_code not between", value1, value2, "inspectorCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeIsNull() {
            addCriterion("instrument_code is null");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeIsNotNull() {
            addCriterion("instrument_code is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeEqualTo(String value) {
            addCriterion("instrument_code =", value, "instrumentCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeNotEqualTo(String value) {
            addCriterion("instrument_code <>", value, "instrumentCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeGreaterThan(String value) {
            addCriterion("instrument_code >", value, "instrumentCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("instrument_code >=", value, "instrumentCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeLessThan(String value) {
            addCriterion("instrument_code <", value, "instrumentCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeLessThanOrEqualTo(String value) {
            addCriterion("instrument_code <=", value, "instrumentCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeLike(String value) {
            addCriterion("instrument_code like", value, "instrumentCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeNotLike(String value) {
            addCriterion("instrument_code not like", value, "instrumentCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeIn(List<String> values) {
            addCriterion("instrument_code in", values, "instrumentCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeNotIn(List<String> values) {
            addCriterion("instrument_code not in", values, "instrumentCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeBetween(String value1, String value2) {
            addCriterion("instrument_code between", value1, value2, "instrumentCode");
            return (Criteria) this;
        }

        public Criteria andInstrumentCodeNotBetween(String value1, String value2) {
            addCriterion("instrument_code not between", value1, value2, "instrumentCode");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeIsNull() {
            addCriterion("dsdevice_code is null");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeIsNotNull() {
            addCriterion("dsdevice_code is not null");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeEqualTo(String value) {
            addCriterion("dsdevice_code =", value, "dsdeviceCode");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeNotEqualTo(String value) {
            addCriterion("dsdevice_code <>", value, "dsdeviceCode");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeGreaterThan(String value) {
            addCriterion("dsdevice_code >", value, "dsdeviceCode");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dsdevice_code >=", value, "dsdeviceCode");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeLessThan(String value) {
            addCriterion("dsdevice_code <", value, "dsdeviceCode");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeLessThanOrEqualTo(String value) {
            addCriterion("dsdevice_code <=", value, "dsdeviceCode");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeLike(String value) {
            addCriterion("dsdevice_code like", value, "dsdeviceCode");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeNotLike(String value) {
            addCriterion("dsdevice_code not like", value, "dsdeviceCode");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeIn(List<String> values) {
            addCriterion("dsdevice_code in", values, "dsdeviceCode");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeNotIn(List<String> values) {
            addCriterion("dsdevice_code not in", values, "dsdeviceCode");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeBetween(String value1, String value2) {
            addCriterion("dsdevice_code between", value1, value2, "dsdeviceCode");
            return (Criteria) this;
        }

        public Criteria andDsdeviceCodeNotBetween(String value1, String value2) {
            addCriterion("dsdevice_code not between", value1, value2, "dsdeviceCode");
            return (Criteria) this;
        }

        public Criteria andLineNameIsNull() {
            addCriterion("line_name is null");
            return (Criteria) this;
        }

        public Criteria andLineNameIsNotNull() {
            addCriterion("line_name is not null");
            return (Criteria) this;
        }

        public Criteria andLineNameEqualTo(String value) {
            addCriterion("line_name =", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotEqualTo(String value) {
            addCriterion("line_name <>", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThan(String value) {
            addCriterion("line_name >", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThanOrEqualTo(String value) {
            addCriterion("line_name >=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThan(String value) {
            addCriterion("line_name <", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThanOrEqualTo(String value) {
            addCriterion("line_name <=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLike(String value) {
            addCriterion("line_name like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotLike(String value) {
            addCriterion("line_name not like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameIn(List<String> values) {
            addCriterion("line_name in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotIn(List<String> values) {
            addCriterion("line_name not in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameBetween(String value1, String value2) {
            addCriterion("line_name between", value1, value2, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotBetween(String value1, String value2) {
            addCriterion("line_name not between", value1, value2, "lineName");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNull() {
            addCriterion("work_date is null");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNotNull() {
            addCriterion("work_date is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDateEqualTo(Date value) {
            addCriterionForJDBCDate("work_date =", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("work_date <>", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("work_date >", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_date >=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThan(Date value) {
            addCriterionForJDBCDate("work_date <", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_date <=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateIn(List<Date> values) {
            addCriterionForJDBCDate("work_date in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("work_date not in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_date between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_date not between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoIsNull() {
            addCriterion("inspection_order_no is null");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoIsNotNull() {
            addCriterion("inspection_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoEqualTo(String value) {
            addCriterion("inspection_order_no =", value, "inspectionOrderNo");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoNotEqualTo(String value) {
            addCriterion("inspection_order_no <>", value, "inspectionOrderNo");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoGreaterThan(String value) {
            addCriterion("inspection_order_no >", value, "inspectionOrderNo");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_order_no >=", value, "inspectionOrderNo");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoLessThan(String value) {
            addCriterion("inspection_order_no <", value, "inspectionOrderNo");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoLessThanOrEqualTo(String value) {
            addCriterion("inspection_order_no <=", value, "inspectionOrderNo");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoLike(String value) {
            addCriterion("inspection_order_no like", value, "inspectionOrderNo");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoNotLike(String value) {
            addCriterion("inspection_order_no not like", value, "inspectionOrderNo");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoIn(List<String> values) {
            addCriterion("inspection_order_no in", values, "inspectionOrderNo");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoNotIn(List<String> values) {
            addCriterion("inspection_order_no not in", values, "inspectionOrderNo");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoBetween(String value1, String value2) {
            addCriterion("inspection_order_no between", value1, value2, "inspectionOrderNo");
            return (Criteria) this;
        }

        public Criteria andInspectionOrderNoNotBetween(String value1, String value2) {
            addCriterion("inspection_order_no not between", value1, value2, "inspectionOrderNo");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("direction like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("direction not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameIsNull() {
            addCriterion("inspection_point_name is null");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameIsNotNull() {
            addCriterion("inspection_point_name is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameEqualTo(String value) {
            addCriterion("inspection_point_name =", value, "inspectionPointName");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameNotEqualTo(String value) {
            addCriterion("inspection_point_name <>", value, "inspectionPointName");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameGreaterThan(String value) {
            addCriterion("inspection_point_name >", value, "inspectionPointName");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_point_name >=", value, "inspectionPointName");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameLessThan(String value) {
            addCriterion("inspection_point_name <", value, "inspectionPointName");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameLessThanOrEqualTo(String value) {
            addCriterion("inspection_point_name <=", value, "inspectionPointName");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameLike(String value) {
            addCriterion("inspection_point_name like", value, "inspectionPointName");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameNotLike(String value) {
            addCriterion("inspection_point_name not like", value, "inspectionPointName");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameIn(List<String> values) {
            addCriterion("inspection_point_name in", values, "inspectionPointName");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameNotIn(List<String> values) {
            addCriterion("inspection_point_name not in", values, "inspectionPointName");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameBetween(String value1, String value2) {
            addCriterion("inspection_point_name between", value1, value2, "inspectionPointName");
            return (Criteria) this;
        }

        public Criteria andInspectionPointNameNotBetween(String value1, String value2) {
            addCriterion("inspection_point_name not between", value1, value2, "inspectionPointName");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_workorders
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
     * This class corresponds to the database table t_workorders
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