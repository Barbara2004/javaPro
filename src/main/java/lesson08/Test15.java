package lesson08;

public class Test15 {
    //System.exit(42) and Runtime.getRuntime().exit(42) are synonyms
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exit(42);
        } finally {
            System.err.println("finally");
        }
    }
}
