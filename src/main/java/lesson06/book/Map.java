package lesson06.book;


import lesson06.book.Library;

import java.util.HashMap;
import java.util.Set;

public class Map {

    public static HashMap<String, Set<String>> bookMap = new HashMap<>();

    public static HashMap<String, Set<String>> getBookMap() {
        bookMap.put("Charlotte Bronte", Library.getBooksByCharlotteBronte());
        bookMap.put("Daniel Defoe", Library.getBooksByDanielDefoe());
        bookMap.put("Louisa May Alcott", Library.getBooksByLouisaMayAlcott());
        bookMap.put("Oscar Wilde", Library.getBooksByOscarWilde());
        return bookMap;
    }

}