package lesson08;

public class Test16 {
    //And the finally-section cannot "prevent" the exit from the method if the try block called return
    public static void main(String[] args) {
        try {
            System.err.println("try");
            if (true) {return;}
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }
}
