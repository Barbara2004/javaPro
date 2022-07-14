package lesson06.book;


import lesson06.book.Library;

import java.util.HashMap;
import java.util.Set;

public class Map {

    public static HashMap<String, Set<String>> bookMap = new HashMap<>();

    public static HashMap<String, Set<String>> getBookMap() {
        bookMap.put("Charlotte Bronte", Library.booksByCharlotteBronte);
        bookMap.put("Daniel Defoe", Library.booksByDanielDefoe);
        bookMap.put("Louisa May Alcott", Library.booksByLouisaMayAlcott);
        bookMap.put("Oscar Wilde", Library.booksByOscarWilde);
        return bookMap;
    }

}