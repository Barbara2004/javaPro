package lesson06.book;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import static lesson06.book.Map.bookMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Map.getBookMap().keySet());
        System.out.println("Choose the author:");
        String choiceOfUser = scanner.nextLine();
        System.out.println(setOfBooksByAuthor(choiceOfUser, bookMap));

    }

    public static Set<String> setOfBooksByAuthor(String choiceOfUser, HashMap<String, Set<String>> bookMap) {
        return bookMap.get(choiceOfUser);
    }

}
