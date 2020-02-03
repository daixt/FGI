package deepthinking.fgi.domain;

public class TInspectionPoint {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inspection_point.inspection_point_code
     *
     * @mbg.generated
     */
    private Integer inspectionPointCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inspection_point.line_code
     *
     * @mbg.generated
     */
    private Integer lineCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inspection_point.direction
     *
     * @mbg.generated
     */
    private String direction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inspection_point.inspection_point_type_code
     *
     * @mbg.generated
     */
    private String inspectionPointTypeCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inspection_point.inspection_point_name
     *
     * @mbg.generated
     */
    private String inspectionPointName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inspection_point.mileage_no
     *
     * @mbg.generated
     */
    private String mileageNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inspection_point.inspection_point_code
     *
     * @return the value of t_inspection_point.inspection_point_code
     *
     * @mbg.generated
     */
    public Integer getInspectionPointCode() {
        return inspectionPointCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inspection_point.inspection_point_code
     *
     * @param inspectionPointCode the value for t_inspection_point.inspection_point_code
     *
     * @mbg.generated
     */
    public void setInspectionPointCode(Integer inspectionPointCode) {
        this.inspectionPointCode = inspectionPointCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inspection_point.line_code
     *
     * @return the value of t_inspection_point.line_code
     *
     * @mbg.generated
     */
    public Integer getLineCode() {
        return lineCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inspection_point.line_code
     *
     * @param lineCode the value for t_inspection_point.line_code
     *
     * @mbg.generated
     */
    public void setLineCode(Integer lineCode) {
        this.lineCode = lineCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inspection_point.direction
     *
     * @return the value of t_inspection_point.direction
     *
     * @mbg.generated
     */
    public String getDirection() {
        return direction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inspection_point.direction
     *
     * @param direction the value for t_inspection_point.direction
     *
     * @mbg.generated
     */
    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inspection_point.inspection_point_type_code
     *
     * @return the value of t_inspection_point.inspection_point_type_code
     *
     * @mbg.generated
     */
    public String getInspectionPointTypeCode() {
        return inspectionPointTypeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inspection_point.inspection_point_type_code
     *
     * @param inspectionPointTypeCode the value for t_inspection_point.inspection_point_type_code
     *
     * @mbg.generated
     */
    public void setInspectionPointTypeCode(String inspectionPointTypeCode) {
        this.inspectionPointTypeCode = inspectionPointTypeCode == null ? null : inspectionPointTypeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inspection_point.inspection_point_name
     *
     * @return the value of t_inspection_point.inspection_point_name
     *
     * @mbg.generated
     */
    public String getInspectionPointName() {
        return inspectionPointName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inspection_point.inspection_point_name
     *
     * @param inspectionPointName the value for t_inspection_point.inspection_point_name
     *
     * @mbg.generated
     */
    public void setInspectionPointName(String inspectionPointName) {
        this.inspectionPointName = inspectionPointName == null ? null : inspectionPointName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inspection_point.mileage_no
     *
     * @return the value of t_inspection_point.mileage_no
     *
     * @mbg.generated
     */
    public String getMileageNo() {
        return mileageNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inspection_point.mileage_no
     *
     * @param mileageNo the value for t_inspection_point.mileage_no
     *
     * @mbg.generated
     */
    public void setMileageNo(String mileageNo) {
        this.mileageNo = mileageNo == null ? null : mileageNo.trim();
    }
}