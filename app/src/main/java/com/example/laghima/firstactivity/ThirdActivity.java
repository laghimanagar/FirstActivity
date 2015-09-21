package com.example.laghima.firstactivity;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button btn2=(Button)findViewById(R.id.Baddincome);
        Button btn3=(Button)findViewById(R.id.Baddinvestment);
        Button btn4=(Button)findViewById(R.id.Baddexpenses);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==findViewById(R.id.Baddincome)){
            Intent i=new Intent(this,FourthActivity.class);
            startActivity(i);
        }
        if(view==findViewById(R.id.Baddinvestment)){
            Intent i=new Intent(this,FifthActivity.class);
            startActivity(i);
        }
        if(view==findViewById(R.id.Baddexpenses)){
            Intent i=new Intent(this,SixthActivity.class);
            startActivity(i);
        }
    }
}