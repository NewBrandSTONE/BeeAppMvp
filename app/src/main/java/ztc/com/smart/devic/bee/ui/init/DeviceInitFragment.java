package ztc.com.smart.devic.bee.ui.init;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import ztc.com.smart.devic.bee.R;
import ztc.com.smart.devic.bee.base.AbstractProxyFragment;

/**
 * 设备初始化页面
 *
 * @author jonesleborn
 */
public class DeviceInitFragment extends AbstractProxyFragment {

    private DeviceInitPresenter presenter;

    @Override
    protected Object setLayout() {
        return R.layout.lbn_device_init;
    }

    @Override
    protected void onBindView(@Nullable Bundle saveInstanceState, View rootView) {

    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        presenter = new DeviceInitPresenter(this);

        // 设置全局设备信息
        presenter.setApplicationDeviceInfo();
    }
}
