package org.training.view;

/**
 * Created by nicko on 18.11.2016.
 */
public class View {
    public static final String TOTAL_LENGTH = "Total length of compositions: ";
    public static final String FIND_COMPOSITION = "Find: ";
    public static String compositions;

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessage(String message, String message2){
        System.out.println(message + " " + message2);
    }
}
