package com.syc.blogbroadcast;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.support.v4.content.LocalBroadcastManager;

/**
 * Created by suyichen on 2019/2/14.
 */

public class LocalService extends Service {

    private static final String LOCAL_BROADCAST = "INTENT.SUYICHEN.BROADCAST.LOCAL";

    LocalReceiver mLocalReceiver = new LocalReceiver();//get LocalReceiver

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        LocalBroadcastManager.getInstance(this).registerReceiver(mLocalReceiver,new IntentFilter(LOCAL_BROADCAST));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mLocalReceiver);
    }


}
