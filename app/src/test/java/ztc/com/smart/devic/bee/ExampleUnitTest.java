package ztc.com.smart.devic.bee;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.young.android.lib.common.models.base.BaseResponse;

import org.junit.Test;

import ztc.com.smart.devic.bee.beans.BeeDeviceInfo;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void fastJson() {
        String jsonContent = "{\"reqId\":\"111111\",\"code\":\"000\",\"msg\":\"success\",\"data\":{\"id\":\"100\",\"deviceNo\":\"SF-0001\",\"deviceName\":\"丰巢柜\",\"deviceMac\":\"2c:57:31:8b:52:04\",\"deviceImei\":\"358240051111110\",\"deviceType\":1,\"deviceStatus\":1,\"deviceInfo\":\"\",\"provinceCode\":\"\",\"cityCode\":\"420100\",\"lotteryAreaCode\":\"HB-001\",\"lotteryCenterCode\":\"szfc\",\"channelCode\":\"\",\"orderSource\":\"HB_FCG\",\"address\":\"湖北省武汉市汉阳区万科金域蓝湾云廷组团丰巢智能柜\",\"gpsX\":114.205078,\"gpsY\":30.551061,\"openTime\":\"00:00:00\",\"closeTime\":\"23:59:59\",\"limitPrintCount\":0,\"thirdDeviceNo\":\"FC0274122\",\"createTime\":null,\"createEmp\":\"\",\"updateTime\":null,\"updateEmp\":\"\",\"isDelete\":false}}";

        BaseResponse<BeeDeviceInfo> response = JSON.parseObject(jsonContent, new TypeReference<BaseResponse<BeeDeviceInfo>>() {
        });

        System.out.println(response);
    }
}