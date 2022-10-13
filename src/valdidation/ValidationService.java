package valdidation;

public class ValidationService {
    public String validateInput(String input) {
        if (input.equals("Christian")) {
            return "Hello "+ input;
        } else if (input.equals("Anna") || input.equals("Alea")) {
            return "You are cool "+ input;
        } else {
            return "you are "+ input;
        }
    }
}
