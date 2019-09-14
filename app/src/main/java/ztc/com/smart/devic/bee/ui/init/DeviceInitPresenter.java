package ztc.com.smart.devic.bee.ui.init;

import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.young.android.library.common.constants.BeeUrlConstant;
import com.young.android.library.common.models.base.BaseResponse;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Call;
import okhttp3.Response;
import ztc.com.smart.devic.bee.beans.DeviceInfo;

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
        model.loadDeviceInfo(new Callback<BaseResponse<DeviceInfo>>() {
            @Override
            public BaseResponse<DeviceInfo> parseNetworkResponse(Response response, int id) throws Exception {
                if (response.body() == null) {
                    return null;
                }

                String res = response.body().string();
                return JSON.parseObject(res, new TypeReference<BaseResponse<DeviceInfo>>() {
                });
            }

            @Override
            public void onError(Call call, Exception e, int id) {
                Log.e(LOG_TAG, "onError: ", e);
            }

            @Override
            public void onResponse(BaseResponse<DeviceInfo> response, int id) {
                if (response == null) {
                    return;
                }

                if (BeeUrlConstant.SUCCESS_CODE.equals(response.getCode())) {
                    // 请求成功
                }
            }
        });
    }


}
