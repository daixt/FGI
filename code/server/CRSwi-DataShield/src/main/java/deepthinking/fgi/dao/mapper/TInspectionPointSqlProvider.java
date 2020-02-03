package deepthinking.fgi.dao.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

import deepthinking.fgi.domain.TInspectionPoint;
import deepthinking.fgi.domain.TInspectionPointCriteria;
import deepthinking.fgi.domain.TInspectionPointCriteria.Criteria;
import deepthinking.fgi.domain.TInspectionPointCriteria.Criterion;

public class TInspectionPointSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inspection_point
     *
     * @mbg.generated
     */
    public String countByExample(TInspectionPointCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_inspection_point");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inspection_point
     *
     * @mbg.generated
     */
    public String deleteByExample(TInspectionPointCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_inspection_point");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inspection_point
     *
     * @mbg.generated
     */
    public String insertSelective(TInspectionPoint record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_inspection_point");
        
        if (record.getInspectionPointCode() != null) {
            sql.VALUES("inspection_point_code", "#{inspectionPointCode,jdbcType=INTEGER}");
        }
        
        if (record.getLineCode() != null) {
            sql.VALUES("line_code", "#{lineCode,jdbcType=INTEGER}");
        }
        
        if (record.getDirection() != null) {
            sql.VALUES("direction", "#{direction,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectionPointTypeCode() != null) {
            sql.VALUES("inspection_point_type_code", "#{inspectionPointTypeCode,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectionPointName() != null) {
            sql.VALUES("inspection_point_name", "#{inspectionPointName,jdbcType=VARCHAR}");
        }
        
        if (record.getMileageNo() != null) {
            sql.VALUES("mileage_no", "#{mileageNo,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inspection_point
     *
     * @mbg.generated
     */
    public String selectByExample(TInspectionPointCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("inspection_point_code");
        } else {
            sql.SELECT("inspection_point_code");
        }
        sql.SELECT("line_code");
        sql.SELECT("direction");
        sql.SELECT("inspection_point_type_code");
        sql.SELECT("inspection_point_name");
        sql.SELECT("mileage_no");
        sql.FROM("t_inspection_point");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inspection_point
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TInspectionPoint record = (TInspectionPoint) parameter.get("record");
        TInspectionPointCriteria example = (TInspectionPointCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_inspection_point");
        
        if (record.getInspectionPointCode() != null) {
            sql.SET("inspection_point_code = #{record.inspectionPointCode,jdbcType=INTEGER}");
        }
        
        if (record.getLineCode() != null) {
            sql.SET("line_code = #{record.lineCode,jdbcType=INTEGER}");
        }
        
        if (record.getDirection() != null) {
            sql.SET("direction = #{record.direction,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectionPointTypeCode() != null) {
            sql.SET("inspection_point_type_code = #{record.inspectionPointTypeCode,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectionPointName() != null) {
            sql.SET("inspection_point_name = #{record.inspectionPointName,jdbcType=VARCHAR}");
        }
        
        if (record.getMileageNo() != null) {
            sql.SET("mileage_no = #{record.mileageNo,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inspection_point
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_inspection_point");
        
        sql.SET("inspection_point_code = #{record.inspectionPointCode,jdbcType=INTEGER}");
        sql.SET("line_code = #{record.lineCode,jdbcType=INTEGER}");
        sql.SET("direction = #{record.direction,jdbcType=VARCHAR}");
        sql.SET("inspection_point_type_code = #{record.inspectionPointTypeCode,jdbcType=VARCHAR}");
        sql.SET("inspection_point_name = #{record.inspectionPointName,jdbcType=VARCHAR}");
        sql.SET("mileage_no = #{record.mileageNo,jdbcType=VARCHAR}");
        
        TInspectionPointCriteria example = (TInspectionPointCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inspection_point
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TInspectionPoint record) {
        SQL sql = new SQL();
        sql.UPDATE("t_inspection_point");
        
        if (record.getLineCode() != null) {
            sql.SET("line_code = #{lineCode,jdbcType=INTEGER}");
        }
        
        if (record.getDirection() != null) {
            sql.SET("direction = #{direction,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectionPointTypeCode() != null) {
            sql.SET("inspection_point_type_code = #{inspectionPointTypeCode,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectionPointName() != null) {
            sql.SET("inspection_point_name = #{inspectionPointName,jdbcType=VARCHAR}");
        }
        
        if (record.getMileageNo() != null) {
            sql.SET("mileage_no = #{mileageNo,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("inspection_point_code = #{inspectionPointCode,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inspection_point
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TInspectionPointCriteria example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}