package tasks.lecture4;

import tasks.TaskInterface;
import valdidation.ValidationService;

public class MoneyConverter implements TaskInterface {
    final String name = "Money Converter";

    private final ValidationService validationService = new ValidationService();

    @Override
    public void act(){
        printResult(
                calculate(insertAmount(), insertExchangeRate())
        );
    }

    public String getName() {
        return name;
    }

private float insertAmount() {
    return validationService.validateInputIsFloat("Insert Amount");
}

private float insertExchangeRate() {
    return validationService.validateInputIsFloat("Insert Exchange Rate");

}

private float calculate(float amount, float exchangeRate) {
    return amount * exchangeRate;
}

private void printResult(float result) {
    System.out.println("result" + " = " + result);
}
}
