package com.yixikeji.yixibizhi;

import android.app.Application;
import android.content.Context;

public class YIXIBizhiApplication  extends Application {
    public  static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }

    public static Context getMyAppContext() {
        return context;
    }
}
