package smc.minjoon.accompanying.LockScreen;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import smc.minjoon.accompanying.LockScreen.ScreenService;

/**
 * Created by skaqn on 2017-10-03.
 */

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            Intent i = new Intent(context, ScreenService.class);
            context.startService(i);
        }
    }
}


