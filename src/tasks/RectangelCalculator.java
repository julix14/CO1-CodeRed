package tasks;

public class RectangelCalculator {
    public static void calculate(int height, int width) {
        int area = height * width;
        int perimeter = 2 * (height + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
