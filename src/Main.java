import input.GetUserInputService;
import tasks.GroupCalculator;


public class Main {
    public static void main(String[] args) {
        /*InputOutputFun.inputOutputFun();
        PrintExampleLect01.printExample();
        RectangleCalculator.calculate(
                GetFloatFromInputService.getFloatFromUserWithMessage("Insert height"),
                GetFloatFromInputService.getFloatFromUserWithMessage("Insert width"));

        PoundIntoKiloProcessor.poundsIntoKilo(GetFloatFromInputService.getFloatFromUserWithMessage("Insert Pounds:"));

        BmiCalculator.calculate(
                GetFloatFromInputService.getFloatFromUserWithMessage("Insert height in m"),
                GetFloatFromInputService.getFloatFromUserWithMessage("Insert weight in kg"));

*/
        GroupCalculator.calculateGroupSize(
                GetUserInputService.getIntFromUserWithMessage("Insert group size: "),
                GetUserInputService.getIntFromUserWithMessage("Insert total amount of Students: "));


    }
}