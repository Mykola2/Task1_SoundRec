package org.training.controller;

import org.training.model.Composition;
import org.training.model.Disk;
import org.training.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicko on 18.11.2016.
 */
public class Controller {
    private Disk disk;
    private View view;

    public Controller(Disk disk, View view) {
        this.disk = disk;
        this.view = view;
    }

    public void processDisk(){
        disk.sortCompostitions();
        view.printMessage(View.compositions);
        view.printMessage(disk.toString());
        view.printMessage(View.FIND_COMPOSITION);
        view.printMessage(disk.findByLength(70,100).toString() );
        view.printMessage(View.TOTAL_LENGTH);
        view.printMessage(disk.getTotalLength().toString());
    }

}
