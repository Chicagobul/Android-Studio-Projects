package com.example.test;

import java.io.File;
import java.io.FileOutputStream;
import android.text.*;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class FormActivity extends Activity 
{
	Button  btn_submit,btn_clear;
	EditText txt1,txt2,txt3,txt4,txt5,txt6;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn_submit = (Button) findViewById(R.id.btn_submit);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);
        txt3 = (EditText) findViewById(R.id.txt3);
        txt4 = (EditText) findViewById(R.id.txt4);
        txt5 = (EditText) findViewById(R.id.txt5);
        txt6 = (EditText) findViewById(R.id.txt6);
        final String name = "name.txt";
        File file = new File(name);
        if(!file.exists())
        	try
        {
        	file.createNewFile();
        }
            catch(Exception e)
        {
        	e.printStackTrace();
        }
            final String age = "age.txt";
            File f = new File(age);
            if(!f.exists())
            	try
            {
            	file.createNewFile();
            }
                catch(Exception e)
            {
            	e.printStackTrace();
            }
                final String email = "email.txt";
                File g = new File(email);
                if(!g.exists())
                	try
                {
                	file.createNewFile();
                }
                    catch(Exception e)
                {
                	e.printStackTrace();
                }
                    final String password = "password.txt";
                    File h = new File(password);
                    if(!h.exists())
                    	try
                    {
                    	file.createNewFile();
                    }
                        catch(Exception e)
                    {
                    	e.printStackTrace();
                    }
                        final String gender = "gender.txt";
                        File i = new File(gender);
                        if(!i.exists())
                        	try
                        {
                        	file.createNewFile();
                        }
                            catch(Exception e)
                        {
                        	e.printStackTrace();
                        }
                            final String address = "address.txt";
                            File j = new File(address);
                            if(!j.exists())
                            	try
                            {
                            	file.createNewFile();
                            }
                                catch(Exception e)
                            {
                            	e.printStackTrace();
                            }
        btn_clear.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) 
			{
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
				txt4.setText("");
				txt5.setText("");
				txt6.setText("");
				Toast.makeText(getBaseContext(), "form cleared", Toast.LENGTH_SHORT).show();
			}
		});
        
        btn_submit.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) 
			{
				if(TextUtils.isEmpty(txt3.getText()))
				{
					txt3.setError("Field should not be empty");
				}
				else if(!isEmailValid(txt3.getText().toString()))
				{
					txt3.setError("Field should not be empty");
				}
				if((txt1.getText().toString().equals("")))
		        {
					//dialog();
		        }
				else
				{
					Intent intent = new Intent(FormActivity.this,Second.class);
					startActivity(intent);
					Toast.makeText(getBaseContext(), "form submitted", Toast.LENGTH_SHORT).show();
					try
					{
						FileOutputStream fos = openFileOutput(name,Context.MODE_PRIVATE);
						fos.write(txt1.getText().toString().getBytes());
						fos.close();
						Toast.makeText(getBaseContext(),"file writed" ,Toast.LENGTH_SHORT).show();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
				}
				
				if((txt2.getText().toString().equals("")))
		        {
					//dialog();
		        }
				else
				{
					Intent intent = new Intent(FormActivity.this,Second.class);
					startActivity(intent);
					try
					{
						FileOutputStream fos = openFileOutput(age,Context.MODE_PRIVATE);
						fos.write(txt2.getText().toString().getBytes());
						fos.close();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
		
				 }
				
				if((txt3.getText().toString().equals("")))
		        {
					//dialog();
		        }
				else
				{
					Intent intent = new Intent(FormActivity.this,Second.class);
					startActivity(intent);
					try
					{
						FileOutputStream fos = openFileOutput(email,Context.MODE_PRIVATE);
						fos.write(txt3.getText().toString().getBytes());
						fos.close();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
			     }
				if((txt4.getText().toString().equals("")))
		        {
					//dialog();
		        }
				else
				{
					Intent intent = new Intent(FormActivity.this,Second.class);
					startActivity(intent);
					try
					{
						FileOutputStream fos = openFileOutput(password,Context.MODE_PRIVATE);
						fos.write(txt4.getText().toString().getBytes());
						fos.close();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
			     }
				if((txt5.getText().toString().equals("")))
		        {
					//dialog();
		        }
				else
				{
					Intent intent = new Intent(FormActivity.this,Second.class);
					startActivity(intent);
					try
					{
						FileOutputStream fos = openFileOutput(gender,Context.MODE_PRIVATE);
						fos.write(txt5.getText().toString().getBytes());
						fos.close();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
			     }
				if((txt6.getText().toString().equals("")))
		        {
					//dialog();
		        }
				else
				{
					Intent intent = new Intent(FormActivity.this,Second.class);
					startActivity(intent);
					try
					{
						FileOutputStream fos = openFileOutput(address,Context.MODE_PRIVATE);
						fos.write(txt6.getText().toString().getBytes());
						fos.close();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
			     }
			}
		});         
    }
    
    private boolean isEmailValid(String email)
    {
    	return email.contains("@");
    }
    
    public void dialog()
    {
    	new AlertDialog.Builder(FormActivity.this)
		.setTitle("The Field should not be empty")
		.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) 
			{
				Toast.makeText(FormActivity.this, "Please fill the blank columns", Toast.LENGTH_SHORT).show();
			}
		}).show();
    }
}