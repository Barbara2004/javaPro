package lesson06.Person;

import java.util.ArrayList;

public class List {

    public static ArrayList<Person> createList() {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Willy", 19, true, 366));
        list.add(new Person("Elina", 20, true, 401));
        list.add(new Person("Rina", 15, false, 1));
        list.add(new Person("Tommy", 40, false, 1));
        list.add(new Person("Piter", 35, true, 330));
        return list;
    }

    static ArrayList<Person> listOfDrivers = new ArrayList<>();

    public static ArrayList<Person> ableToDrive(ArrayList<Person> listOfDrivers) {
        for (Person x :
                createList()) {
            if (x.isDriversLicense() && x.getAge() > 16 && x.getDayOfLastFine() > 365) {
                listOfDrivers.add(x);
            }
        }
        return listOfDrivers;
    }
}
