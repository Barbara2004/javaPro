package lesson08;

public class Test20 {
    //Nested try-catch-finally with an exception that will catch the inner catch
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new RuntimeException();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // called
            } finally {
                System.err.print(" 4"); // always called
            }
            System.err.print(" 5");     // called
        } catch (Exception e) {
            System.err.print(" 6");     // do not call
        } finally {
            System.err.print(" 7");     // always called
        }
        System.err.print(" 8");         // called
    }
}
