import input.GetFloatFromInputService;
import tasks.BmiCalculator;


public class Main {
    public static void main(String[] args) {
        //InputOutputFun.inputOutputFun();
        //PrintExampleLect01.printExample();
        /*RectangelCalculator.calculate(
                GetFloatFromInputService.getFloatFromUserWithMessage("Insert height"),
                GetFloatFromInputService.getFloatFromUserWithMessage("Insert width"));
        */
        //PoundIntoKiloProcessor.poundsIntoKilo(GetFloatFromInputService.getFloatFromUserWithMessage("Insert Pounds:"));
        BmiCalculator.calculate(
                GetFloatFromInputService.getFloatFromUserWithMessage("Insert height in m"),
                GetFloatFromInputService.getFloatFromUserWithMessage("Insert weight in kg"));




    }
}