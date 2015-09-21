package com.example.laghima.firstactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {
Button submit;
    EditText Firstname,Lastname,Email,Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final SignuphereDBHelper signupdbhelper=new SignuphereDBHelper(this);
        Firstname=(EditText)findViewById(R.id.TFfirstname);
        Lastname=(EditText)findViewById(R.id.TFlastname);
        Email=(EditText)findViewById(R.id.TFemail);
        Password=(EditText)findViewById(R.id.TFpassword);
        submit=(Button)findViewById(R.id.Bsubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String Fname;
                    String Lname;
                    String email;
                    String Pword;
                    Fname=Firstname.getText().toString();
                    Lname=Lastname.getText().toString();
                    email=Email.getText().toString();
                    Pword=Password.getText().toString();
                    long id=signupdbhelper.insertSignuphere(Fname,Lname,email,Pword);
                    Toast.makeText(getBaseContext(),"your record has been saved successfully:",Toast.LENGTH_LONG).show();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

}