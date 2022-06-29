package lesson02;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> a = new MyArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        a.add("6");


        System.out.println(Arrays.toString(a.toArray()));
        System.out.println(Arrays.toString(a.subList(2, 4).toArray()));;

    }
}
