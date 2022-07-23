package lesson08;

public class Test8 {
    //if we throw the RuntimeException a second time there will be RuntimeException
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) { // catch RuntimeException
            System.err.print(" 2");
            if (true) {throw e;}       // throw it second time
        }
        System.err.println(" 3");      // miss it
    }
}
