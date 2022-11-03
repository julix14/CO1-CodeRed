package tasks.lecture1;

import tasks.TaskInterface;
import valdidation.ValidationService;

public class RectangleCalculator implements TaskInterface {
    final String name = "Rectangle Calculator";
    private final ValidationService validationService = new ValidationService();

    @Override
    public void act(){
        this.calculate(
                validationService.validateInputIsFloat("Insert height"),
                validationService.validateInputIsFloat("Insert width"));
    }
    private void calculate(float height, float width) {
        float area = height * width;
        float perimeter = 2 * (height + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public String getName() {
        return name;
    }
}
