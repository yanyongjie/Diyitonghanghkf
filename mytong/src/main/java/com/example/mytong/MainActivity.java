package com.example.mytong;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.mytong.base.BaseActivity;
import com.example.mytong.beans.ListNewsChannel;
import com.example.mytong.contact.ListNewsChanneiI;
import com.example.mytong.presenter.IListNewsChannelP;
import com.tencent.bugly.crashreport.CrashReport;

import java.util.ArrayList;


public class MainActivity extends BaseActivity<ListNewsChanneiI.ListNewsChannelV, IListNewsChannelP<ListNewsChanneiI.ListNewsChannelV>> implements ListNewsChanneiI.ListNewsChannelV {


    private Button butt;



    @Override
    protected void initDate() {
        butt=findViewById(R.id.butt);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1.获取 NotifcationManager 实例
                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, new Intent(MainActivity.this, Main2Activity.class), PendingIntent.FLAG_UPDATE_CURRENT);
                Notification notification = new Notification.Builder(MainActivity.this)
                        .setContentTitle("标题")
                        .setContentText("内容")
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentIntent(pendingIntent)
                        .build();
                NotificationManager manager =(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(1, notification);







// ArrayList<String> strings =null;
//                Log.e("aa",strings.size()+"");
//                NotificationManager systemService = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//                Notification.Builder builder = new Notification.Builder(MainActivity.this);
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//                    Notification build = builder.setContentText("通知")
//                            .setContentText("数据").setAutoCancel(true)
//                            .setDefaults(Notification.DEFAULT_VIBRATE)
//                            .setDefaults(Notification.DEFAULT_LIGHTS)
//                            .setVibrate(new long[]{10, 20}).build();
//                    systemService.notify(1,build);
//                }


            }
        });

    }

    @Override
    protected IListNewsChannelP<ListNewsChanneiI.ListNewsChannelV> createPresenter() {
        return null;
    }

    @Override
    protected int createLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void showListNewsTab(ListNewsChannel listNewsChannel) {

    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void showProgressbar() {

    }

    @Override
    public void hintProgressbar() {

    }


}
