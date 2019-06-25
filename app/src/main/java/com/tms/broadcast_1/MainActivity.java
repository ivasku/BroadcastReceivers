package com.tms.broadcast_1;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ExampleBroadcastReceiver exampleBroadcastReceiver = new ExampleBroadcastReceiver(); // dynamic receiver

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        //post nuggat dynamic receiver
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(exampleBroadcastReceiver, filter);
    }

    @Override
    protected void onStop() {
        super.onStop();

        //unregister receiver
        unregisterReceiver(exampleBroadcastReceiver);
    }

}
