package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<MusicInfo> info = new ArrayList<>();

        info.add(new MusicInfo("Come Back Song", "By Darius Rucker"));
        info.add(new MusicInfo("Honey Bee", "By Blake Shelton"));
        info.add(new MusicInfo("Por Tu Maldito Amor", "By Vicente Fernandez"));
        info.add(new MusicInfo("Fuerte No Soy", "Intocable"));
        info.add(new MusicInfo("Duke Of Earl", "Gene Chandler"));


        MusicInfoAdapter adapter = new MusicInfoAdapter(this, info);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
