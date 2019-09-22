package ztc.com.smart.devic.bee.ui.init;

import android.util.Log;

import com.young.android.lib.common.models.base.BaseResponse;

import java.lang.reflect.Type;

import okhttp3.Call;
import ztc.com.smart.devic.bee.base.callback.AbstractBeeHttpCallback;
import ztc.com.smart.devic.bee.beans.BeeDeviceInfo;

/**
 * 设备信息P层
 *
 * @author jonesleborn
 */
public class DeviceInitPresenter {

    private static final String LOG_TAG = "deviceP";

    private DeviceInitFragment view;
    private DeviceInitModel model;

    public DeviceInitPresenter(DeviceInitFragment view) {
        this.view = view;
        model = new DeviceInitModel();
    }

    public void setApplicationDeviceInfo() {
        view.showLoading();
        model.loadDeviceInfo(new AbstractBeeHttpCallback<BeeDeviceInfo>() {
            @Override
            public void onHandleError(Call call, Exception e, int id) {
                view.hideLoading();

                // 处理视图层异常逻辑
                Log.e(LOG_TAG, "onHandleError: ", e.getCause());
            }

            @Override
            public void onHandleResponseSuccess(BeeDeviceInfo deviceInfo, int id) {
                view.hideLoading();

                // 处理视图层正常逻辑
                Log.d(LOG_TAG, "onHandleResponseSuccess: " + deviceInfo);
                view.setContentTextView(deviceInfo.getDeviceNo());
            }

            @Override
            public void onHandleResponseError(BaseResponse<BeeDeviceInfo> response) {
                Log.e(LOG_TAG, "onHandleResponseError: " + response.getMsg());
            }

            @Override
            public Type getActualType() {
                return BeeDeviceInfo.class;
            }
        });
    }


}
