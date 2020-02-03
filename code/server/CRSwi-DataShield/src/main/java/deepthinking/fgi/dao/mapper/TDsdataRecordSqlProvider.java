package deepthinking.fgi.dao.mapper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import deepthinking.fgi.config.FilePathConfiguration;
import deepthinking.fgi.domain.TDsdataRecord;
import deepthinking.fgi.domain.TDsdataRecordCriteria;
import deepthinking.fgi.domain.TDsdataRecordCriteria.Criteria;
import deepthinking.fgi.domain.TDsdataRecordCriteria.Criterion;

public class TDsdataRecordSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public String countByExample(TDsdataRecordCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_dsdata_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public String deleteByExample(TDsdataRecordCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_dsdata_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public String insertSelective(TDsdataRecord record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_dsdata_record");
        
        if (record.getDatafileCode() != null) {
            sql.VALUES("datafile_code", "#{datafileCode,jdbcType=INTEGER}");
        }
        
        if (record.getOrderCode() != null) {
            sql.VALUES("order_code", "#{orderCode,jdbcType=INTEGER}");
        }
        
        if (record.getDatafileName() != null) {
            sql.VALUES("datafile_name", "#{datafileName,jdbcType=VARCHAR}");
        }
        
        if (record.getDatafileTime() != null) {
            sql.VALUES("datafile_time", "#{datafileTime,jdbcType=DATE}");
        }
        
        if (record.getDataConsistency() != null) {
            sql.VALUES("data_consistency", "#{dataConsistency,jdbcType=INTEGER}");
        }
        
        if (record.getDataUrl() != null) {
            sql.VALUES("data_url", "#{dataUrl,jdbcType=VARCHAR}");
        }
        if (record.getDatafileSize() != null) {
            sql.VALUES("datafile_size", "#{datafileSize,jdbcType=DECIMAL}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public String selectByExample(TDsdataRecordCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("datafile_code");
        } else {
            sql.SELECT("datafile_code");
        }
        sql.SELECT("order_code");
        sql.SELECT("datafile_name");
        sql.SELECT("datafile_time");
        sql.SELECT("data_consistency");
        sql.SELECT("data_url");
        sql.FROM("t_dsdata_record");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }
    
    public String selectDataRecords(HashMap<String,String> queryParams){
        SQL sql = new SQL();
        
        sql.SELECT("datafile_code");
        sql.SELECT("order_code");
        sql.SELECT("datafile_name");
        sql.SELECT("datafile_time");
        sql.SELECT("data_consistency");
        sql.SELECT("CONCAT('"+FilePathConfiguration.getDataServerPath()+"',data_url) AS dataUrl");
        sql.FROM("t_dsdata_record");
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(" 1=1");
        
        if(null!=queryParams){
        	Object orderCode = queryParams.get("orderCode");
            if(null!=orderCode){
            	sb.append(" and order_code = ");
            	sb.append((Integer)orderCode);
            }
        }
        
        sql.WHERE(sb.toString());
        sql.ORDER_BY("datafile_time DESC");
 
        
        return sql.toString();
    }

    
    public String selectDataMemRecords(HashMap<String,String> queryParams){
        SQL sql = new SQL();
        
        sql.SELECT("datafile_code");
        sql.SELECT("order_code");
        sql.SELECT("datafile_name");
        sql.SELECT("datafile_time");
        sql.SELECT("data_consistency");
        sql.SELECT("CONCAT('"+FilePathConfiguration.getLocalDataFilePath()+"',data_url) AS data_url");
        sql.FROM("t_dsdata_record");
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(" 1=1");
        
        if(null!=queryParams){
        	Object orderCode = queryParams.get("orderCode");
            if(null!=orderCode){
            	sb.append(" and order_code = ");
            	sb.append((Integer)orderCode);
            }
        }
        
        sql.WHERE(sb.toString());
        sql.ORDER_BY("datafile_time DESC");
 
        
        return sql.toString();
    }
    
    public String selectDataFileMemRecords(Map<String,Object> parameter){
    	
    	SQL sql = new SQL();

        sql.SELECT("t1.order_code");
        sql.SELECT("t2.orgnization_name");
        sql.SELECT("t3.staff_name");
        sql.SELECT("t1.work_date");
        sql.SELECT("t1.inspection_order_no");
        sql.SELECT("t1.order_status");
        sql.SELECT("cast(sum(t4.datafile_size)/(1024*1024*1024) as decimal(65,3)) as datafile_mem");
        sql.FROM("t_workorders t1,t_staff t3,t_orgnization t2,t_dsdata_record t4");
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(" 1=1");
        
        if(null!=parameter){
        	Object orgnizationName = parameter.get("orgnizationName");
            if(null!=orgnizationName){
            	sb.append(" and t2.orgnization_name like '%");
            	sb.append((String)orgnizationName);
            	sb.append("%'");
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        	Object startWorkDate = parameter.get("startWorkDate");
            if(null!=startWorkDate){
            	sb.append(" and t1.work_date >= '");
            	sb.append(sdf.format((Date)startWorkDate));
            	sb.append("'");
            }
            Object endWorkDate = parameter.get("endWorkDate");
            if(null!=endWorkDate){
            	sb.append(" and t1.work_date <= '");
            	sb.append(sdf.format((Date)endWorkDate));
            	sb.append("'");
            }
        }
        
        sb.append(" and t1.inspector_code =t3.staff_code ");
        sb.append(" and t1.organization_code =t2.orgnization_code ");
        sb.append(" and (t1.order_status = 'T-DAT-04'");
        sb.append(" or t1.order_status = 'T-IN-05')");
        sb.append(" and t1.order_code = t4.order_code");
        
        sql.WHERE(sb.toString());
        sql.GROUP_BY("t1.order_code");
 
        
        return sql.toString();
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TDsdataRecord record = (TDsdataRecord) parameter.get("record");
        TDsdataRecordCriteria example = (TDsdataRecordCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_dsdata_record");
        
        if (record.getDatafileCode() != null) {
            sql.SET("datafile_code = #{record.datafileCode,jdbcType=INTEGER}");
        }
        
        if (record.getOrderCode() != null) {
            sql.SET("order_code = #{record.orderCode,jdbcType=INTEGER}");
        }
        
        if (record.getDatafileName() != null) {
            sql.SET("datafile_name = #{record.datafileName,jdbcType=VARCHAR}");
        }
        
        if (record.getDatafileTime() != null) {
            sql.SET("datafile_time = #{record.datafileTime,jdbcType=DATE}");
        }
        
        if (record.getDataConsistency() != null) {
            sql.SET("data_consistency = #{record.dataConsistency,jdbcType=INTEGER}");
        }
        
        if (record.getDataUrl() != null) {
            sql.SET("data_url = #{record.dataUrl,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_dsdata_record");
        
        sql.SET("datafile_code = #{record.datafileCode,jdbcType=INTEGER}");
        sql.SET("order_code = #{record.orderCode,jdbcType=INTEGER}");
        sql.SET("datafile_name = #{record.datafileName,jdbcType=VARCHAR}");
        sql.SET("datafile_time = #{record.datafileTime,jdbcType=DATE}");
        sql.SET("data_consistency = #{record.dataConsistency,jdbcType=INTEGER}");
        sql.SET("data_url = #{record.dataUrl,jdbcType=VARCHAR}");
        
        TDsdataRecordCriteria example = (TDsdataRecordCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TDsdataRecord record) {
        SQL sql = new SQL();
        sql.UPDATE("t_dsdata_record");
        
        if (record.getOrderCode() != null) {
            sql.SET("order_code = #{orderCode,jdbcType=INTEGER}");
        }
        
        if (record.getDatafileName() != null) {
            sql.SET("datafile_name = #{datafileName,jdbcType=VARCHAR}");
        }
        
        if (record.getDatafileTime() != null) {
            sql.SET("datafile_time = #{datafileTime,jdbcType=DATE}");
        }
        
        if (record.getDataConsistency() != null) {
            sql.SET("data_consistency = #{dataConsistency,jdbcType=INTEGER}");
        }
        
        if (record.getDataUrl() != null) {
            sql.SET("data_url = #{dataUrl,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("datafile_code = #{datafileCode,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dsdata_record
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TDsdataRecordCriteria example, boolean includeExamplePhrase) {
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