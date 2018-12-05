package com.example.asus.lab_2;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    ImageButton imgHome, imgNext;
    TextView Username,Password,Tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Username = (EditText)findViewById(R.id.txtName);
        Password = (EditText)findViewById(R.id.txtPassword);
        Tel = (EditText)findViewById(R.id.txtPhone);

        imgHome = (ImageButton)findViewById(R.id.imgHome);
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this, Profile.class);
                startActivity(intent);
            }
        });
        imgNext = (ImageButton)findViewById(R.id.imgNext);
        imgNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this, Third.class);
                intent.putExtra("name",Username.getText().toString());
                intent.putExtra("password",Password.getText().toString());
                intent.putExtra("phone",Tel.getText().toString());
                startActivity(intent);
            }
        });
    }
}









