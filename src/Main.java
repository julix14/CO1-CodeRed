import input.InputService;
import output.OutputService;
import valdidation.ValidationService;

public class Main {
    public static void main(String[] args) {
        InputService inputService = new InputService();
        OutputService outputService = new OutputService();
        ValidationService validationService = new ValidationService();

        outputService.printOutput(validationService.validateInput(inputService.getInput()));
    }
}