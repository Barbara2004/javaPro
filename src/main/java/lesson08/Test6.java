package lesson08;

public class Test6 {
    //'catch' with descendant cannot catch ancestor
    public static void main(String[] args) throws Exception {
        try {
            System.err.print(" 0");
            if (true) {throw new Exception();}
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2");
        }
        System.err.print(" 3");
    }
}
