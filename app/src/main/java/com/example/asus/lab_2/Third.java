package com.example.asus.lab_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Third extends AppCompatActivity {
    TextView textView6,textView7,textView8;
    ImageButton imgH, imgN;

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

        imgH = (ImageButton)findViewById(R.id.imgH);
        imgH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Third.this, Second.class);
                startActivity(intent);
            }
        });
        imgN = (ImageButton)findViewById(R.id.imgN);
        imgN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Third.this, Fourth.class);
                startActivity(intent);
            }
        });
    }
}
