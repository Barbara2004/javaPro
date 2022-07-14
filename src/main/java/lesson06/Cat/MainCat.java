package lesson06.Cat;

import lesson06.Cat.Cats;

import java.util.ArrayList;
import java.util.List;

public class MainCat {
    public static List <Cats> cats = new ArrayList<>();
    public static List <Cats> getCats (){
        cats.add(new Cats("John", "Istanbul"));
        cats.add(new Cats("Bars", "Valencia"));
        cats.add(new Cats("Richard", "Odesa"));
        cats.add(new Cats("Rick", "Wroclaw"));
        return cats;
    }
    private String [] array = new String [cats.size()];
    public List<Cats> changeCity(){
        array[0] = "Vienna";
        array[1] = "Algeria";
        array[2] = "Brussels";
        array[3] = "Brasilia";

        for (int i = 0; i < array.length; i++) {
           // cats.set(array[i]);
        }
        return cats;
    }
}
