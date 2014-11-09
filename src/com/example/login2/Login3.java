package com.example.login2;

import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.example.login2.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login3 extends Activity {
    EditText email,pass;
	TextView error;
    Button ok;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login3);
		email=(EditText)findViewById(R.id.et_un);
        pass=(EditText)findViewById(R.id.et_pw);
        ok=(Button)findViewById(R.id.btn_login);
        error=(TextView)findViewById(R.id.tv_error);

        ok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

            	ArrayList<NameValuePair> postParameters = new ArrayList<NameValuePair>();
            	postParameters.add(new BasicNameValuePair("email", email.getText().toString()));
            	postParameters.add(new BasicNameValuePair("pass", pass.getText().toString()));
            	//String valid = "1";
            	String response = null;
            	try {
            	    response = CustomHttpClient.executeHttpPost("http://maheewa.in/login1.php", postParameters);
            	    String res=response.toString();
            	   // res = res.trim();
            	    res= res.replaceAll("\\s+","");         	              	 
            	    //error.setText(res);
            	   
            	   if(res.equals("1"))
            	   {
            		   Intent i1=new Intent(Login3.this,Choosedonation.class);
            		   Toast t1=Toast.makeText(getApplicationContext(), "please wait",Toast.LENGTH_LONG);
            		   startActivity(i1);
       	   		
            	   }
            	    else
            	    	error.setText("Sorry!! Incorrect Username or Password"); 
            	} catch (Exception e) {
            		email.setText(e.toString());
            	}

            }
        });
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_login3, menu);
		return true;
	}

}
