package ztc.com.smart.devic.bee.beans;

import com.young.android.lib.common.models.base.BaseModel;

/**
 * 设备信息
 *
 * @author jonesleborn
 */
@SuppressWarnings("unused")
public class BeeDeviceInfo extends BaseModel {


    /**
     * id : 100
     * deviceNo : SF-0001
     * deviceName : 丰巢柜
     * deviceMac : 2c:57:31:8b:52:04
     * deviceImei : 358240051111110
     * deviceType : 1
     * deviceStatus : 1
     * deviceInfo :
     * provinceCode :
     * cityCode : 420100
     * lotteryAreaCode : HB-001
     * lotteryCenterCode : szfc
     * channelCode :
     * orderSource : HB_FCG
     * address : 湖北省武汉市汉阳区万科金域蓝湾云廷组团丰巢智能柜
     * gpsX : 114.205078
     * gpsY : 30.551061
     * openTime : 00:00:00
     * closeTime : 23:59:59
     * limitPrintCount : 0
     * thirdDeviceNo : FC0274122
     * createTime : null
     * createEmp :
     * updateTime : null
     * updateEmp :
     * isDelete : false
     */

    private String id;
    private String deviceNo;
    private String deviceName;
    private String deviceMac;
    private String deviceImei;
    private int deviceType;
    private int deviceStatus;
    private String deviceInfo;
    private String provinceCode;
    private String cityCode;
    private String lotteryAreaCode;
    private String lotteryCenterCode;
    private String channelCode;
    private String orderSource;
    private String address;
    private double gpsX;
    private double gpsY;
    private String openTime;
    private String closeTime;
    private int limitPrintCount;
    private String thirdDeviceNo;
    private Long createTime;
    private String createEmp;
    private Long updateTime;
    private String updateEmp;
    private boolean isDelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceMac() {
        return deviceMac;
    }

    public void setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac;
    }

    public String getDeviceImei() {
        return deviceImei;
    }

    public void setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    public int getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(int deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getLotteryAreaCode() {
        return lotteryAreaCode;
    }

    public void setLotteryAreaCode(String lotteryAreaCode) {
        this.lotteryAreaCode = lotteryAreaCode;
    }

    public String getLotteryCenterCode() {
        return lotteryCenterCode;
    }

    public void setLotteryCenterCode(String lotteryCenterCode) {
        this.lotteryCenterCode = lotteryCenterCode;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpsX() {
        return gpsX;
    }

    public void setGpsX(double gpsX) {
        this.gpsX = gpsX;
    }

    public double getGpsY() {
        return gpsY;
    }

    public void setGpsY(double gpsY) {
        this.gpsY = gpsY;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public int getLimitPrintCount() {
        return limitPrintCount;
    }

    public void setLimitPrintCount(int limitPrintCount) {
        this.limitPrintCount = limitPrintCount;
    }

    public String getThirdDeviceNo() {
        return thirdDeviceNo;
    }

    public void setThirdDeviceNo(String thirdDeviceNo) {
        this.thirdDeviceNo = thirdDeviceNo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateEmp() {
        return createEmp;
    }

    public void setCreateEmp(String createEmp) {
        this.createEmp = createEmp;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateEmp() {
        return updateEmp;
    }

    public void setUpdateEmp(String updateEmp) {
        this.updateEmp = updateEmp;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "BeeDeviceInfo{" +
                "id='" + id + '\'' +
                ", deviceNo='" + deviceNo + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", deviceMac='" + deviceMac + '\'' +
                ", deviceImei='" + deviceImei + '\'' +
                ", deviceType=" + deviceType +
                ", deviceStatus=" + deviceStatus +
                ", deviceInfo='" + deviceInfo + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", lotteryAreaCode='" + lotteryAreaCode + '\'' +
                ", lotteryCenterCode='" + lotteryCenterCode + '\'' +
                ", channelCode='" + channelCode + '\'' +
                ", orderSource='" + orderSource + '\'' +
                ", address='" + address + '\'' +
                ", gpsX=" + gpsX +
                ", gpsY=" + gpsY +
                ", openTime='" + openTime + '\'' +
                ", closeTime='" + closeTime + '\'' +
                ", limitPrintCount=" + limitPrintCount +
                ", thirdDeviceNo='" + thirdDeviceNo + '\'' +
                ", createTime=" + createTime +
                ", createEmp='" + createEmp + '\'' +
                ", updateTime=" + updateTime +
                ", updateEmp='" + updateEmp + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
