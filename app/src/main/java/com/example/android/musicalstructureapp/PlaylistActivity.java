package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<MusicInfo> info = new ArrayList<>();

        info.add(new MusicInfo("", "Top 25 Most Played"));
        info.add(new MusicInfo("", "90's Hits"));
        info.add(new MusicInfo("", "Running"));
        info.add(new MusicInfo("", "Study"));
        info.add(new MusicInfo("", "Sleep"));


        MusicInfoAdapter adapter = new MusicInfoAdapter(this,info);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
