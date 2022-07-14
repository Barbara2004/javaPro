package lesson06.Cat;

import lesson06.Cat.Cats;

import java.util.ArrayList;
import java.util.List;

public class MainCat {
    public static List<Cats> cats = new ArrayList<>();

    public static List<Cats> getCats() {
        cats.add(new Cats("John", "Istanbul"));
        cats.add(new Cats("Bars", "Valencia"));
        cats.add(new Cats("Richard", "Odesa"));
        cats.add(new Cats("Rick", "Wroclaw"));
        return cats;
    }

    public static List<Cats> changeCity() {
        String[] array = {"Vienna", "Algeria", "Brussels", "Brasilia"};
        for (int i = 0; i < array.length; i++) {
            cats.get(i).setAddress(array[i]);
        }
        return cats;
    }

    public static void main(String[] args) {
        System.out.println(getCats());
        changeCity();
        System.out.println(cats);
    }
}
