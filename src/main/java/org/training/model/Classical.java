package org.training.model;

/**
 * Created by nicko on 18.11.2016.
 */

public class Classical extends Composition {
    private String instrument;

    public Classical(String artist, String name, int length, String genre, String instrument) {
        super(artist, name, length, genre);
        this.instrument = instrument;
    }
}
