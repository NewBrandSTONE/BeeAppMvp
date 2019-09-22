package ztc.com.smart.devic.bee.base.callback;

import android.text.TextUtils;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.young.android.lib.common.constants.BeeUrlConstant;
import com.young.android.lib.common.models.base.BaseResponse;
import com.zhy.http.okhttp.callback.Callback;

import java.lang.reflect.Type;

import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * 网络请求回调函数封装
 *
 * @author O.z Young
 * @version 2019-09-14
 */
public abstract class AbstractBeeHttpCallback<T> extends Callback<BaseResponse<T>> {

    private static final String LOG_TAG = "BeeCallback";

    @Override
    public BaseResponse<T> parseNetworkResponse(Response response, int id) throws Exception {

        if (response == null) {
            return null;
        }

        ResponseBody body = response.body();
        if (body == null) {
            return null;
        }

        String string = body.string();
        if (TextUtils.isEmpty(string)) {
            return null;
        }

        Log.d(LOG_TAG, "parseNetworkResponse: " + string);

        return JSON.parseObject(string, new TypeReference<BaseResponse<T>>(getActualType()) {
        });
    }

    @Override
    public void onError(Call call, Exception e, int id) {
        Log.e(LOG_TAG, "onError: ", e);
        onHandleError(call, e, id);
    }

    @Override
    public void onResponse(BaseResponse<T> response, int id) {

        if (response == null) {
            return;
        }

        if (BeeUrlConstant.SUCCESS_CODE.equals(response.getCode())) {
            onHandleResponseSuccess(response.getData(), id);
        } else {
            onHandleResponseError(response);
        }
    }

    /**
     * 处理失败回调
     *
     * @param call call
     * @param e    Excepiton
     * @param id   id
     */
    public abstract void onHandleError(Call call, Exception e, int id);

    /**
     * 处理响应结果
     *
     * @param response response
     * @param id       id
     */
    public abstract void onHandleResponseSuccess(T response, int id);

    /**
     * 处理错误信息
     *
     * @param response response
     */
    public abstract void onHandleResponseError(BaseResponse<T> response);

    /**
     * 获取实际的类型
     *
     * @return type
     */
    public abstract Type getActualType();
}
