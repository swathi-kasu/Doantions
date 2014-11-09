package com.example.login2;

import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.example.login2.Choosedonation;
import com.example.login2.CustomHttpClient;
import com.example.login2.R;
import com.example.login2.Signup;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends Activity {
	EditText et1,et2,et3,et4,et5,et6;
	  TextView tv;
	  TextView error;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		
		et1=(EditText)findViewById(R.id.editText1);
		et2=(EditText)findViewById(R.id.editText2);
		et3=(EditText)findViewById(R.id.editText3);
		et4=(EditText)findViewById(R.id.editText4);
		et5=(EditText)findViewById(R.id.editText5);
		et6=(EditText)findViewById(R.id.editText6);
		 
		
		Button bt1=(Button)findViewById(R.id.button1);
bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ArrayList<NameValuePair> postParameters = new ArrayList<NameValuePair>();
            	postParameters.add(new BasicNameValuePair("email", et1.getText().toString()));
            	postParameters.add(new BasicNameValuePair("pass", et2.getText().toString()));
            	postParameters.add(new BasicNameValuePair("addr", et3.getText().toString()));
            	postParameters.add(new BasicNameValuePair("state", et4.getText().toString()));
            	postParameters.add(new BasicNameValuePair("pcode", et5.getText().toString()));
            	postParameters.add(new BasicNameValuePair("country", et6.getText().toString()));
            	
            	String response = null;
            	try {
            	    response = CustomHttpClient.executeHttpPost("http://maheewa.in/signup.php", postParameters);

            		Toast t1=Toast.makeText(getApplicationContext(), "Succesfully Registered",Toast.LENGTH_LONG);
             	    	Intent i1=new Intent(Signup.this,Login3.class);
             	   		startActivity(i1);
             	   
            	}catch (Exception e) {
            		tv.setText("Error");
            	}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_signup, menu);
		return true;
	}

}
