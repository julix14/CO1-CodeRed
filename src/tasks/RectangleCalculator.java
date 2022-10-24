package tasks;

public class RectangleCalculator {
    public String name = "Rectangle Calculator";
    public static void calculate(float height, float width) {
        float area = height * width;
        float perimeter = 2 * (height + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
