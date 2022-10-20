import input.GetFloatFromInputService;
import tasks.RectangelCalculator;


public class Main {
    public static void main(String[] args) {
        //InputOutputFun.inputOutputFun();
        //PrintExampleLect01.printExample();
        RectangelCalculator.calculate(
                GetFloatFromInputService.getFloatFromUserWithMessage("Insert height"),
                GetFloatFromInputService.getFloatFromUserWithMessage("Insert width"));




    }
}