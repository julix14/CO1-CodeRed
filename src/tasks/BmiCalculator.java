package tasks;

public class BmiCalculator {
    public String name = "Bmi-Calculator";
    public static void calculate(float height, float weight) {
        float bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
    }
}
