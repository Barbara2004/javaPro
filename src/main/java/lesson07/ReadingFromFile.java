package lesson07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingFromFile {
    public static ArrayList<String> listOfAllURL() throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\Downloads\\urls.txt");
        Scanner sc = new Scanner(file);
        ArrayList<String> url = new ArrayList<>();
        while (sc.hasNextLine()) {
            url.add(sc.nextLine());
        }
        return url;
    }

}
