package lesson08;

public class Test25 {
    //The compiler won't run this code even though the main method is guaranteed to NOT throw an exception.
    public static void main(String[] args) throws Exception {
        try {
            Throwable t = new Exception();
            //throw t;
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }

    //will work with Throwable

//    public static void main(String[] args) throws Throwable {
//        try {
//            Throwable t = new Exception();
//            throw t;
//        } catch (Exception e) {
//            System.out.println("Перехвачено!");
//        }
//    }
}
