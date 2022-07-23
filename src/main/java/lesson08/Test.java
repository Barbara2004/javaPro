package lesson08;

public class Test {

    // this example shows that the exception mechanism allows you to return nothing
    public static double sqr(double arg) {// according to this method you must return double
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return arg * arg;             // The first option - to return double
        } else if (time % 2 == 1) {
            while (true) ;                 // it just compiles
        } else {
            throw new RuntimeException(); // throw an exception
        }
    }
}


