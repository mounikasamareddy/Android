package com.example.sampledemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity{
	private RelativeLayout calendarClick;
	
	protected void onCreat(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String str="ghsfgdsh,sjhfsdj,sjhfdf";
		String names[];
		
		names=str.split(",");
		for(int i=0;i<names.length;i++)
		{
			Toast.makeText(getApplicationContext(), names[i], Toast.LENGTH_LONG).show();
		}
		
	    }

}
