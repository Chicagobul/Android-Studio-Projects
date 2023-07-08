package com.example.intent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;

public class Intent2Activity extends Activity 
{
	Button btn1;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn1 = (Button) findViewById(R.id.btn1);
         
        btn1.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) 
			{
			   Intent intent = new Intent(Intent2Activity.this,Second.class);
			   startActivity(intent);
				
			}
		});
    }
}