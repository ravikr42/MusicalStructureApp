package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SongsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        setUpSongDetailsListeners();
        setUpPlaySongBtnListener();
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.song_btn1:
                intent = new Intent(this, SongDetailsActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_1));
                intent.putExtra("artistName", getResources().getString(R.string.song_1_artist));
                startActivity(intent);
                break;
            case R.id.song_btn2:
                intent = new Intent(this, SongDetailsActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_2));
                intent.putExtra("artistName", getResources().getString(R.string.song_2_artist));
                startActivity(intent);
                break;

            case R.id.song_btn3:
                intent = new Intent(this, SongDetailsActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_3));
                intent.putExtra("artistName", getResources().getString(R.string.song_3_artist));
                startActivity(intent);
                break;

            case R.id.song_btn4:
                intent = new Intent(this, SongDetailsActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_4));
                intent.putExtra("artistName", getResources().getString(R.string.song_4_artist));
                startActivity(intent);
                break;

            case R.id.song_btn5:
                intent = new Intent(this, SongDetailsActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_5));
                intent.putExtra("artistName", getResources().getString(R.string.song_5_artist));
                startActivity(intent);
                break;

            case R.id.song_btn6:
                intent = new Intent(this, SongDetailsActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_6));
                intent.putExtra("artistName", getResources().getString(R.string.song_6_artist));
                startActivity(intent);
                break;

            case R.id.song_btn7:
                intent = new Intent(this, SongDetailsActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_7));
                intent.putExtra("artistName", getResources().getString(R.string.song_7_artist));
                startActivity(intent);
                break;

            case R.id.song_btn8:
                intent = new Intent(this, SongDetailsActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_8));
                intent.putExtra("artistName", getResources().getString(R.string.song_8_artist));
                startActivity(intent);
                break;

            case R.id.song_btn9:
                intent = new Intent(this, SongDetailsActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_9));
                intent.putExtra("artistName", getResources().getString(R.string.song_9_artist));
                startActivity(intent);
                break;

            case R.id.song_btn10:
                intent = new Intent(this, SongDetailsActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_10));
                intent.putExtra("artistName", getResources().getString(R.string.song_10_artist));
                startActivity(intent);
                break;

            case R.id.song1_play:
                intent = new Intent(this, PlayMusicActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_1));
                intent.putExtra("artistName", getResources().getString(R.string.song_1_artist));
                startActivity(intent);
                break;


            case R.id.song2_play:
                intent = new Intent(this, PlayMusicActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_2));
                intent.putExtra("artistName", getResources().getString(R.string.song_2_artist));
                startActivity(intent);
                break;


            case R.id.song3_play:
                intent = new Intent(this, PlayMusicActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_3));
                intent.putExtra("artistName", getResources().getString(R.string.song_3_artist));
                startActivity(intent);
                break;


            case R.id.song4_play:
                intent = new Intent(this, PlayMusicActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_4));
                intent.putExtra("artistName", getResources().getString(R.string.song_4_artist));
                startActivity(intent);
                break;


            case R.id.song5_play:
                intent = new Intent(this, PlayMusicActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_5));
                intent.putExtra("artistName", getResources().getString(R.string.song_5_artist));
                startActivity(intent);
                break;


            case R.id.song6_play:
                intent = new Intent(this, PlayMusicActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_6));
                intent.putExtra("artistName", getResources().getString(R.string.song_6_artist));
                startActivity(intent);
                break;


            case R.id.song7_play:
                intent = new Intent(this, PlayMusicActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_7));
                intent.putExtra("artistName", getResources().getString(R.string.song_7_artist));
                startActivity(intent);
                break;


            case R.id.song8_play:
                intent = new Intent(this, PlayMusicActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_8));
                intent.putExtra("artistName", getResources().getString(R.string.song_8_artist));
                startActivity(intent);
                break;


            case R.id.song9_play:
                intent = new Intent(this, PlayMusicActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_9));
                intent.putExtra("artistName", getResources().getString(R.string.song_9_artist));
                startActivity(intent);
                break;

            case R.id.song10_play:
                intent = new Intent(this, PlayMusicActivity.class);
                intent.putExtra("songName", getResources().getString(R.string.song_10));
                intent.putExtra("artistName", getResources().getString(R.string.song_10_artist));
                startActivity(intent);
                break;

        }
    }

    public void setUpSongDetailsListeners() {
        Button song1Details = (Button) findViewById(R.id.song_btn1);
        song1Details.setOnClickListener(this);

        Button song2Details = (Button) findViewById(R.id.song_btn2);
        song2Details.setOnClickListener(this);

        Button song3Details = (Button) findViewById(R.id.song_btn3);
        song3Details.setOnClickListener(this);

        Button song4Details = (Button) findViewById(R.id.song_btn4);
        song4Details.setOnClickListener(this);

        Button song5Details = (Button) findViewById(R.id.song_btn5);
        song5Details.setOnClickListener(this);

        Button song6Details = (Button) findViewById(R.id.song_btn6);
        song6Details.setOnClickListener(this);

        Button song7Details = (Button) findViewById(R.id.song_btn7);
        song7Details.setOnClickListener(this);

        Button song8Details = (Button) findViewById(R.id.song_btn8);
        song8Details.setOnClickListener(this);

        Button song9Details = (Button) findViewById(R.id.song_btn9);
        song9Details.setOnClickListener(this);

        Button song10Details = (Button) findViewById(R.id.song_btn10);
        song10Details.setOnClickListener(this);
    }

    public void setUpPlaySongBtnListener() {
        ImageView playSong1 = (ImageView) findViewById(R.id.song1_play);
        playSong1.setOnClickListener(this);

        ImageView playSong2 = (ImageView) findViewById(R.id.song2_play);
        playSong2.setOnClickListener(this);

        ImageView playSong3 = (ImageView) findViewById(R.id.song3_play);
        playSong3.setOnClickListener(this);

        ImageView playSong4 = (ImageView) findViewById(R.id.song4_play);
        playSong4.setOnClickListener(this);

        ImageView playSong5 = (ImageView) findViewById(R.id.song5_play);
        playSong5.setOnClickListener(this);

        ImageView playSong6 = (ImageView) findViewById(R.id.song6_play);
        playSong6.setOnClickListener(this);

        ImageView playSong7 = (ImageView) findViewById(R.id.song7_play);
        playSong7.setOnClickListener(this);

        ImageView playSong8 = (ImageView) findViewById(R.id.song8_play);
        playSong8.setOnClickListener(this);

        ImageView playSong9 = (ImageView) findViewById(R.id.song9_play);
        playSong9.setOnClickListener(this);

        ImageView playSong10 = (ImageView) findViewById(R.id.song10_play);
        playSong10.setOnClickListener(this);
    }
}
