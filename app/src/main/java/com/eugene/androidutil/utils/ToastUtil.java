package com.eugene.androidutil.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast统一管理类
 */

public class ToastUtil {
    private ToastUtil() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    private static Toast toast;

    /**
     * 自定义显示Toast
     *
     * @param context
     * @param text
     * @param gravity
     * @param duration
     */
    public static void makeText(Context context, CharSequence text, int gravity, int duration) {
        if (toast == null) {
            toast = Toast.makeText(context, text, duration);
        } else {
            toast.setText(text);
            toast.setDuration(duration);
        }
        if (gravity != 0) {
            toast.setGravity(gravity, 0, 0);
        }
        toast.show();
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param text
     */
    public static void showToastShort(Context context, CharSequence text) {
        makeText(context, text, 0, Toast.LENGTH_SHORT);
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param res
     */
    public static void showToastShort(Context context, int res) {
        makeText(context, context.getText(res), 0, Toast.LENGTH_SHORT);
    }

    /**
     * 长时间显示Toast
     *
     * @param text
     */
    public static void showToastLong(Context context, CharSequence text) {
        makeText(context, text, 0, Toast.LENGTH_LONG);
    }

    /**
     * 长时间显示Toast
     *
     * @param res
     */
    public static void showToastLong(Context context, int res) {
        makeText(context, context.getText(res), 0, Toast.LENGTH_LONG);
    }
}
