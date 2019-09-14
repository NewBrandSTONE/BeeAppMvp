package ztc.com.smart.devic.bee.ui.init;

import com.young.android.library.common.constants.BeeUrlConstant;
import com.young.android.library.common.models.init.DeviceInitRequest;
import com.zhy.http.okhttp.callback.Callback;

import ztc.com.smart.devic.bee.utils.HttpClientUtil;

/**
 * 设备信息获取类
 *
 * @author jonesleborn
 */
public class DeviceInitRepository {

    public void fetchDeviceInfo(Callback callback) {
        // 1.组装参数
        DeviceInitRequest request = new DeviceInitRequest();
        request.setDeviceImei("358240051111110");
        // 2.发起请求
        HttpClientUtil.postJson(BeeUrlConstant.DEVICE_INFO_URL, request, callback);
    }

}
