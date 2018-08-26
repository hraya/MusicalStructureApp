package com.example.android.musicalstructureapp;

public class MusicInfo {

    // This is for songs name
    private String mSongName;

    //This is for artist name
    private String mArtistName;

    /**
     * Creates a new Music Info Object
     *
     * @param SongName   is for the name of the playing song
     * @param ArtistName is for the name of the artist singing the song
     */
    public MusicInfo(String SongName, String ArtistName) {
        mSongName = SongName;
        mArtistName = ArtistName;
    }

    /**
     * Gets the name of the Song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the name of the Artist
     */
    public String getArtistName() {
        return mArtistName;
    }

}
