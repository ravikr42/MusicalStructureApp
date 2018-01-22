package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlayMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);
        TextView textView = (TextView)findViewById(R.id.running_song_name);
        Intent intent = getIntent();
        String songName = intent.getStringExtra("songName");
        String singer = intent.getStringExtra("artistName");
        textView.setText(songName);


        textView = (TextView)findViewById(R.id.singer_details);
        textView.setText(singer);

    }
}
