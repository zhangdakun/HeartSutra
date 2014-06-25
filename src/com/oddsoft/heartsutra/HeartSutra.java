// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.oddsoft.heartsutra;

import net.youmi.android.AdManager;
import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

import com.android.adlib.ADbaseActivity;
import com.myappsoft.heartsutang.R;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.LinearLayout;

public class HeartSutra extends ADbaseActivity
{

    public HeartSutra()
    {
    }

    private void startMusic()
    {
        mp = MediaPlayer.create(getBaseContext(), 0x7f040000);
        mp.setLooping(true);
        mp.start();
    }

    private void stopMusic()
    {
        if(mp != null)
        {
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    public void adWhirlGeneric()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030000);
        AdManager.getInstance(this).init("43379ed147430191",
        	    "66c212f43bd00b33", false);
      LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
      AdView adView = new AdView(this, AdSize.FIT_SCREEN);
      adLayout.addView(adView);
        setVolumeControlStream(3);
        startMusic();
//        AdWhirlLayout adwhirllayout = new AdWhirlLayout(this, "08b4bd3dfe0d45cfbd9e69b108e00e96");
//        LinearLayout linearlayout = (LinearLayout)findViewById(0x7f060001);
//        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
//        float f = getResources().getDisplayMetrics().density;
//        adwhirllayout.setAdWhirlInterface(this);
//        adwhirllayout.setMaxWidth((int)(f * (float)320));
//        adwhirllayout.setMaxHeight((int)(f * (float)52));
//        layoutparams.addRule(14);
//        linearlayout.setGravity(1);
//        linearlayout.addView(adwhirllayout, layoutparams);
//        linearlayout.invalidate();
    }


    protected void onDestroy()
    {
        stopMusic();
        super.onDestroy();
    }

 

    protected void onPause()
    {
        super.onPause();
    }

    private static final int ABOUT_ID = 1;
    private static final int EXIT_ID = 2;
    private static final String TAG = "HeartSutra";
    private MediaPlayer mp;
}
