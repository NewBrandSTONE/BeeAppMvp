package ztc.com.smart.devic.bee.widgets.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import ztc.com.smart.devic.bee.R;

public class LBNLoadingDialog extends Dialog {

    private Context context;
    private View dialogView;
    private int resStyle = -1;
    private String message;
    private static final int DEFAULT_WIDTH = 900;
    private static final int DEFAULT_HEIGHT = 500;

    private LBNLoadingDialog(LBNLoadingDialogBuilder builder) {
        super(builder.context);
        initView(builder);
    }

    private LBNLoadingDialog(LBNLoadingDialogBuilder builder, int resStyle) {
        super(builder.context, resStyle);
        initView(builder);
    }

    private void initView(LBNLoadingDialogBuilder builder) {
        context = builder.context;
        dialogView = builder.dialogView;
        resStyle = builder.resStyle;
        message = builder.message;
    }

    public static final class LBNLoadingDialogBuilder {

        private Context context;
        private View dialogView;
        private int resStyle = -1;
        private String message;

        private LBNLoadingDialogBuilder() {
        }

        public LBNLoadingDialogBuilder(Context context) {
            this.context = context;
        }

        public LBNLoadingDialogBuilder dialogView(int resDialogView) {
            dialogView = View.inflate(context, resDialogView, null);
            return this;
        }

        public LBNLoadingDialogBuilder resStyle(int resStyle) {
            this.resStyle = resStyle;
            return this;
        }

        public LBNLoadingDialogBuilder message(String message) {
            this.message = message;
            return this;
        }

        public LBNLoadingDialog build() {
            if (resStyle == -1) {
                return new LBNLoadingDialog(this);
            } else {
                return new LBNLoadingDialog(this, resStyle);
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 加载默认的dialogView
        loadDefaultDialogView();

        // 设置LoadingDialog宽和高
        setDialogWidthHeight();

        // 设置默认消息
        setDialogMessage(dialogView);

    }

    private void loadDefaultDialogView() {
        if (dialogView == null) {
            dialogView = View.inflate(context, R.layout.lbn_loading_dialog, null);
        }
    }

    private void setDialogWidthHeight() {
        // 设定Dialog高度和宽度
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams lp = window.getAttributes();
            if (lp != null) {
                lp.height = DEFAULT_HEIGHT;
                lp.width = DEFAULT_WIDTH;
            }
            window.setAttributes(lp);
        }
    }

    private void setDialogMessage(View view) {
        TextView tv = view.findViewById(R.id.tv_loading_message);
        if (tv != null && !TextUtils.isEmpty(message)) {
            tv.setText(message);
        }
    }

    public static LBNLoadingDialog createDefaultLoadingDialog(Context context) {
        LBNLoadingDialogBuilder builder = new LBNLoadingDialogBuilder(context);
        return builder.dialogView(R.layout.lbn_loading_dialog)
                .message(context.getString(R.string.lbn_loading_dialog_message))
                .build();
    }
}
