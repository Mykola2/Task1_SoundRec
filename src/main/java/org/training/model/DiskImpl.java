package org.training.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nicko on 18.11.2016.
 */
public class DiskImpl implements Disk {
    private ArrayList<Composition> compositions;

    public DiskImpl() {
        this.compositions = new ArrayList<>();
    }

    public ArrayList<Composition> getCompositions() {
        return compositions;
    }

    public void setCompositions(ArrayList<Composition> compositions) {
        this.compositions = compositions;
    }

    public Integer getTotalLength() {
        Integer totalLength = compositions.stream().mapToInt(Composition::getLength).sum();
        return totalLength;
    }

    public List<Composition> findByLength(int start, int end) {
        List<Composition> filteredList = compositions.stream()
                .filter(x -> x.getLength() > start && x.getLength() < end)
                .collect(Collectors.toList());
        return null;
    }

    public void sortCompostitions() {
        compositions.sort(new CompositionComparator());
    }

    @Override
    public String toString() {
        String allCompositions = "";
        for(Composition composition: compositions){
            allCompositions += composition.getName();
        }
        return allCompositions;
    }
}
