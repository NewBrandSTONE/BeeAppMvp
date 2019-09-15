package ztc.com.smart.devic.bee.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.yokeyword.fragmentation.SupportFragment;

public abstract class AbstractProxyFragment extends SupportFragment implements IBaseView {

    protected abstract Object setLayout();

    private View mRootView;

    /**
     * 绑定视图时的回调方法
     *
     * @param saveInstanceState
     * @param rootView
     */
    protected abstract void onBindView(@Nullable Bundle saveInstanceState, View rootView);

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater
            , @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView;
        if (setLayout() instanceof Integer) {
            rootView = inflater.inflate((Integer) setLayout(), null);
        } else if (setLayout() instanceof View) {
            rootView = (View) setLayout();
        } else {
            throw new RuntimeException("setLayout() must return view or layout id");
        }
        mRootView = rootView;
        onBindView(savedInstanceState, rootView);
        return rootView;
    }

    protected View getRootView() {
        return mRootView;
    }

    @Override
    public void showLoading() {
        AbstractProxyActivity proxyActivity = (AbstractProxyActivity) getActivity();
        if (proxyActivity != null) {
            proxyActivity.showLoading();
        }
    }

    @Override
    public void hideLoading() {
        AbstractProxyActivity proxyActivity = (AbstractProxyActivity) getActivity();
        if (proxyActivity != null) {
            proxyActivity.hideLoading();
        }
    }

}
