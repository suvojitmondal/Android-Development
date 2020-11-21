package com.myappcompany.rob.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    int n;
    MediaPlayer mediaplayer;

    public void fun(View view){

        Button button = (Button) view;

        n = Integer.parseInt((button.getTag()).toString());

        switch (n){
            case 1:
                mediaplayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
                mediaplayer.start();

                break;
            case 2:
                mediaplayer = MediaPlayer.create(this, R.raw.goodevening);
                mediaplayer.start();
                break;

            case 3:
                mediaplayer = MediaPlayer.create(this, R.raw.hello);
                mediaplayer.start();
                break;
            case 4:
                mediaplayer = MediaPlayer.create(this, R.raw.howareyou);
                mediaplayer.start();
                break;
            case 5:
                mediaplayer = MediaPlayer.create(this, R.raw.ilivein);
                mediaplayer.start();
                break;
            case 6:
                mediaplayer = MediaPlayer.create(this, R.raw.mynameis);
                mediaplayer.start();
                break;
            case 7:
                mediaplayer = MediaPlayer.create(this, R.raw.please);
                mediaplayer.start();
                break;
            case 8:
                mediaplayer = MediaPlayer.create(this, R.raw.welcome);
                mediaplayer.start();
                break;
                default:
                    break;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
