package tasks.lecture3;

import tasks.TaskInterface;
import valdidation.ValidationService;

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
                case 1 -> {
                    System.out.println("You got gum");
                    sales.put("Gum", sales.get("Gum") + 1);
                }
                case 2 -> {
                    System.out.println("You got Chocolate");
                    sales.put("Chocolate", sales.get("Chocolate") + 1);
                }
                case 3 -> {
                    System.out.println("You got Popcorn");
                    sales.put("Popcorn", sales.get("Popcorn") + 1);
                }
                case 4 -> {
                    System.out.println("You got Juice");
                    sales.put("Juice", sales.get("Juice") + 1);
                }
                case 5 -> {
                    System.out.println("Total sales so far:");
                    for (String item : sales.keySet()) {
                        System.out.println(item + ": " + sales.get(item));
                    }
                }
                case 6 -> System.out.println("Goodbye");
            }

        } while (!(selectedNumber == 6));
    }


    @Override
    public String getName() {
        return this.name;
    }


}

