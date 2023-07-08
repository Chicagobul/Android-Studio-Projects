package com.example.test;

import android.view.View;
import android.widget.*;
import android.os.Bundle;
import android.app.*;

public class MyfirstprojectActivity extends Activity 
{

	Button btn;
	EditText txt;
	int count;
	@Override
	public void onCreate(Bundle savedInstanceState)  
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		btn=(Button) findViewById(R.id.btn);
		txt=(EditText) findViewById(R.id.txt);
		
		btn.setOnClickListener(new View.OnClickListener() 
		{
			
			public void onClick(View arg0) 
			{
				try
				{
					String str = txt.getText().toString();
					count=Integer.parseInt(str);
					count=count+1;
					txt.setText(Integer.toString(count));
				}
				catch(Exception e)
				{
					txt.setText("Enter the integer value");
				}
				
			}
		});
	}
}