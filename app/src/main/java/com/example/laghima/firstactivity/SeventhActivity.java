package com.example.laghima.firstactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SeventhActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        Button btn6 = (Button) findViewById(R.id.Bchangeincomedetails);
        Button btn7 = (Button) findViewById(R.id.Bchangeinvestmentdetails);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view == findViewById(R.id.Bchangeincomedetails)) {
            Intent i = new Intent(this, FourthActivity.class);
            startActivity(i);
        }
        if (view == findViewById(R.id.Bchangeinvestmentdetails)) {
            Intent i = new Intent(this, FifthActivity.class);
            startActivity(i);
        }
    }
}
