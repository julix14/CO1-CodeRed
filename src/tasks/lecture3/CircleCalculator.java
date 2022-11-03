package tasks.lecture3;

import tasks.TaskInterface;
import valdidation.ValidationService;

import java.util.LinkedList;
import java.util.List;

public class CircleCalculator implements TaskInterface {
    private final String name = "Circle Calculator";

    @Override
    public void act() {
        List<String> menu = buildUpMenuList();
        selectItemFromMenu(menu);
    }

    private LinkedList<String> buildUpMenuList() {
        //Create an Instance of each task and add it to the list
        LinkedList<String> menuList = new LinkedList<>();
        menuList.add("[1] Set Radius");
        menuList.add("[2] Display Radius");
        menuList.add("[3] Display Area");
        menuList.add("[4] Display perimeter");
        menuList.add("[5] Quit");
        return menuList;
    }

    private void selectItemFromMenu(List<String> menuList) {
        ValidationService validationService = new ValidationService();
        Integer selectedNumber;
        Integer radius = validationService.validateInputIsBiggerThan("Please enter the radius of the circle", 0);
        do {
            for (String item : menuList) {
                System.out.println(item);
            }

            selectedNumber = validationService.validateInputIsInRange("Please select a number from the menu", 1, 5);

            switch (selectedNumber) {
                case 1 -> {
                    radius = validationService.validateInputIsBiggerThan("Please enter new radius", 0);
                    System.out.println("Radius set to " + radius);
                }
                case 2 -> System.out.println("Radius is: " + radius);
                case 3 -> System.out.println("Area is: " + Math.PI * (radius * radius));
                case 4 -> System.out.println("Perimeter is: " + 2 * Math.PI * radius);
                case 5 -> System.out.println("Goodbye");
            }

        } while (!(selectedNumber == 5));
    }


    @Override
    public String getName() {
        return this.name;
    }


}
