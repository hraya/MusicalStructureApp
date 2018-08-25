package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicInfoAdapter extends ArrayAdapter<MusicInfo> {
    public MusicInfoAdapter(Activity context, ArrayList<MusicInfo> info) {
        super(context, 0, info);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if the existing view is being reused, if not inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }

        //gets object location position in the list
        MusicInfo currentInfo = getItem(position);

        TextView songTextView = listItemView.findViewById(R.id.song_text_view);
        //Sets the text on the TextView for the songs name
        songTextView.setText(currentInfo.getSongName());

        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        //Sets the test ion the TextView for the artist name
        artistTextView.setText(currentInfo.getArtistName());



        return listItemView;
    }
}
