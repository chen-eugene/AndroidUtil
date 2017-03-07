package com.eugene.androidutil.utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.eugene.androidutil.R;


/**
 * Created by Administrator on 2016/11/16.
 */

public class UIUtil {

    /**
     * add Fragment
     *
     * @param activity
     * @param res
     * @param target
     * @param data
     */
    public static void addFragment(FragmentActivity activity, int res, String target, Bundle data) {
        Fragment fragment = Fragment.instantiate(activity, target, data);
        FragmentTransaction ft = activity.getSupportFragmentManager().beginTransaction();
        ft.add(res, fragment);
        ft.commit();
    }

    /**
     * 添加到返回栈
     *
     * @param activity
     * @param res
     * @param target
     * @param data
     */
    public static void addFragmentToBack(FragmentActivity activity, int res, String target, Bundle data) {
        Fragment fragment = Fragment.instantiate(activity, target, data);
        FragmentTransaction ft = activity.getSupportFragmentManager().beginTransaction();
//        ft.setCustomAnimations(R.anim.anim_in, R.anim.anim_out_500, 0, R.anim.anim_left_to_right);
        ft.add(res, fragment);
        ft.addToBackStack(target);
        ft.commit();
    }

    /**
     * replace Fragment
     *
     * @param activity
     * @param res
     * @param target
     * @param data
     */
    public static void replaceFragment(FragmentActivity activity, int res, String target, Bundle data) {
        Fragment fragment = Fragment.instantiate(activity, target, data);
        FragmentTransaction ft = activity.getSupportFragmentManager().beginTransaction();
        ft.replace(res, fragment);
        ft.commit();
    }

    /**
     * 添加到返回栈
     *
     * @param activity
     * @param res
     * @param target
     * @param data
     */
    public static void replaceFragmentToBack(FragmentActivity activity, int res, String target, Bundle data) {
        Fragment fragment = Fragment.instantiate(activity, target, data);
        FragmentTransaction ft = activity.getSupportFragmentManager().beginTransaction();
//        ft.setCustomAnimations(R.anim.anim_in, R.anim.anim_out_500, 0, R.anim.anim_left_to_right);
        ft.replace(res, fragment);
        ft.addToBackStack(target);
        ft.commit();
    }


}
