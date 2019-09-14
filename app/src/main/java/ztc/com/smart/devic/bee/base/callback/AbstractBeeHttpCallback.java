package ztc.com.smart.devic.bee.base.callback;

import android.text.TextUtils;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * 网络请求回调函数封装
 *
 * @author O.z Young
 * @version 2019-09-14
 */
public abstract class AbstractBeeHttpCallback<T> extends Callback<T> {

    private static final String LOG_TAG = "BeeCallback";

    @Override
    public T parseNetworkResponse(Response response, int id) throws Exception {

        if (response == null) {
            return null;
        }

        ResponseBody body = response.body();
        if (body == null) {
            return null;
        }

        String string = body.string();
        if (TextUtils.isDigitsOnly(string)) {
            return null;
        }

        return JSON.parseObject(string, new TypeReference<T>() {
        });

    }

    @Override
    public void onError(Call call, Exception e, int id) {
        Log.e(LOG_TAG, "onError: ", e);
        onHandleError(call, e, id);
    }

    @Override
    public void onResponse(T response, int id) {

        if (response == null) {
            return;
        }

        onHandleResponse(response, id);
    }

    /**
     * 处理失败回调
     *
     * @param call call
     * @param e    Excepiton
     * @param id   id
     */
    abstract void onHandleError(Call call, Exception e, int id);

    /**
     * 处理响应结果
     *
     * @param response response
     * @param id       id
     */
    abstract void onHandleResponse(T response, int id);
}
