package org.training.model;

/**
 * Created by nicko on 18.11.2016.
 */
public class Composition implements Comparable<Composition> {
    private String artist;
    private String name;
    private int length;
    private String genre;

    Composition(String artist, String name, int length, String genre) {
        this.artist = artist;
        this.name = name;
        this.length = length;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int compareTo(Composition o) {
        return genre.compareTo(o.genre);
    }
}
