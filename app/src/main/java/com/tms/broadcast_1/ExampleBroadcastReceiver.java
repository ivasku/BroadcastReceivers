package com.tms.broadcast_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.Log;
import android.widget.Toast;

public class ExampleBroadcastReceiver extends BroadcastReceiver {
    private static String TAG = "ExampleBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Log.d(TAG, "onReceive: BOOT COMPLETED");
            Toast.makeText(context, "BOOT COMPLETED" , Toast.LENGTH_LONG).show();
        }

        //pre nuggat
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            Log.d(TAG, "onReceive: CONNECTIVITY_ACTION");
            Toast.makeText(context, "CONNECTIVITY_ACTION" , Toast.LENGTH_LONG).show();
        }

    }

}
