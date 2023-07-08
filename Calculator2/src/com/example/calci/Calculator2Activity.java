package com.example.calci;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class Calculator2Activity extends Activity 
{
	Button btn1,btn2,btn3,btn5,btn6,btn7,btn9,btn10,btn11,btn13,btn14,btn4,btn8,btn12,btn15,btn16,btn17;
	EditText input1;
	String str;
	Boolean clicked = true,add=false,sub=false,mul=false,div=false;
	int a,b;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        btn13 = (Button) findViewById(R.id.btn13);
        btn14 = (Button) findViewById(R.id.btn14);
        btn4 = (Button) findViewById(R.id.btn4);
        btn8 = (Button) findViewById(R.id.btn8);
        btn12 = (Button) findViewById(R.id.btn12);
        btn15 = (Button) findViewById(R.id.btn15);
        btn16 = (Button) findViewById(R.id.btn16);
        btn17 = (Button) findViewById(R.id.btn17);
        input_one();
        
        btn4.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) 
			{
				if(clicked)
				{
					a = Integer.parseInt(input1.getText().toString());
					add = true;
					input1.setText("");
				}
				
			}
		});
        
        btn8.setOnClickListener(new View.OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				if(clicked)
				{
					a = Integer.parseInt(input1.getText().toString());
					sub = true;
					input1.setText("");
				}
			}
		});
        
        btn12.setOnClickListener(new View.OnClickListener() 
        {
			
			public void onClick(View arg0) 
			{
				if(clicked)
				{
					a = Integer.parseInt(input1.getText().toString());
					mul = true;
					input1.setText("");
				}
			}
		});
        
        btn16.setOnClickListener(new View.OnClickListener() 
        {
			
			public void onClick(View arg0) 
			{
				if(clicked)
				{
					a = Integer.parseInt(input1.getText().toString());
					div = true;
					input1.setText("");
				}
			}
        });	

        
        btn15.setOnClickListener(new View.OnClickListener() 
        {
			
			public void onClick(View arg0)
			{
				b = Integer.parseInt(input1.getText().toString());
				{
					if(add==true)
					{
						input1.setText(Integer.toString(a+b));
					}
					else if(sub==true)
					{
						input1.setText(Integer.toString(a-b));
					}
					else if(mul==true)
					{
						input1.setText(Integer.toString(a*b));
					}
					else if(div==true)
					{
						input1.setText(Integer.toString(a/b));
					}

			     }
			
				
			}
			
		});
        
      
    }
    
     public void input_one()
    {
           input1 = (EditText) findViewById(R.id.input1);
           
           btn1.setOnClickListener(new View.OnClickListener() 
           {
   			
   			public void onClick(View arg0) 
   			{
   				str=input1.getText().toString();
   				str+="1";
   				input1.setText(str);
   			}
   		});
           btn2.setOnClickListener(new View.OnClickListener() 
           {
           	
   			
   			public void onClick(View arg0) 
   			{
   			
   				str=input1.getText().toString();
   				str+="2";
   				input1.setText(str);
   			}
   		});
           btn3.setOnClickListener(new View.OnClickListener() 
           {
   			
   			public void onClick(View arg0) 
   			{
   				
   				str=input1.getText().toString();
   				str+="3";
   				input1.setText(str);
   			}
   		});
           btn5.setOnClickListener(new View.OnClickListener() 
           {
   			
   			public void onClick(View arg0) 
   			{
   				
   				str=input1.getText().toString();
   				str+="4";
   				input1.setText(str);
   			}
   		});
           btn6.setOnClickListener(new View.OnClickListener() 
           {
   			
   			public void onClick(View arg0) 
   			{
   				str=input1.getText().toString();
   				str+="5";
   				input1.setText(str);
   			}
   		});
           btn7.setOnClickListener(new View.OnClickListener() 
           {
   			
   			public void onClick(View arg0)
   			{
   			
   				str=input1.getText().toString();
   				str+="6";
   				input1.setText(str);
   			}
   		});
           btn9.setOnClickListener(new View.OnClickListener() 
           {
   			
   			public void onClick(View arg0) 
   			{
   				
   				str=input1.getText().toString();
   				str+="7";
   				input1.setText(str);
   			}
   		});
           btn10.setOnClickListener(new View.OnClickListener() 
           {
   			
   			public void onClick(View arg0) 
   			{
   				
   				str=input1.getText().toString();
   				str+="8";
   				input1.setText(str);
   			}
   		});
           btn11.setOnClickListener(new View.OnClickListener() 
           {
   			
   			public void onClick(View arg0) 
   			{
   				str=input1.getText().toString();
   				str+="9";
   				input1.setText(str);
   			}
   		});
           btn13.setOnClickListener(new View.OnClickListener() 
           {
   			
   			public void onClick(View arg0) 
   			{
   				
   				str=input1.getText().toString();
   				str+=".";
   				input1.setText(str);
   			}
   		});
           btn14.setOnClickListener(new View.OnClickListener() 
           {
   			
   			public void onClick(View arg0) 
   			{
   				
   				str=input1.getText().toString();
   				str+="0";
   				input1.setText(str);
   			}
   		});
           btn17.setOnClickListener(new View.OnClickListener() 
           {
			
			public void onClick(View arg0) 
			{
				input1.setText("");
				
			}
		});
           
    }
    
    }
