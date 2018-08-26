package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<MusicInfo> info = new ArrayList<>();

        info.add(new MusicInfo("Country Greatest Hits", "Zac Brown Band"));
        info.add(new MusicInfo("R & B Greatest Hits", "Salt N Pepper"));
        info.add(new MusicInfo("Raps Greatest Hits", "2pac"));
        info.add(new MusicInfo("Latin Party Hits", "Pitbull, Daddy Yankee"));
        info.add(new MusicInfo("Vicente Fernandez Hits", "Vicente Fernandez"));


        MusicInfoAdapter adapter = new MusicInfoAdapter(this,info);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
