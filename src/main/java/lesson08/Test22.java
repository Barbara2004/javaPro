package lesson08;

public class Test22 {
    //We can't throw but warn of a smaller class

    //public static void main(String[] args) throws IOException {
        //throw new Exception();
   // }

//We can warn for more than we throw
    public static void main(String[] args) throws Throwable {
        throw new Exception();
    }
}
