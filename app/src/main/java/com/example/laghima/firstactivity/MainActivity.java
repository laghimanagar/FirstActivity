package com.example.laghima.firstactivity;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.Bsignup);
        Button btn1=(Button)findViewById(R.id.Blogin);
        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
    }
public void onClick(View view)
{
if(view==findViewById(R.id.Bsignup)){
Intent i=new Intent(this,SecondActivity.class);
startActivity(i);
}
    if(view==findViewById(R.id.Blogin)){
        Intent i=new Intent(this,ThirdActivity.class);
        startActivity(i);
    }
}
}

