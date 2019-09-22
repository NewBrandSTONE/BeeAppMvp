package com.young.android.bee.busniess.ui.init;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.young.android.bee.busniess.R;
import com.young.android.bee.busniess.ui.base.AbstractProxyFragment;

/**
 * 设备初始化页面
 *
 * @author jonesleborn
 */
public class DeviceInitFragment extends AbstractProxyFragment {

    private DeviceInitPresenter presenter;
    private TextView mContentTv;

    @Override
    protected Object setLayout() {
        return R.layout.lbn_device_init;
    }

    @Override
    protected void onBindView(@Nullable Bundle saveInstanceState, View rootView) {
        mContentTv = rootView.findViewById(R.id.tv_content);
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        presenter = new DeviceInitPresenter(this);

        // 设置全局设备信息
        presenter.setApplicationDeviceInfo();
    }

    public void setContentTextView(String content) {
        if (TextUtils.isEmpty(content) || mContentTv == null) {
            return;
        }
        mContentTv.setText(content);
    }
}
