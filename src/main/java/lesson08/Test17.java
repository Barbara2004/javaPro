package lesson08;

public class Test17 {
    //finally-section can interrupt throw/return with another throw/return
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            return 0;
        } finally {
            throw new RuntimeException();
        }
    }
}
