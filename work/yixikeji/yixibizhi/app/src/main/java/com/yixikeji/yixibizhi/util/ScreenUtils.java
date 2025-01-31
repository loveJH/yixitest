package com.yixikeji.yixibizhi.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.ViewConfiguration;


import com.yixikeji.yixibizhi.YIXIBizhiApplication;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/2/3.
 */
public class ScreenUtils {
    //获取虚拟按键的高度
    public static int getNavigationBarHeight(Context context) {
        int result = 0;
        if (hasNavBar(context)) {
            Resources res = context.getResources();
            int resourceId = res.getIdentifier("navigation_bar_height", "dimen", "android");
            if (resourceId > 0) {
                result = res.getDimensionPixelSize(resourceId);
            }
        }
        return result;
    }

    /**
     * 检查是否存在虚拟按键栏
     *
     * @param context
     * @return
     */
    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    public static boolean hasNavBar(Context context) {
        Resources res = context.getResources();
        int resourceId = res.getIdentifier("config_showNavigationBar", "bool", "android");
        if (resourceId != 0) {
            boolean hasNav = res.getBoolean(resourceId);
            // check override flag
            String sNavBarOverride = getNavBarOverride();
            if ("1".equals(sNavBarOverride)) {
                hasNav = false;
            } else if ("0".equals(sNavBarOverride)) {
                hasNav = true;
            }
            return hasNav;
        } else { // fallback
            return !ViewConfiguration.get(context).hasPermanentMenuKey();
        }
    }

    /**
     * 判断虚拟按键栏是否重写
     *
     * @return
     */
    private static String getNavBarOverride() {
        String sNavBarOverride = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            try {
                Class c = Class.forName("android.os.SystemProperties");
                Method m = c.getDeclaredMethod("get", String.class);
                m.setAccessible(true);
                sNavBarOverride = (String) m.invoke(null, "qemu.hw.mainkeys");
            } catch (Throwable e) {
            }
        }
        return sNavBarOverride;
    }

    public static int getScreenWidth() {
        return YIXIBizhiApplication.getMyAppContext().getResources().getDisplayMetrics().widthPixels;
    }

    public static int getShortForPx(int px) {
        return getScreenShort() * px / 1080;//设计尺寸宽度1080
    }

    public static int getScreenHeight() {
        return YIXIBizhiApplication.getMyAppContext().getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenShort() {
        if (getScreenWidth() < getScreenHeight()) {
            return getScreenWidth();
        } else {
            return getScreenHeight();
        }
    }
}