package com.example.asus.lab_2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Button BTNNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mediaPlayer = MediaPlayer.create(this,R.raw.c1);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        BTNNext = (Button)findViewById(R.id.btnNext);
        BTNNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this,Second.class);
                startActivity(intent);
            }
        });
    }
}
