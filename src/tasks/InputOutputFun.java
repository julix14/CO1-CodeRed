package tasks;

import input.InputService;
import output.OutputService;
import valdidation.ValidationService;

public class InputOutputFun {
    public static void inputOutputFun() {
        InputService inputService = new InputService();
        OutputService outputService = new OutputService();
        ValidationService validationService = new ValidationService();

        outputService.printOutput(validationService.validateInput(inputService.getInput()));
    }
}
