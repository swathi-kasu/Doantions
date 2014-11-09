package com.example.login2;

import com.example.login2.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Act1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_act1);
		Button b1 = (Button)findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent in=new Intent(Act1.this,Payment.class);
			   Toast.makeText(Act1.this,"Please wait", Toast.LENGTH_LONG).show();
			   startActivity(in);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_act1, menu);
		return true;
	}

}
