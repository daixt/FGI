package deepthinking.fgi.domain;

public class TFirmware {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_firmware.firmware_code
     *
     * @mbg.generated
     */
    private Integer firmwareCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_firmware.firmware_version
     *
     * @mbg.generated
     */
    private String firmwareVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_firmware.firmware_size
     *
     * @mbg.generated
     */
    private Double firmwareSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_firmware.firmware_md5
     *
     * @mbg.generated
     */
    private String firmwareMd5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_firmware.firmware_path
     *
     * @mbg.generated
     */
    private String firmwarePath;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_firmware.firmware_code
     *
     * @return the value of t_firmware.firmware_code
     *
     * @mbg.generated
     */
    public Integer getFirmwareCode() {
        return firmwareCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_firmware.firmware_code
     *
     * @param firmwareCode the value for t_firmware.firmware_code
     *
     * @mbg.generated
     */
    public void setFirmwareCode(Integer firmwareCode) {
        this.firmwareCode = firmwareCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_firmware.firmware_version
     *
     * @return the value of t_firmware.firmware_version
     *
     * @mbg.generated
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_firmware.firmware_version
     *
     * @param firmwareVersion the value for t_firmware.firmware_version
     *
     * @mbg.generated
     */
    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion == null ? null : firmwareVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_firmware.firmware_size
     *
     * @return the value of t_firmware.firmware_size
     *
     * @mbg.generated
     */
    public Double getFirmwareSize() {
        return firmwareSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_firmware.firmware_size
     *
     * @param firmwareSize the value for t_firmware.firmware_size
     *
     * @mbg.generated
     */
    public void setFirmwareSize(Double firmwareSize) {
        this.firmwareSize = firmwareSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_firmware.firmware_md5
     *
     * @return the value of t_firmware.firmware_md5
     *
     * @mbg.generated
     */
    public String getFirmwareMd5() {
        return firmwareMd5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_firmware.firmware_md5
     *
     * @param firmwareMd5 the value for t_firmware.firmware_md5
     *
     * @mbg.generated
     */
    public void setFirmwareMd5(String firmwareMd5) {
        this.firmwareMd5 = firmwareMd5 == null ? null : firmwareMd5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_firmware.firmware_path
     *
     * @return the value of t_firmware.firmware_path
     *
     * @mbg.generated
     */
    public String getFirmwarePath() {
        return firmwarePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_firmware.firmware_path
     *
     * @param firmwarePath the value for t_firmware.firmware_path
     *
     * @mbg.generated
     */
    public void setFirmwarePath(String firmwarePath) {
        this.firmwarePath = firmwarePath == null ? null : firmwarePath.trim();
    }
}