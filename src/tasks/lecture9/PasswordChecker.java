package tasks.lecture9;

import input.UserInputService;
import tasks.TaskInterface;

public class PasswordChecker implements TaskInterface {
    String name = "Password Checker";
    UserInputService userInputService = new UserInputService();
    @Override
    public void act() {
        String password = userInputService.getStringFromUserWithMessage("Enter password");
        System.out.printf("Your password '%s' is %s", password, checkPassword(password));
    }
    protected String checkPassword(String password) {
        boolean hasUpperAndLower = (!password.equals(password.toLowerCase()) && !password.equals(password.toUpperCase()) );

        boolean hasNumber = false;
        boolean hasSpecial = false;
        for (int i = 0; i < password.length(); i++) {
            if (password.getBytes()[i] >= 48 && password.getBytes()[i] <= 57) {
                hasNumber = true;
            } else if ((password.charAt(i) == '!') ||
                    (password.charAt(i) == '#') ||
                    (password.charAt(i) == '$') ||
                    (password.charAt(i) == '+') ||
                    (password.charAt(i) == '=') ){
                hasSpecial = true;
            }
        }
        if ((password.length() >= 12 ) && hasUpperAndLower && hasNumber && hasSpecial) {
            return "Strong";
        } else if ((password.length() >= 10 ) && hasSpecial) {
            return "OK";
        }else{
            return "weak";
        }

    }


    @Override
    public String getName() {
        return this.name;
    }
}
