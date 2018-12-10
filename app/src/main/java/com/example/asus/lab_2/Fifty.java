package com.example.asus.lab_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Fifty extends AppCompatActivity {
    TextView textView9,textView10,textView11,textView13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty);
        textView9= (TextView)findViewById(R.id.textView9);
        textView10= (TextView)findViewById(R.id.textView10);
        textView11= (TextView)findViewById(R.id.textView11);
        textView13= (TextView)findViewById(R.id.textView13);

        textView9.setText(getIntent().getStringExtra("X"));
        textView10.setText(getIntent().getStringExtra("Y"));
        textView11.setText(getIntent().getStringExtra("Z"));
        textView13.setText(getIntent().getStringExtra("CAL"));
    }
}
