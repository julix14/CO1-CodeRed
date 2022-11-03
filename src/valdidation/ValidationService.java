package valdidation;

import input.UserInputService;

import static java.lang.Float.parseFloat;

public class ValidationService {
    private final UserInputService userInputService = new UserInputService();

    public Integer validateInputIsInt(String message) {
        String input;
        boolean isInt = false;
        int number = 0;
        do{
            input = userInputService.getStringFromUserWithMessage(message);
            try {
                number = Integer.parseInt(input);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println("Input is not a number");
                isInt = false;
            }
        }while (!isInt);
        return number;
    }

    public Float validateInputIsFloat(String message) {
        String input;
        boolean isFloat = false;
        Float number = 1.0f;
        do{
            input = userInputService.getStringFromUserWithMessage(message);
            try {
                number = parseFloat(input);
                isFloat = true;
            } catch (NumberFormatException e) {
                System.out.println("Input is not a float");
                isFloat = false;
            }
        }while (!isFloat);
        return number;
    }

    public Integer validateInputIsInRange(String message, Integer min, Integer max) {
        Integer input = validateInputIsInt(message);
        if (input >= min && input <= max) {
            return input;
        } else {
            System.out.println("Input is not in range of menu");
            return validateInputIsInRange(message, min, max);
        }
    }
    public String validateInputIsString(String message) {
        String input = userInputService.getStringFromUserWithMessage(message);
        if (input.isEmpty()) {
            System.out.println("Input is empty");
            return validateInputIsString(message);
        } else {
            return input;
        }
    }

}
