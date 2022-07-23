package lesson08;

public class Test3 {
    // throw - exit all frames
    public static void main(String[] args) {
        System.err.println("#1.in");
        f(); // create a frame and push it to stack. Then we transfer control there.
        System.err.println("#1.out"); // missed
    }

    public static void f() {
        System.err.println(".   #2.in");
        g(); // create a frame and push it to stack. Then we transfer control there.
        System.err.println(".   #2.out"); // missed
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        h(); // create a frame and push it to stack. Then we transfer control there.
        System.err.println(".   .   #3.out"); // missed
    }

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error(); // With the help of 'throw' we exit from the pack of frames
        }
        System.err.println(".   .   .   #4.out"); // missed
}}
