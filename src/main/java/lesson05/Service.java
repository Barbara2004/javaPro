package lesson05;

import lesson04.Ocean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Service {
    static HashMap<Ocean, Sweets> orders = new HashMap<>();
    static HashSet<Sweets> sweets = new HashSet<>();
    static ArrayList<Sweets> popularSweets = new ArrayList<>();

    static HashMap<Ocean, Sweets> distribution() { //this method gives the objects of the class "Sweets" to every object of the class "Ocean"

        for (int i = 0, j = 0; i < GenerationOfList.ocean.size(); i++, j++) {
            if (j == GenerationOfList.sweets.size()) { // if the objects of the class "Sweets" are over we start to give them out from the very beginning
                j = 0;
            }
            orders.put(GenerationOfList.ocean.get(i), GenerationOfList.sweets.get(j));
        }
        return orders;
    }

    static ArrayList<Sweets> returnPopularSweets() {
        for (Ocean Key : orders.keySet()
        ) {
            Sweets value = orders.get(Key);
            if (sweets.contains(value)) {
                popularSweets.add(value);
            } else {
                sweets.add(value);
            }
        }
        return popularSweets;
    }
}
