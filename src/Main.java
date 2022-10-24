import tasks.*;

import java.util.LinkedHashMap;


public class Main {
    public static void main(String[] args) {

        //Build MenuMap
        LinkedHashMap<String, Integer> menuMap = new LinkedHashMap<>();
        PrintExampleLect01 printExampleLect01 = new PrintExampleLect01();
        menuMap.put(printExampleLect01.name, 1);
        PoundIntoKiloProcessor poundIntoKiloProcessor = new PoundIntoKiloProcessor();
        menuMap.put(poundIntoKiloProcessor.name, 2);
        RectangleCalculator rectangleCalculator = new RectangleCalculator();
        menuMap.put(rectangleCalculator.name, 3);
        BmiCalculator bmiCalculator = new BmiCalculator();
        menuMap.put(bmiCalculator.name, 4);
        GroupCalculator groupCalculator = new GroupCalculator();
        menuMap.put(groupCalculator.name, 5);




        printExampleLect01.act();
        rectangleCalculator.act();
        poundIntoKiloProcessor.act();
        bmiCalculator.act();
        groupCalculator.act();


    }
}