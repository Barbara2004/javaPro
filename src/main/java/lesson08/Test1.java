package lesson08;

public class Test1 {
    // this is an example how to use an exception for negative numbers
    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height;
    }
}
