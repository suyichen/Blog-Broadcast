package com.syc.blogbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by suyichen on 2019/2/14.
 */

public class LocalReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("LocalReceiver","LocalReceiver is accept");
    }
}
