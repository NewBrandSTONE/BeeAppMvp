package ztc.com.smart.devic.bee.base;

/**
 * 给BaseActivity使用的规定的方法
 * 用来控制加载框的展示以及隐藏
 *
 * @author jonesleborn
 */
public interface IBaseView {

    /**
     * 弹出加载框
     */
    void showLoading();

    /**
     * 隐藏加载框
     */
    void hideLoading();

}
