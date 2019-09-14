package ztc.com.smart.devic.bee.utils;

import android.os.SystemClock;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.young.android.library.common.models.base.BaseRequest;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.MediaType;

/**
 * Http请求工具类
 *
 * @author jonesleborn
 */
public class HttpClientUtil {

    private HttpClientUtil() {

    }

    private static final String TAG = "HttpClientUtil";

    private static final String REQ_ID_PREFIX = "FCG_";

    /**
     * 使用POST方式提交JSON数据
     *
     * @param url         地址
     * @param jsonContent json数据
     * @param callback    回调
     */
    public static void postJson(String url, Object jsonContent, Callback callback) {

        BaseRequest<Object> baseRequest = new BaseRequest<>();
        baseRequest.setData(jsonContent);
        baseRequest.setReqId(getReqId());

        String jsonPostData = JSON.toJSONString(baseRequest);

        Log.d(TAG, "postJson: " + jsonPostData);
        Log.d(TAG, "postJson url: " + url);

        OkHttpUtils
                .postString()
                .url(url)
                .content(jsonPostData)
                .mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(callback);
    }

    private static String getReqId() {
        return REQ_ID_PREFIX + SystemClock.currentThreadTimeMillis();
    }

}
