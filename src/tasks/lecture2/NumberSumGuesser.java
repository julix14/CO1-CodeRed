package tasks.lecture2;

import tasks.TaskInterface;
import validation.ValidationService;

public class NumberSumGuesser implements TaskInterface {

    final String name = "Number Sum Guesser";
    final ValidationService validationService= new ValidationService();

    @Override
    public void act() {
        this.compare(
                validationService.validateInputIsFloat("Insert first number"),
                validationService.validateInputIsFloat("Insert second number"),
                validationService.validateInputIsFloat("Guess the sum  of both numbers"));
    }

    private void compare(float firstNumber, float secondNumber, float guessedResult) {
        if (firstNumber + secondNumber == guessedResult) {
            System.out.println("Congratulations, you guessed the sum correctly");
        } else {
            System.out.println("The sum of the numbers is not " + guessedResult);
            System.out.println("The correct sum of the numbers is " + (firstNumber + secondNumber));
            System.out.println("The difference between your guess and the correct sum is " + (guessedResult - (firstNumber + secondNumber)));
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
