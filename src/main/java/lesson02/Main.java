package lesson02;
import lesson03.MyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> a = new MyArrayList<>();
LinkedList <String> g = new LinkedList<>();


        MyLinkedList <Integer> k = new MyLinkedList<>();
        k.addFirst(1);
        k.addFirst(2);
        k.addFirst(3);
        k.addLast(5);
        k.addFirst(6);
        k.removeFirst();
        System.out.println(k.contains(5));
        System.out.println(k.contains(6));


        k.print();
//k.remove((Integer) 3);
//k.print();
       // a.add("1");
       // a.add("2");
       // a.add("3");
       // a.add("4");
//        a.add("5");
//        a.add("6");

        //System.out.println(ll);
        //System.out.println(Arrays.toString(a.toArray()));
       // System.out.println(Arrays.toString(a.subList(2, 4).toArray()));;

    }

}
