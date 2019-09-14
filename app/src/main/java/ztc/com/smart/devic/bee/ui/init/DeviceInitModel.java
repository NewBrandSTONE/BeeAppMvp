package ztc.com.smart.devic.bee.ui.init;


import com.zhy.http.okhttp.callback.Callback;

/**
 * 设备初始化Model层，负责调用Repository获取数据，以及对数据的处理
 *
 * @author jonesleborn
 */
public class DeviceInitModel {

    private DeviceInitRepository initRepository;

    public DeviceInitModel() {
        initRepository = new DeviceInitRepository();
    }

    public void loadDeviceInfo(Callback callback) {
        initRepository.fetchDeviceInfo(callback);
    }

}
