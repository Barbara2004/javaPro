package lesson08;

public class Test5 {
    //this example shows that we can use exceptions that are higher in the hierarchy
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (Exception e) { // catch with Exception intercepts RuntimeException
            System.err.print(" 2");
        }
        System.err.println(" 3");
    }
}
