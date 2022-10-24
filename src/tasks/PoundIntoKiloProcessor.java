package tasks;

import valdidation.ValidationService;

public class PoundIntoKiloProcessor implements TaskInterface {
    public final String name = "Pound into Kilo Processor";
    private final ValidationService validationService = new ValidationService();
    public void act(){
        this.poundsIntoKilo(validationService.validateInputIsFloat("Insert Pounds:"));
    }
    private void poundsIntoKilo(float pounds) {
        float kg = pounds / 2.2f;
        System.out.println(pounds + " lb. = " + kg + " kg.");
    }
}
