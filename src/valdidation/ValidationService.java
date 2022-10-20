package valdidation;

public class ValidationService {
    public String validateInput(String input) {
        if (input.equals("Christian")) {
            return String.format("Hello %s !", input);
        } else if (input.equals("Anna") || input.equals("Alea")) {
            return String.format("Hello %s, you are cool!", input);
        } else {
            return String.format("Your name is %s .", input);
        }
    }
}
