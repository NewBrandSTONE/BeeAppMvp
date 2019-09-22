package com.young.android.lib.common.models.init;

import com.young.android.lib.common.models.base.BaseModel;

/**
 * 设备信息请求对象
 *
 * @author O.z Young
 * @version 2019-09-13
 */
public class DeviceInitRequest extends BaseModel {

    private String deviceImei;

    public String getDeviceImei() {
        return deviceImei;
    }

    public void setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
    }

    @Override
    public String toString() {
        return "DeviceInitRequest{" +
                "deviceImei='" + deviceImei + '\'' +
                '}';
    }

}
