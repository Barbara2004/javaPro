package lesson08;

public class Test7 {
    //Error and Exception are not in an ancestor-descendant relationship
    public class App {
        public static void main(String[] args) {
            try {
                System.err.print(" 0");
                if (true) {throw new Error();}
                System.err.print(" 1");
            } catch (Exception e) {
                System.err.print(" 2");
            }
            System.err.print(" 3");
        }
    }
}
