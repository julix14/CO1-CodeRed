package menu;

import tasks.TaskInterface;
import tasks.lecture1.*;
import tasks.lecture2.*;
import tasks.lecture3.*;
import tasks.lecture4.MoneyConverter;
import tasks.lecture5.ArrayMethods;
import tasks.lecture5.TemperatureReadings;
import tasks.lecture9.PasswordChecker;
import tasks.lecture9.PasswordGenerator;
import validation.ValidationService;

import java.util.LinkedList;
import java.util.List;

public class MenuHandler {
    private final ValidationService validationService = new ValidationService();
    List<TaskInterface> menuList;
    public MenuHandler(List<TaskInterface> menuList) {
        this.menuList = menuList;
    }
    public MenuHandler() {
        this.menuList = buildUpMainMenuList();
    }
    public void act(){
        printMenu(menuList);
        selectFromMenu(menuList);
    }

    private LinkedList<TaskInterface> buildUpMainMenuList() {
        //Create an Instance of each task and add it to the list
        LinkedList<TaskInterface> menuList = new LinkedList<>();

        //Lecture 1
        MenuGroup lecture1 = new MenuGroup(
                "Lecture 1",
                new PrintExampleLect01(),
                new PoundIntoKiloProcessor(),
                new RectangleCalculator(),
                new BmiCalculator(),
                new GroupCalculator());
        menuList.add(lecture1);

        //Lecture 2


        MenuGroup lecture2 = new MenuGroup(
                "Lecture 2",
                new NumberComparator(),
                new NumberSumGuesser(),
                new GradeConverter(),
                new PriceCalculator(),
                new WeekdayOutput());
        menuList.add(lecture2);

        //Lecture 3
        MenuGroup lecture3 = new MenuGroup(
                "Lecture 3",
                new DisplayEven(),
                new PaintPattern(),
                new MultiplicationService(),
                new CircleCalculator(),
                new VendingMachine());
        menuList.add(lecture3);

        //Lecture 4
        MenuGroup lecture4 = new MenuGroup(
                "Lecture 4",
                new MoneyConverter());
        menuList.add(lecture4);

        //Lecture 5
        MenuGroup lecture5 = new MenuGroup(
                "Lecture 5",
                new TemperatureReadings(),
                new ArrayMethods());
        menuList.add(lecture5);


        MenuGroup lecture9 = new MenuGroup(
                "Lecture 9",
                new PasswordChecker(),
                new PasswordGenerator());
        menuList.add(lecture9);

        return menuList;
    }

    private void printMenu(List<TaskInterface> menuList) {
        //Print menu
        for (int i = 0; i < menuList.size(); i++) {
            System.out.printf("[%d] -> %s\n", i+1, menuList.get(i).getName());
        }
    }

    private void selectFromMenu(List<TaskInterface> menuList){
        //Select a menu item
        Integer selectedItemNumber = validationService.validateInputIsInRange("Select a menu item: ", 1 ,menuList.size());
        //Get selected item from menuList
        TaskInterface selectedItem = menuList.get(selectedItemNumber-1);
        System.out.println("You selected: " + selectedItem.getName());
        //Run selected item
        selectedItem.act();
    }

}
