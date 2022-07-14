package lesson06.book;

import java.util.HashSet;
import java.util.Set;

public class Library {

    public static Set<String> booksByCharlotteBronte = new HashSet<>();

    public static Set<String> getBooksByCharlotteBronte() {
        booksByCharlotteBronte.add("Jane Eyre");
        booksByCharlotteBronte.add("Villette");
        booksByCharlotteBronte.add("Shirley");
        booksByCharlotteBronte.add("The professor");

        return booksByCharlotteBronte;
    }

    public static Set<String> booksByDanielDefoe = new HashSet<>();

    public static Set<String> getBooksByDanielDefoe() {
        booksByDanielDefoe.add("Robinson Crusoe");

        return booksByDanielDefoe;
    }

    public static Set<String> booksByLouisaMayAlcott = new HashSet<>();

    public static Set<String> getBooksByLouisaMayAlcott() {
        booksByLouisaMayAlcott.add("Little Women");
        booksByLouisaMayAlcott.add("Rose in Bloom");
        booksByLouisaMayAlcott.add("May Flowers");

        return booksByLouisaMayAlcott;
    }

    public static Set<String> booksByOscarWilde = new HashSet<>();

    public static Set<String> getBooksByOscarWilde() {
        booksByOscarWilde.add("The picture of Dorian Gray");
        booksByOscarWilde.add("De profundis");

        return booksByOscarWilde;
    }
}
