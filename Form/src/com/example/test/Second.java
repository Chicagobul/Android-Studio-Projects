package com.example.test;

import java.io.FileInputStream;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Second extends Activity 
{
	Button btn_read;
	EditText output1,output2,output3,output4,output5,output6;
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        btn_read = (Button) findViewById(R.id.btn_read);
        output1 = (EditText) findViewById(R.id.output1);
        output2 = (EditText) findViewById(R.id.output2);
        output3 = (EditText) findViewById(R.id.output3);
        output4 = (EditText) findViewById(R.id.output4);
        output5 = (EditText) findViewById(R.id.output5);
        output6 = (EditText) findViewById(R.id.output6);
        final String name = "name.txt";
        final String age = "age.txt";
        final String email = "email.txt";
        final String password = "password.txt";
        final String gender = "gender.txt";
        final String address = "address.txt";
      
       btn_read.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) 
			{
                String line = "";
				
				try
				{
					FileInputStream fis = openFileInput(name);
					int c;
					while((c = fis.read())!= -1)
					{
					   line+=(char)c;
					}
					fis.close();
					Toast.makeText(getBaseContext(),"file read" ,Toast.LENGTH_SHORT).show();
				    output1.setText(line);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				String l = "";
				try
				{
					FileInputStream fis = openFileInput(age);
					int d;
					while((d = fis.read())!= -1)
					{
					   l+=(char)d;
					}
					fis.close();
				    output2.setText(l);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				String m = "";
				try
				{
					FileInputStream fis = openFileInput(email);
					int f;
					while((f = fis.read())!= -1)
					{
					   m+=(char)f;
					}
					fis.close();
				    output3.setText(m);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				String n = "";
				try
				{
					FileInputStream fis = openFileInput(password);
					int g;
					while((g = fis.read())!= -1)
					{
					   n+=(char)g;
					}
					fis.close();
				    output4.setText(n);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				String o = "";
				try
				{
					FileInputStream fis = openFileInput(gender);
					int h;
					while((h = fis.read())!= -1)
					{
					   o+=(char)h;
					}
					fis.close();
				    output5.setText(o);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				String p = "";
				try
				{
					FileInputStream fis = openFileInput(address);
					int y;
					while((y = fis.read())!= -1)
					{
					   p+=(char)y;
					}
					fis.close();
				    output6.setText(p);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
				
			}
		});
    }
   

}
