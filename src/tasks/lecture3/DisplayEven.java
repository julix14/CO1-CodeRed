package tasks.lecture3;

import tasks.TaskInterface;
import validation.ValidationService;

public class DisplayEven implements TaskInterface {
    ValidationService validationService = new ValidationService();
    private final String name = "Display Even";

    @Override
    public void act() {
        displayEven(validationService.validateInputIsInt("Insert a number:"));
    }

    private void displayEven(int number) {
        for(int i = 1; i <= number; i++) {
            if(i % 2 == 0) {
                System.out.printf("%d is even\n", i);
            } else {
                System.out.printf("%d is odd\n", i);
            }
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
