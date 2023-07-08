package com.example.speech;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.speech.tts.TextToSpeech;
import java.util.Locale;

public class SpeechActivity extends Activity 
{
	Button btn1;
	EditText input;
	TextToSpeech tts;
	String data;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn1 = (Button) findViewById(R.id.btn1);
        input = (EditText) findViewById(R.id.input);
        tts= new TextToSpeech(this,new TextToSpeech.OnInitListener() 
		{
			
			public void onInit(int status) 
			{
				if(!(status==TextToSpeech.ERROR))
				{
					tts.setLanguage(Locale.ENGLISH);
				}
			}
		});
        btn1.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) 
			{
				data=input.getText().toString();
				tts.speak(data, TextToSpeech.QUEUE_FLUSH, null);
				
			}
		});
    }
}