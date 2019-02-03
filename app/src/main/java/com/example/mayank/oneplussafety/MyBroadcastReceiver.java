package com.example.mayank.oneplussafety;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

import com.example.mayank.oneplussafety.R;

/**
 * Created by vaibhav on 24/7/18.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
MediaPlayer mediaPlayer;
    @Override
    public void onReceive(Context context, Intent intent) {
        mediaPlayer = MediaPlayer.create(context, R.raw.policesiren);
        mediaPlayer.start();
        Toast.makeText(context,"Alarm..",Toast.LENGTH_SHORT).show();
    }
}
