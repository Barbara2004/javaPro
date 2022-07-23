package lesson08;

public class Test14 {
    //finally-section is not called only if we stopped the JVM
    public static void main(String[] args) {
        try {
            System.exit(42);
        } finally {
            System.err.println("finally");
        }
    }
}
