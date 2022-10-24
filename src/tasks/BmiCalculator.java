package tasks;

import valdidation.ValidationService;

public class BmiCalculator implements TaskInterface{
    final String name = "Bmi-Calculator";
    private final ValidationService validationService = new ValidationService();

    @Override
    public void act(){
        this.calculate(
                validationService.validateInputIsFloat("Insert height"),
                validationService.validateInputIsFloat("Insert weight"));
    }
    private void calculate(float height, float weight) {
        float bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
    }

    @Override
    public String getName() {
        return name;
    }
}
