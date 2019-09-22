package ztc.com.smart.devic.bee;

import android.os.Bundle;

import com.young.android.bee.busniess.ui.init.DeviceInitFragment;

import com.young.android.bee.busniess.ui.base.AbstractProxyActivity;
import com.young.android.bee.busniess.ui.base.AbstractProxyFragment;

/**
 * 启动类Activity
 *
 * @author jonesleborn
 */
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
