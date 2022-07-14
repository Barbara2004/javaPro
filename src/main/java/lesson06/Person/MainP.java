package lesson06.Person;

public class MainP {
    public static void main(String[] args) {
        System.out.println("All persons: " + List.createList());
        System.out.println("Persons, who can drive: " + List.ableToDrive(List.listOfDrivers));
    }
}
