package com.young.android.library.common.models.base;

/**
 * 响应包装类
 *
 * @author O.z Young
 * @version 2019-09-13
 */
public class BaseResponse<T> extends BaseModel {

    private String reqId;
    private String code;
    private String msg;
    private T data;

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "reqId='" + reqId + '\'' +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
