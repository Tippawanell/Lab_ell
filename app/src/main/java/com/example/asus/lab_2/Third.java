package com.example.asus.lab_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Third extends AppCompatActivity {
    TextView textView6,textView7,textView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textView6= (TextView)findViewById(R.id.textView6);
        textView7= (TextView)findViewById(R.id.textView7);
        textView8= (TextView)findViewById(R.id.textView8);

        textView6.setText(getIntent().getStringExtra("name"));
        textView7.setText(getIntent().getStringExtra("password"));
        textView8.setText(getIntent().getStringExtra("phone"));
    }
}
