package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SongDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);
        TextView textView = (TextView)findViewById(R.id.name_of_song);
        Intent intent = getIntent();
        String songName = intent.getStringExtra("songName");
        String artistName = intent.getStringExtra("artistName");
        textView.setText("Song Name: "+songName+"\n"+"Artist Name: "+artistName);


    }
}
