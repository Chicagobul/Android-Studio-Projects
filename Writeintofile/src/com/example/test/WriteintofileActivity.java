package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.widget.*;
import android.view.*;
import java.io.*;

public class WriteintofileActivity extends Activity 
{
	Button btn_write,btn_read;
	EditText txt;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn_write = (Button) findViewById(R.id.btn_write);
        btn_read = (Button) findViewById(R.id.btn_read);
        txt = (EditText) findViewById(R.id.txt);
        final String filename = "cms.txt";
        File file = new File(filename);
        if(!file.exists())
        	try
        {
        	file.createNewFile();
        }
            catch(Exception e)
        {
        	e.printStackTrace();
        }
        btn_write.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) 
			{
				try
				{
					FileOutputStream fos = openFileOutput(filename,Context.MODE_PRIVATE);
					fos.write(txt.getText().toString().getBytes());
					fos.close();
					Toast.makeText(getBaseContext(),"file writed" ,Toast.LENGTH_SHORT).show();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});
        btn_read.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) 
			{
				String line = "";
				
				try
				{
					FileInputStream fis = openFileInput(filename);
					int c;
					while((c = fis.read())!= -1)
					{
					   line+=(char)c;
					}
					fis.close();
					Toast.makeText(getBaseContext(),"file read" ,Toast.LENGTH_SHORT).show();
				    txt.setText(line);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});
    }
}