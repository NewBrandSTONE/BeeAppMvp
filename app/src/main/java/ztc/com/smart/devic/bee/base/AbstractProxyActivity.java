package ztc.com.smart.devic.bee.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;

import me.yokeyword.fragmentation.SupportActivity;
import me.yokeyword.fragmentation.anim.DefaultNoAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;
import ztc.com.smart.devic.bee.R;
import ztc.com.smart.devic.bee.widgets.dialog.LBNLoadingDialog;

/**
 * 抽象类Activity
 *
 * @author jonesleborn
 */
public abstract class AbstractProxyActivity extends SupportActivity
        implements IBaseView {
    /**
     * 设置根布局
     *
     * @return 根布局
     */
    public abstract AbstractProxyFragment setRootDelegate();

    private LBNLoadingDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContainer(savedInstanceState);
    }

    protected void initContainer(Bundle savedInstanceState) {
        final FrameLayout frameLayout
                = new FrameLayout(this);
        frameLayout.setId(R.id.delegate_container);
        setContentView(frameLayout);
        if (savedInstanceState == null) {
            loadRootFragment(R.id.delegate_container, setRootDelegate());
        }
    }

    @Override
    public FragmentAnimator onCreateFragmentAnimator() {
        return new DefaultNoAnimator();
    }

    @Override
    public void showLoading() {
        dialog = LBNLoadingDialog.createDefaultLoadingDialog(this);
    }

    @Override
    public void hideLoading() {
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
