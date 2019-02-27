package com.example.mytong.http;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

public class MyApp extends Application {
    public  static MyApp myApp;

    @Override
    public void onCreate() {
        super.onCreate();
        myApp=this;
        CrashReport.initCrashReport(getApplicationContext(),"372f1243bf",false);
       // UMConfigure.init(Context context, String appkey, String channel, int deviceType, String pushSecret);
    }

    public static MyApp getMyApp() {
        return myApp;
    }
}
