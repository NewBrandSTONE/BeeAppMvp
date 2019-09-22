package com.young.android.lib.common.models.base;

/**
 * 请求包装类
 *
 * @author O.z Young
 * @version 2019-09-13
 */
public class BaseRequest<T> extends BaseModel {

    private String reqId;
    private String sign;
    private String token;
    private T data;

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "reqId='" + reqId + '\'' +
                ", sign='" + sign + '\'' +
                ", token='" + token + '\'' +
                ", data=" + data +
                '}';
    }
}
