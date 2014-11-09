package com.example.login2;

import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.example.login2.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.Intent;

public class Login extends Activity {
    EditText un,pw;
	TextView error;
    Button ok;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        un=(EditText)findViewById(R.id.et_un);
        pw=(EditText)findViewById(R.id.et_pw);
        ok=(Button)findViewById(R.id.btn_login);
        error=(TextView)findViewById(R.id.tv_error);

        ok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

            	ArrayList<NameValuePair> postParameters = new ArrayList<NameValuePair>();
            	postParameters.add(new BasicNameValuePair("username", un.getText().toString()));
            	postParameters.add(new BasicNameValuePair("password", pw.getText().toString()));
            	//String valid = "1";
            	String response = null;
            	try {
            	    response = CustomHttpClient.executeHttpPost("http://maheewa.in/check2.php", postParameters);
            	    String res=response.toString();
            	   // res = res.trim();
            	    res= res.replaceAll("\\s+","");         	              	 
            	    //error.setText(res);
            	   
            	   if(res.equals("1"))
            	   {
            		   Intent i1=new Intent(Login.this,Login3.class);
       	   		startActivity(i1);
       	   		Toast t1=Toast.makeText(getApplicationContext(), "please wait",Toast.LENGTH_LONG);
            	   }
            	    else
            	    	error.setText("Sorry!! Incorrect Username or Password"); 
            	} catch (Exception e) {
            		un.setText(e.toString());
            	}

            }
        });
    }
}
