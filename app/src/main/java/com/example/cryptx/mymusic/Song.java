package com.example.cryptx.mymusic;

/**
 * Created by CryptX on 15-09-2017.
 */

public class Song {

    private long id;
    private String title;
    private String artist;

    public Song(long id,String title,String artist)
    {
        this.id=id;
        this.title=title;
        this.artist=artist;
    }

    public long getID()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }
}
