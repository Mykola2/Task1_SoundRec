package org.training.model;

import java.util.List;

/**
 * Created by nicko on 18.11.2016.
 */
public interface Disk {
    Integer getTotalLength();
    List<Composition> findByLength(int start, int end);
    void sortCompostitions();

}
