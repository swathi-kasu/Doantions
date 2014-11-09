package com.example.login2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Payment1 extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_payment1);
		Button bt1=(Button)findViewById(R.id.button1);
		
		bt1.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent i1=new Intent(Payment1.this,Creditcard.class);
						startActivity(i1);
					}
		});
		Button bt2=(Button)findViewById(R.id.button2);
		
		bt2.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent i2=new Intent(Payment1.this,Debitcard.class);
						startActivity(i2);
					}
		});
		
	}


	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_payment1, menu);
		return true;
	}

}
