package com.syc.blogbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by suyichen on 2019/2/13.
 */

public class OrderedBroadcastTwo extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("OrderedBroadcast",this.getClass().getName()+"already received");
    }
}
