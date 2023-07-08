package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;
import android.app.*;

public class DialogboxActivity extends Activity 
{
	CharSequence[] item = {"google","apple","microsoft"};
	boolean[] itemsChecked = new boolean [item.length];
	ProgressDialog dialog;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void onClick(View v)
    {
    	showDialog(0);
    }
    
    public void onClick2(View v)
    {
    	showDialog(1);
    	dialog.setProgress(0);
    	new Thread(new Runnable()
    	{
    		public void run()
    		{
    	
    			for (int i=1;i<=15;i++)
    			{
    				try
    				{
    					Thread.sleep(1000);
        				dialog.incrementProgressBy((int)(100/15));
    				}
    				catch(Exception e)
    				{
    					e.printStackTrace();
    				}
    			}
        		dialog.dismiss();
    		}
    	}).start();
    }
    protected Dialog onCreateDialog(int id)
    {
    	switch(id)
    	{
    	case 0:
    		return new AlertDialog.Builder(this)
    		.setIcon(R.drawable.ic_launcher)
    		.setTitle("this is a dialog with some simple text")
    		.setPositiveButton("ok",new DialogInterface.OnClickListener() 
    		{
    			
				
		        @Override
			    public void onClick(DialogInterface arg0, int whichButton) 
		        {
					Toast.makeText(getBaseContext(), "ok clicked", Toast.LENGTH_SHORT).show();
					
				}
			})
			.setNegativeButton("cancle",new DialogInterface.OnClickListener() 
			{
				
				@Override
				public void onClick(DialogInterface arg0, int whichButton) 
				{
					Toast.makeText(getBaseContext(), "cancle clicked", Toast.LENGTH_SHORT).show();
					
				}
			})
			.setMultiChoiceItems(item, itemsChecked, new DialogInterface.OnMultiChoiceClickListener() 
			{
				
				@Override
				public void onClick(DialogInterface dialog, int which, boolean isChecked) 
				{
					Toast.makeText(getBaseContext(), item[which] + (isChecked ? "checked":"unchecked"),Toast.LENGTH_SHORT).show();
					
				}
			}).create();
    		
    	case 1:
    		dialog = new ProgressDialog(this);
    		dialog.setTitle("Downloading Files...");
    		dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
    		dialog.setButton(DialogInterface.BUTTON_POSITIVE,"OK",new DialogInterface.OnClickListener() 
    		{
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					Toast.makeText(getBaseContext(), "OK Clicked", Toast.LENGTH_LONG).show();
					
				}
			});
    		dialog.setButton(DialogInterface.BUTTON_NEGATIVE,"CANCEL",new DialogInterface.OnClickListener() 
    		{
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					Toast.makeText(getBaseContext(), "Cancel Clicked", Toast.LENGTH_LONG).show();
					
				}
			});
    		return dialog;
    	}	
    	return null;
    }
}