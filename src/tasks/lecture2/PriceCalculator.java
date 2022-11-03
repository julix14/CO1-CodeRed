package tasks.lecture2;

import tasks.TaskInterface;

import java.util.Scanner;

public class PriceCalculator implements TaskInterface {
    public String name = "Price Calculator";
    @Override
    public void act() {
        this.calculate();
    }

    private void calculate() {
        Scanner scanner = new Scanner(System.in);
        double BASIC_COST = 375.99;
        double COST_SMALL_SCREEN = 75.99;
        double COST_BIG_SCREEN = 99.99;
        double COST_ANTIVIR = 65.99;
        double COST_PRINTER = 125.00;

        boolean bigScreen = false;
        boolean antivir = false;
        boolean printer = false;

        System.out.println("Basic costs are: " + BASIC_COST);
        System.out.println("Insert Screen size please (small/big)");
        if (scanner.nextLine().equalsIgnoreCase("big")) {
            bigScreen = true;
            System.out.println("Big screen costs: " + COST_BIG_SCREEN);
        } else if (scanner.nextLine().equalsIgnoreCase("small")) {
            System.out.println("Small screen costs: " + COST_SMALL_SCREEN);
        }

        System.out.println("Do you want Antivirus? (yes/no)");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            antivir = true;
            System.out.println("Antivirus costs: " + COST_ANTIVIR);
        }

        System.out.println("Do you want Printer? (yes/no)");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            printer = true;
            System.out.println("Printer costs: " + COST_PRINTER);
        }

        String selectedOptions = "You selected:\n";
        double totalCost = BASIC_COST;
        if (bigScreen) {
            selectedOptions += " Big screen for 99.99\n";
            totalCost += COST_BIG_SCREEN;
        } else {
            selectedOptions += " Small screen for 75.99\n";
            totalCost += COST_SMALL_SCREEN;
        }

        if (antivir) {
            selectedOptions += " Antivirus for 65.99\n";
            totalCost += COST_ANTIVIR;
        }

        if (printer) {
            selectedOptions += " Printer for 125.00\n";
            totalCost += COST_PRINTER;
        }

        System.out.println(selectedOptions);
        System.out.println("Total cost: " + totalCost);


    }

    @Override
    public String getName() {
        return this.name;
    }
}
