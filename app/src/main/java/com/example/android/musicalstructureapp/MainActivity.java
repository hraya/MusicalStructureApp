package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finds view that shows the playlist category
        TextView playlist = findViewById(R.id.playlist);

        //Set click listener on that VIew
        playlist.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates new intent to open PlaylistActivity
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                //Starts new activity
                startActivity(playlistIntent);
            }
        }));

        //Finds view that shows the artist category
        TextView artist = findViewById(R.id.artist);

        //Set click listener on that VIew
        artist.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates new intent to open ArtistActivity
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);

                //Starts new activity
                startActivity(artistIntent);
            }
        }));

        //Finds view that shows the albums category
        TextView albums = findViewById(R.id.albums);

        //Set click listener on that VIew
        albums.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates new intent to open AlbumsActivity
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                //Starts new activity
                startActivity(albumsIntent);
            }
        }));

        //Finds view that shows the songs category
        TextView songs = findViewById(R.id.songs);

        //Set click listener on that VIew
        songs.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creates new intent to open SongsActivity
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                //Starts new activity
                startActivity(songsIntent);
            }
        }));
    }
}
