package com.example.newactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;

public class IntentActivity extends Activity 
{
    Button btn1;
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() 
        {
			
			public void onClick(View arg0) 
			{
				
				Intent intent = new Intent(IntentActivity.this,Second.class);
				startActivity(intent);
			}
		});
    }
}
