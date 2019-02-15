package com.syc.blogbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by suyichen on 2019/2/15.
 */

public class DoubleActionBroadcast extends BroadcastReceiver {

    private static final String DOUBLE_ACTION_ONE = "INTENT.SUYICHEN.DOUBLE.ACTION.ONE";
    private static final String DOUBLE_ACTION_TWO = "INTENT.SUYICHEN.DOUBLE.ACTION.TWO";

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if(action.equals(DOUBLE_ACTION_ONE)){
            Log.e(this.getClass().getName(),"accept to"+DOUBLE_ACTION_ONE);
        }

        if(action.equals(DOUBLE_ACTION_TWO)){
            Log.e(this.getClass().getName(),"accept to"+DOUBLE_ACTION_TWO);
        }
    }
}
