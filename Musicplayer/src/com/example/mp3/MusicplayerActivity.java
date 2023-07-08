package com.example.mp3;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.ToggleButton;
import android.view.*;


public class MusicplayerActivity extends Activity 
{
	MediaPlayer mp;
	ToggleButton tb;
	SeekBar sb;
	Button stop;
	Handler seekHandler = new Handler();
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        getInit();
        seekUpdation();
    }
    public void stop(View view)
    {
    	mp.reset();
    	tb.setChecked(false);
    }
    public void getInit()
    {
    	sb = (SeekBar) findViewById(R.id.seek);
    	mp = MediaPlayer.create(this,R.raw.chahiye_thoda_pyar);
    	mp.setLooping(true);
    	mp.setVolume(100,100);
    	sb.setMax(mp.getDuration());
    	stop = (Button) findViewById(R.id.stop);
    	stop.setEnabled(false);
    }
    public void play_pause(View v)
    {
    	tb = (ToggleButton) findViewById(R.id.play_pause);
    	if(tb.isChecked())
    	{
    		mp.start();
    		stop.setEnabled(true);
    	}
    	else
    	{
    		mp.pause();
    	}
    	
    }
    Runnable run = new Runnable()
    {
    	public void run()
    	{
    		seekUpdation();
    	}
    };
    public void seekUpdation()
    {
    	sb.setProgress(mp.getCurrentPosition());
    	seekHandler.postDelayed(run,1000);
    }
}