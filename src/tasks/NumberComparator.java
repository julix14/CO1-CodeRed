package tasks;

import valdidation.ValidationService;

public class NumberComparator implements TaskInterface{
    final String name = "Number Comparator";
    private final ValidationService validationService = new ValidationService();

    @Override
    public void act(){
        this.compare(
                validationService.validateInputIsFloat("Insert first number"),
                validationService.validateInputIsFloat("Insert second number"));
    }
    private void compare(float firstNumber, float secondNumber) {
        if (firstNumber == secondNumber) {
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("The numbers are not equal");
        }
    }
    public String getName() {
        return name;
    }
}
