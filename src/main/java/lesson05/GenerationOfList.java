package lesson05;

import lesson04.Ocean;

import java.util.ArrayList;

public class GenerationOfList {
    static ArrayList<Ocean> ocean = new ArrayList<>();

    public static ArrayList<Ocean> put() {
        //ocean.add(new Ocean("crab", 0.3, "Odessa", 2));
        ocean.add(new Ocean("shark", 2000, "Pacific ocean", 83));
        ocean.add(new Ocean("octopus", 40, "Indian ocean", 3));
        ocean.add(new Ocean("stingray", 810, "Atlantic ocean", 7));
        //ocean.add(new Ocean("Sea urchin", 0.1, "Atlantic ocean", 1));
        ocean.add(new Ocean("Starfish", 0.2, "Pacific ocean", 1));
        return ocean;
    }

    static ArrayList<Sweets> sweets = new ArrayList<>();

    public static ArrayList<Sweets> putSweets() {
        sweets.add(new Sweets("chocolate", 2, new Ocean(), "Q"));
        sweets.add(new Sweets("coconut", 0.2, new Ocean(), "W"));
        sweets.add(new Sweets("strawberry", 0.3, new Object(), "E"));
        return sweets;
    }
}
