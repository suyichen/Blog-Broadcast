package com.syc.blogbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by suyichen on 2019/2/11.
 */

public class StaticBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "This is StaticBroadcast", Toast.LENGTH_SHORT).show();
    }
}
