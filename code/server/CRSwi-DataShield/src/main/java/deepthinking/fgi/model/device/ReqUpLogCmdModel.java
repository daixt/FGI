/********************************************
 * 前端发起日志传输完毕请求的数据结构
 *
 * @author zwq
 * @create 2018-06-06 22:53
 *********************************************/

package deepthinking.fgi.model.device;

import io.swagger.annotations.ApiModel;

@ApiModel("日志传输完毕数据结构")
public class ReqUpLogCmdModel {

    private String ticketID;   		// 工单编号
    private String ticketDate;   	// 工单实施日期(出现场日期)
    private String  fieldID;    	// 工作区段编号
    private String instrumentName;  // 受控仪表类型
    private String instrumentID;    // 受控仪表编号
    private String serialNum;  	    // 受控防篡改设备串号
    private String deviceID;   	    // 受控防篡改设备系统编号
    private String  dataFileName;   // 数据包名称
    private String  dataFileSize;   // 数据包长度
    private String  dataFileMD5;    // 数据包MD5
    private String  url;  		    // 上传位置 相对路径
    
	public String getTicketID() {
		return ticketID;
	}
	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}
	public String getTicketDate() {
		return ticketDate;
	}
	public void setTicketDate(String ticketDate) {
		this.ticketDate = ticketDate;
	}
	public String getFieldID() {
		return fieldID;
	}
	public void setFieldID(String fieldID) {
		this.fieldID = fieldID;
	}
	public String getInstrumentName() {
		return instrumentName;
	}
	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	public String getInstrumentID() {
		return instrumentID;
	}
	public void setInstrumentID(String instrumentID) {
		this.instrumentID = instrumentID;
	}
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
	public String getDataFileName() {
		return dataFileName;
	}
	public void setDataFileName(String dataFileName) {
		this.dataFileName = dataFileName;
	}
	public String getDataFileSize() {
		return dataFileSize;
	}
	public void setDataFileSize(String dataFileSize) {
		this.dataFileSize = dataFileSize;
	}
	public String getDataFileMD5() {
		return dataFileMD5;
	}
	public void setDataFileMD5(String dataFileMD5) {
		this.dataFileMD5 = dataFileMD5;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
