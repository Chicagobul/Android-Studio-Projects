package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;

public class Second extends Activity
{
	 @Override
	    public void onCreate(Bundle savedInstanceState) 
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main2);
	        Toast.makeText(this, getIntent().getStringExtra("str1"), Toast.LENGTH_SHORT).show();
	        Toast.makeText(this, Integer.toString(getIntent().getIntExtra("age1", 0)), Toast.LENGTH_SHORT).show();
	        Bundle bundle = getIntent().getExtras();
	        Toast.makeText(this, bundle.getString("str2"), Toast.LENGTH_SHORT).show();
	        Toast.makeText(this, Integer.toString(bundle.getInt("age2")), Toast.LENGTH_SHORT).show();
            	   
         }
	 public void onClick(View view)
	 {
		 Intent i = new Intent();
		 i.putExtra("age3", 45);
		 i.setData(Uri.parse("something passed back to main activity"));
		 setResult(RESULT_OK, i);
		 finish();
	 }
}
	 
