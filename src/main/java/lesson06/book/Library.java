package lesson06.book;

import java.util.HashSet;
import java.util.Set;

public class Library {


    public static Set<String> getBooksByCharlotteBronte() {
        Set<String> booksByCharlotteBronte = new HashSet<>();
        booksByCharlotteBronte.add("Jane Eyre");
        booksByCharlotteBronte.add("Villette");
        booksByCharlotteBronte.add("Shirley");
        booksByCharlotteBronte.add("The professor");

        return booksByCharlotteBronte;
    }


    public static Set<String> getBooksByDanielDefoe() {
        Set<String> booksByDanielDefoe = new HashSet<>();
        booksByDanielDefoe.add("Robinson Crusoe");

        return booksByDanielDefoe;
    }


    public static Set<String> getBooksByLouisaMayAlcott() {
        Set<String> booksByLouisaMayAlcott = new HashSet<>();
        booksByLouisaMayAlcott.add("Little Women");
        booksByLouisaMayAlcott.add("Rose in Bloom");
        booksByLouisaMayAlcott.add("May Flowers");

        return booksByLouisaMayAlcott;
    }


    public static Set<String> getBooksByOscarWilde() {
        Set<String> booksByOscarWilde = new HashSet<>();
        booksByOscarWilde.add("The picture of Dorian Gray");
        booksByOscarWilde.add("De profundis");

        return booksByOscarWilde;
    }
}
