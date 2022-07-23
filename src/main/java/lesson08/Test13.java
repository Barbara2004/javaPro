package lesson08;

public class Test13 {
    //finally-section gets control even if the try-block ended with an exception
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
    }
}
