package menu;

import tasks.*;
import valdidation.ValidationService;

import java.util.LinkedList;
import java.util.List;

public class MenuHandler {
    private final ValidationService validationService = new ValidationService();

    public void act(){
        List<TaskInterface> menuList = buildUpMenuList();
        printMenu(menuList);
        selectFromMenu(menuList);
    }

    private LinkedList<TaskInterface> buildUpMenuList() {
        //Create an Instance of each task and add it to the list
        LinkedList<TaskInterface> menuList = new LinkedList<>();
        PrintExampleLect01 printExampleLect01 = new PrintExampleLect01();
        menuList.add(printExampleLect01);
        PoundIntoKiloProcessor poundIntoKiloProcessor = new PoundIntoKiloProcessor();
        menuList.add(poundIntoKiloProcessor);
        RectangleCalculator rectangleCalculator = new RectangleCalculator();
        menuList.add(rectangleCalculator);
        BmiCalculator bmiCalculator = new BmiCalculator();
        menuList.add(bmiCalculator);
        GroupCalculator groupCalculator = new GroupCalculator();
        menuList.add(groupCalculator);

        return menuList;
    }

    private void printMenu(List<TaskInterface> menuList) {
        //Print menu
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(i + " " + menuList.get(i).getName());
        }
    }

    private void selectFromMenu(List<TaskInterface> menuList){
        //Select a menu item
        Integer selectedItemNumber = validationService.validateInputIsInRange("Select a menu item: ", 0 ,menuList.size()-1);
        //Get selected item from menuList
        TaskInterface selectedItem = menuList.get(selectedItemNumber);
        System.out.println("You selected: " + selectedItem.getName());
        //Run selected item
        selectedItem.act();
    }

}