package com.syc.blogbroadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String STATIC_BROADCAST = "INTENT.SUYICHEN.STATIC.BROADCAST";
    private static final String DYNAMIC_BROADCAST = "INTENT.SUYICHEN.DYNAMIC.BROADCAST";
    private static final String ORDERED_BROADCAST = "INTENT.SUYICHEN.ORDERED";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(MainActivity.this,DynamicBroadcast.class));
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
}
