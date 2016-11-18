package org.training.model;

/**
 * Created by nicko on 18.11.2016.
 */
public class Song extends Composition {
    private String lyric;
    private String singer;

    public Song(String artist, String name, int length, String genre, String lyric, String singer) {
        super(artist, name, length, genre);
        this.lyric = lyric;
        this.singer = singer;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}

