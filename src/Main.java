import tasks.*;
import valdidation.ValidationService;


public class Main {
    public static void main(String[] args) {
        ValidationService validationService = new ValidationService();

        PrintExampleLect01.printExample();
        RectangleCalculator.calculate(
                validationService.validateInputIsFloat("Insert height"),
                validationService.validateInputIsFloat("Insert width"));

        PoundIntoKiloProcessor.poundsIntoKilo(validationService.validateInputIsFloat("Insert Pounds:"));

        BmiCalculator.calculate(
                validationService.validateInputIsFloat("Insert height in m"),
                validationService.validateInputIsFloat("Insert weight in kg"));



        GroupCalculator.calculateGroupSize(
                validationService.validateInputIsInt("Insert group size: "),
                validationService.validateInputIsInt("Insert total amount of Students: "));


    }
}