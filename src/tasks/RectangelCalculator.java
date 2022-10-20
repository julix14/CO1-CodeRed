package tasks;

public class RectangelCalculator {
    public static void calculate(float height, float width) {
        float area = height * width;
        float perimeter = 2 * (height + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
