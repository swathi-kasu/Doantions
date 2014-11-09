package com.example.login2;

import com.example.login2.Act1;
import com.example.login2.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Choosedonation extends Activity {
	
	ImageButton imgbt1,imgbt2,imgbt3,imgbt4;
	Button b1,b2,b3,b4,b5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choosedonation);
		
		addButtonListener();
		
	}
	public void addButtonListener() {

		imgbt1 = (ImageButton)findViewById(R.id.imageButton1);
		imgbt1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i1=new Intent(Choosedonation.this,Act1.class);
				Toast.makeText(Choosedonation.this,"Please wait", Toast.LENGTH_LONG).show();
				startActivity(i1);
			}
		});
		
		imgbt2 = (ImageButton)findViewById(R.id.imageButton2);
		imgbt2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i2=new Intent(Choosedonation.this,Act2.class);
				Toast.makeText(Choosedonation.this,"Please wait", Toast.LENGTH_LONG).show();
				startActivity(i2);
			}
		});
		
		imgbt3 = (ImageButton)findViewById(R.id.imageButton3);
		imgbt3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i3=new Intent(Choosedonation.this,Act3.class);
				Toast.makeText(Choosedonation.this,"Please wait", Toast.LENGTH_LONG).show();
				startActivity(i3);
			}
		});
		
		imgbt4 = (ImageButton)findViewById(R.id.imageButton4);
		imgbt4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i4=new Intent(Choosedonation.this,Act4.class);
				Toast.makeText(Choosedonation.this,"Please wait", Toast.LENGTH_LONG).show();
				startActivity(i4);
			}
		});
		
		b1 = (Button)findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i4=new Intent(Choosedonation.this,Payment.class);
			   Toast.makeText(Choosedonation.this,"Please wait", Toast.LENGTH_LONG).show();
			   startActivity(i4);
			}
		});
		
		
		b2 = (Button)findViewById(R.id.button2);
		b2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i5=new Intent(Choosedonation.this,Payment.class);
			   Toast.makeText(Choosedonation.this,"Please wait", Toast.LENGTH_LONG).show();
			   startActivity(i5);
			}
		});
		
		
		b3 = (Button)findViewById(R.id.button3);
		b3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i6=new Intent(Choosedonation.this,Payment.class);
			   Toast.makeText(Choosedonation.this,"Please wait", Toast.LENGTH_LONG).show();
			   startActivity(i6);
			}
		});
		
		b4 = (Button)findViewById(R.id.button4);
		b4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i6=new Intent(Choosedonation.this,Payment.class);
			   Toast.makeText(Choosedonation.this,"Please wait", Toast.LENGTH_LONG).show();
			   startActivity(i6);
			}
		});
		b5 = (Button)findViewById(R.id.Button5);
		b5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i6=new Intent(Choosedonation.this,Home.class);
			   Toast.makeText(Choosedonation.this,"Please wait", Toast.LENGTH_LONG).show();
			   startActivity(i6);
			}
		});
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_choosedonation, menu);
		return true;
	}

}
