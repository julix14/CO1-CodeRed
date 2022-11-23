package tasks.lecture1;

import tasks.TaskInterface;
import validation.ValidationService;

public class PoundIntoKiloProcessor implements TaskInterface {
    final String name = "Pound into Kilo Processor";
    private final ValidationService validationService = new ValidationService();
    @Override
    public void act(){
        this.poundsIntoKilo(validationService.validateInputIsFloat("Insert Pounds:"));
    }
    private void poundsIntoKilo(float pounds) {
        float kg = pounds / 2.2f;
        System.out.println(pounds + " lb. = " + kg + " kg.");
    }

    @Override
    public String getName() {
        return name;
    }
}
