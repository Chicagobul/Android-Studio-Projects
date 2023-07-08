package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.Toast;
import android.content.Intent;

public class PassingDataActivity extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void onClick(View view)
    {
    	Intent i = new Intent("com.example.test.Second.class");
    	i.putExtra("str1", "this is a string");
    	i.putExtra("age1", "25");
    	Bundle extras = new Bundle();
    	extras.putString("str2", "this is another string");
    	extras.putInt("age2", 35);
    	i.putExtras(extras);
    	startActivityForResult(i,1);
    }
    public void onActivityResult(int requestCode,int resultCode,Intent data)
    {
    	if(requestCode == 1)
    	{
    		if(resultCode == RESULT_OK)
    		{
    			Toast.makeText(this, Integer.toString(data.getIntExtra("age3", 0)),Toast.LENGTH_SHORT).show();
    			Toast.makeText(this, data.getData().toString(), Toast.LENGTH_SHORT).show();
    		}
    	}
    }
}