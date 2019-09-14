package ztc.com.smart.devic.bee;

import android.os.Bundle;

import ztc.com.smart.devic.bee.base.AbstractProxyActivity;
import ztc.com.smart.devic.bee.base.AbstractProxyFragment;
import ztc.com.smart.devic.bee.ui.init.DeviceInitFragment;

public class MainActivity extends AbstractProxyActivity {

    @Override
    public AbstractProxyFragment setRootDelegate() {
        return new DeviceInitFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
