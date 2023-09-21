package com.example.mediaplayerlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button blackBtn,greenBtn,purpleBtn,redBtn,yellowBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn = findViewById(R.id.blackBtn);
        greenBtn = findViewById(R.id.greenBtn);
        purpleBtn = findViewById(R.id.purpleBtn);
        redBtn = findViewById(R.id.redBtn);
        yellowBtn = findViewById(R.id.yellowBtn);

        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int clickBtnId = v.getId();
        if(clickBtnId == R.id.blackBtn){
            playGround(R.raw.black);
        }else if(clickBtnId == R.id.greenBtn){
            playGround(R.raw.green);
        } else if (clickBtnId == R.id.purpleBtn) {
            playGround(R.raw.purple);
        } else if (clickBtnId == R.id.redBtn) {
            playGround(R.raw.red);
        } else if (clickBtnId == R.id.yellowBtn) {
            playGround(R.raw.yellow);
        }
    }
    public void playGround(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(
        this,
            id
        );
        mediaPlayer.start();
    }
}