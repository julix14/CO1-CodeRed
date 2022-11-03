package tasks.lecture1;

import tasks.TaskInterface;
import valdidation.ValidationService;

public class BmiCalculator implements TaskInterface {
    final String name = "Bmi-Calculator";
    private final ValidationService validationService = new ValidationService();

    @Override
    public void act(){
        this.calculate(
                validationService.validateInputIsFloat("Insert height (in m)"),
                validationService.validateInputIsFloat("Insert weight (in kg)"));
    }
    private void calculate(float height, float weight) {
        float bmi = weight / (height * height);
        String bmiCategory = "";
        if (bmi < 18.5){
           bmiCategory = "Underweight";
        } else if (bmi <= 18.5 && bmi <= 24.9){
            bmiCategory = "Healthy";
        } else if (bmi > 24.9){
            bmiCategory = "Overweight";
        }

        System.out.println("BMI: " + bmi + "\nBMI-Category: " + bmiCategory);
    }

    @Override
    public String getName() {
        return name;
    }
}
