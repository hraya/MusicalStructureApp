package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<MusicInfo> info = new ArrayList<>();

        info.add(new MusicInfo("Bobby Womack", "Gene Chandler"));
        info.add(new MusicInfo("Zac Brown Band", "Blake Shelton"));
        info.add(new MusicInfo("Darius Rucker", "George Strait"));
        info.add(new MusicInfo("Intocable", "Daddy Yankee"));
        info.add(new MusicInfo("Vicente Fernandez", "Alejandro Fernandez"));


        MusicInfoAdapter adapter = new MusicInfoAdapter(this,info);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
