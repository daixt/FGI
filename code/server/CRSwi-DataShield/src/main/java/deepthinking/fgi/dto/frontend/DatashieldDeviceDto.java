/********************************************
 * 前端请求防篡改设备日志的数据结构
 *
 * @author zwq
 * @create 2018-06-04 0:33
 *********************************************/

package deepthinking.fgi.dto.frontend;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("防篡改设备统一信息模型")
public class DatashieldDeviceDto {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_datashield_device.dsdevice_code
     *
     * @mbg.generated
     */
	@ApiModelProperty("防篡改设备编码（主键）")
    private String dsdeviceCode;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_datashield_device.organization_code
     *
     * @mbg.generated
     */
	@ApiModelProperty("单位编码")
    private Integer organizationCode;
    
	@ApiModelProperty("单位名称")
    private String orgnizationName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_datashield_device.dsdevice_name
     *
     * @mbg.generated
     */
	@ApiModelProperty("防篡改设备名称")
    private String dsdeviceName;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_datashield_device.dsdevice_serial_no
     *
     * @mbg.generated
     */
	@ApiModelProperty("防篡改设备串号")
    private String dsdeviceSerialNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_datashield_device.device_status_code
     *
     * @mbg.generated
     */
	@ApiModelProperty("防篡改设备状态编码")
    private String deviceStatusCode;
	@ApiModelProperty("防篡改设备日志传输状态")
    private String logTransPortStatus;  // 日志传输状态
	@ApiModelProperty("防篡改设备日志访问全Url路径")
    private String logUrl;  			// 日志访问全Url路径
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_datashield_device.dsdevice_code
     *
     * @return the value of t_datashield_device.dsdevice_code
     *
     * @mbg.generated
     */
    public String getDsdeviceCode() {
        return dsdeviceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_datashield_device.dsdevice_code
     *
     * @param dsdeviceCode the value for t_datashield_device.dsdevice_code
     *
     * @mbg.generated
     */
    public void setDsdeviceCode(String dsdeviceCode) {
        this.dsdeviceCode = dsdeviceCode == null ? null : dsdeviceCode.trim();
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_datashield_device.organization_code
     *
     * @return the value of t_datashield_device.organization_code
     *
     * @mbg.generated
     */
    public Integer getOrganizationCode() {
        return organizationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_datashield_device.organization_code
     *
     * @param organizationCode the value for t_datashield_device.organization_code
     *
     * @mbg.generated
     */
    public void setOrganizationCode(Integer organizationCode) {
        this.organizationCode = organizationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_datashield_device.dsdevice_name
     *
     * @return the value of t_datashield_device.dsdevice_name
     *
     * @mbg.generated
     */
    public String getDsdeviceName() {
        return dsdeviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_datashield_device.dsdevice_name
     *
     * @param dsdeviceName the value for t_datashield_device.dsdevice_name
     *
     * @mbg.generated
     */
    public void setDsdeviceName(String dsdeviceName) {
        this.dsdeviceName = dsdeviceName == null ? null : dsdeviceName.trim();
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_datashield_device.dsdevice_serial_no
     *
     * @return the value of t_datashield_device.dsdevice_serial_no
     *
     * @mbg.generated
     */
    public String getDsdeviceSerialNo() {
        return dsdeviceSerialNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_datashield_device.dsdevice_serial_no
     *
     * @param dsdeviceSerialNo the value for t_datashield_device.dsdevice_serial_no
     *
     * @mbg.generated
     */
    public void setDsdeviceSerialNo(String dsdeviceSerialNo) {
        this.dsdeviceSerialNo = dsdeviceSerialNo == null ? null : dsdeviceSerialNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_datashield_device.device_status_code
     *
     * @return the value of t_datashield_device.device_status_code
     *
     * @mbg.generated
     */
    public String getDeviceStatusCode() {
        return deviceStatusCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_datashield_device.device_status_code
     *
     * @param deviceStatusCode the value for t_datashield_device.device_status_code
     *
     * @mbg.generated
     */
    public void setDeviceStatusCode(String deviceStatusCode) {
        this.deviceStatusCode = deviceStatusCode == null ? null : deviceStatusCode.trim();
    }

	public String getLogTransPortStatus() {
		return logTransPortStatus;
	}

	public void setLogTransPortStatus(String logTransPortStatus) {
		this.logTransPortStatus = logTransPortStatus;
	}

	public String getOrgnizationName() {
		return orgnizationName;
	}

	public void setOrgnizationName(String orgnizationName) {
		this.orgnizationName = orgnizationName;
	}

	public String getLogUrl() {
		return logUrl;
	}

	public void setLogUrl(String logUrl) {
		this.logUrl = logUrl;
	}

	

	
	
}