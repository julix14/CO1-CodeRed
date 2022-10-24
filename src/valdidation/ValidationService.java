package valdidation;

import input.UserInputService;

public class ValidationService {
    private final UserInputService userInputService = new UserInputService();

    public Integer validateInputIsInt(String message) {
        String input = userInputService.getStringFromUserWithMessage(message);
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Input is not a number");
            return validateInputIsInt(userInputService.getStringFromUserWithMessage(message + " as an Integer: "));
        }
    }

    public Float validateInputIsFloat(String message) {
        String input = userInputService.getStringFromUserWithMessage(message);
        try {
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {
            System.out.println("Input is not a number");
            return validateInputIsFloat(userInputService.getStringFromUserWithMessage(message + "as a Insert a number: "));
        }
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

}
