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

        //pre nuggat this doesn`t work when we register the action statically via manifest but we must add it dynamic
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            Log.d(TAG, "onReceive: CONNECTIVITY_ACTION");

            //send boolean extra
            boolean noConn = intent.getBooleanExtra(
                    ConnectivityManager.EXTRA_NO_CONNECTIVITY, false
            );

            if (noConn) {
                Toast.makeText(context, "Houston we have a problem" , Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(context, "Internet works" , Toast.LENGTH_LONG).show();
            }
        }

    }

}
