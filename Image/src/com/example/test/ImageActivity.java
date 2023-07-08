package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.content.*;
import android.os.*;

public class ImageActivity extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        new Handler().postDelayed(new Runnable()
        {
        	@Override
        	public void run()
        	{
        		try
        		{
        			Thread.sleep(2000);

    				Intent intent = new Intent(ImageActivity.this,Second.class);
    				startActivity(intent);

        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        	
        },2000);
        
		
    }
}