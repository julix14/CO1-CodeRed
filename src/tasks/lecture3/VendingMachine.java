package tasks.lecture3;

import tasks.TaskInterface;
import validation.ValidationService;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class VendingMachine implements TaskInterface {
    private final String name = "Vending Machine";

    @Override
    public void act() {
        List<String> menu = buildUpMenuList();
        selectItemFromMenu(menu);
    }

    private LinkedList<String> buildUpMenuList() {
        //Create an Instance of each task and add it to the list
        LinkedList<String> menuList = new LinkedList<>();
        menuList.add("[1] Get Gum");
        menuList.add("[2] Get Chocolate");
        menuList.add("[3] Get Popcorn");
        menuList.add("[4] Get Juice");
        menuList.add("[5] Display total sales so far");
        menuList.add("[6] Quit");
        return menuList;
    }

    private void selectItemFromMenu(List<String> menuList) {
        ValidationService validationService = new ValidationService();
        Integer selectedNumber;
        HashMap<String, Integer> sales = new HashMap<>();
        sales.put("Gum", 0);
        sales.put("Chocolate", 0);
        sales.put("Popcorn", 0);
        sales.put("Juice", 0);

        do {
            for (String item : menuList) {
                System.out.println(item);
            }

            selectedNumber = validationService.validateInputIsInRange("Please select a number from the menu", 1, 6);

            switch (selectedNumber) {
                case 1 -> putItemToSales(sales, "Gum");
                case 2 -> putItemToSales(sales, "Chocolate");

                case 3 -> putItemToSales(sales, "Popcorn");
                case 4 -> putItemToSales(sales, "Juice");
                case 5 -> printSales(sales);
                case 6 -> System.out.println("Goodbye");
            }

        } while (!(selectedNumber == 6));
    }


    @Override
    public String getName() {
        return this.name;
    }

    private void putItemToSales(HashMap<String, Integer> sales, String item) {
        System.out.println("You got " + item);
        sales.put(item, sales.get(item) + 1);
    }

    private void printSales(HashMap<String, Integer> sales) {
        System.out.println("Total sales so far:");
        for (String item : sales.keySet()) {
            System.out.println(item + ": " + sales.get(item));
        }
    }


}

