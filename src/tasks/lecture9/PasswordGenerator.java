package tasks.lecture9;

import input.UserInputService;
import tasks.TaskInterface;
import validation.ValidationService;

public class PasswordGenerator implements TaskInterface {
    String name = "Password Generator";
    UserInputService userInputService = new UserInputService();

    ValidationService validationService = new ValidationService();
    @Override
    public void act() {
        generatePassword();
    }

    private void generatePassword() {
        int minLength = validationService.validateInputIsInt("Enter minimum length of password");
        boolean mustMixCase = toggleOption("mixed case");
        boolean mustHaveNumber = toggleOption("numbers");
        boolean mustHaveSpecial = toggleOption("special characters");
        char[] allowedSpecials = userInputService.getStringFromUserWithMessage("Enter allowed special characters, without spaces").strip().toCharArray();
        String password = "";

        for (int i = 0; i < minLength; i++) {
            password = password + generateRandomChar(generateAllowedCharArr(mustMixCase, mustHaveNumber, mustHaveSpecial, allowedSpecials));
        }

        System.out.println(password);


    }

    private String generateRandomChar(char[] allowedChars) {
        int randomIndex = (int) (Math.random() * allowedChars.length);
        return String.valueOf(allowedChars[randomIndex]);
    }

    private char[] generateAllowedCharArr(boolean mustMixCase, boolean mustHaveNumber, boolean mustHaveSpecial, char[] allowedSpecials) {
        char[][] allowedCharTypes = new char[4][];
        int length = 0;
        if (mustHaveNumber){
            char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
            allowedCharTypes[0] = numbers;
            length += numbers.length;
        }
        if (mustHaveSpecial){
            allowedCharTypes[1] = allowedSpecials;
            length += allowedSpecials.length;
        }
        if (mustMixCase){
            char[] upperCase = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            char[] lowerCase = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            allowedCharTypes[2] = upperCase;
            allowedCharTypes[3] = lowerCase;
            length += upperCase.length + lowerCase.length;
        }
        char[] allowedChars = new char[length];

        int index = 0;
        for (char[] allowedCharType : allowedCharTypes) {
            for(char individualChar : allowedCharType){
                allowedChars[index] = individualChar;
                index++;
            }
        }

        return  allowedChars;
    }

    private boolean toggleOption(String message) {
        while (true) {
            String input = userInputService.getStringFromUserWithMessage("Should password have " + message + "? (y/n)");
            if (input.equalsIgnoreCase("y")) {
                return true;
            } else if (input.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("Please enter 'y' or 'n'");
            }
        }

    }



    @Override
    public String getName() {
        return this.name;
    }
}
