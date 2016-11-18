package org.training.model;

import java.util.Comparator;

/**
 * Created by nicko on 18.11.2016.
 */
public class CompositionComparator implements Comparator<Composition> {

    @Override
    public int compare(Composition o1, Composition o2) {
        return o1.compareTo(o2);
    }
}
