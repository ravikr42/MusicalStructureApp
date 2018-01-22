package com.example.android.musicalstructureapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        TextView english = (TextView) findViewById(R.id.english);
        TextView hindi = (TextView) findViewById(R.id.hindi);
        TextView all = (TextView) findViewById(R.id.all);


        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent englishPlaylistIntent = new Intent(PlaylistActivity.this, PlaylistDetailsActivity.class);
                startActivity(englishPlaylistIntent);
            }
        });


        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hindiPlaylistIntent = new Intent(PlaylistActivity.this, HindiPlaylistDetailsActivity.class);
                startActivity(hindiPlaylistIntent);
            }
        });


        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent allPlaylistIntent = new Intent(PlaylistActivity.this, MixedPlaylistActivity.class);
                startActivity(allPlaylistIntent);
            }
        });

    }

}
