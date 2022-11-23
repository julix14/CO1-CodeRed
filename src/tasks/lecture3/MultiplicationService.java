package tasks.lecture3;

import tasks.TaskInterface;
import validation.ValidationService;

public class MultiplicationService implements TaskInterface {
    ValidationService validationService = new ValidationService();
    private final String name = "Multiplication Service";

    @Override
    public void act() {
        multiply(
                validationService.validateInputIsBiggerThan("Insert number to multiply",2 ),
                validationService.validateInputIsInt("Insert how often should be multiplied"));
    }

    private void multiply(int firstNumber, int secondNumber) {
        for(int i = 1; i <= secondNumber; i++) {
            System.out.printf("%d * %d = %d\n", i, firstNumber, firstNumber * i);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
