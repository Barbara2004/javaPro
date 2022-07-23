package lesson08;

public class Test12 {
    //it is not the type of reference (Throwable) that is taken into account, but the type of referred (Exception)
    public static void main(String[] args) {
        try {
            Throwable t = new Exception();
            throw t;
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }
}
