package com.syc.blogbroadcast;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String STATIC_BROADCAST = "INTENT.SUYICHEN.STATIC.BROADCAST";
    private static final String DYNAMIC_BROADCAST = "INTENT.SUYICHEN.DYNAMIC.BROADCAST";
    private static final String ORDERED_BROADCAST = "INTENT.SUYICHEN.ORDERED";
    private static final String LOCAL_BROADCAST = "INTENT.SUYICHEN.BROADCAST.LOCAL";
    private static final String DOUBLE_ACTION_ONE = "INTENT.SUYICHEN.DOUBLE.ACTION.ONE";
    private static final String DOUBLE_ACTION_TWO = "INTENT.SUYICHEN.DOUBLE.ACTION.TWO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(MainActivity.this,DynamicBroadcast.class));
        startService(new Intent(MainActivity.this,LocalService.class));
    }

    public void BroadcastToStatic(View view) {
        Intent intent = new Intent();
        intent.setAction(STATIC_BROADCAST);
        intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
        sendBroadcast(intent);
    }

    public void BroadcastToDynamic(View view) {
        Intent intent = new Intent();
        intent.setAction(DYNAMIC_BROADCAST);
        intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
        sendBroadcast(intent);
    }

    public void BroadcastToOrdered(View view) {
        Intent intent = new Intent();
        intent.setAction(ORDERED_BROADCAST);
        intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
        sendOrderedBroadcast(intent,null);
    }

    public void LocalBroadcast(View view) {
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(LOCAL_BROADCAST));
    }

    public void DoubleBroadcast1(View view) {
        Intent intent = new Intent();
        intent.setAction(DOUBLE_ACTION_ONE);
        intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
        sendBroadcast(intent);
    }

    public void DoubleBroadcast2(View view) {
        Intent intent = new Intent();
        intent.setAction(DOUBLE_ACTION_TWO);
        intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
        sendBroadcast(intent);
    }
}
