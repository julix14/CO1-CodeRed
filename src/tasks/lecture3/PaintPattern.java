package tasks.lecture3;

import tasks.TaskInterface;

public class PaintPattern implements TaskInterface {
    private final String name = "Paint Pattern";

    @Override
    public void act() {
        paintPattern();
    }

    private void paintPattern() {
        System.out.println("First Pattern");

        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 6; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\nSecond Pattern");
        for(int i = 1; i <= 6; i++) {
            if (i == 3 || i == 4) {
                for(int j = 1; j <= 9; j++) {
                    System.out.print(" *");
                }
                System.out.print("\n");
            } else {
                for(int j = 1; j <= 3; j++) {
                    System.out.print(" *");
                }
                System.out.print("\n");
            }
        }

        System.out.println("\nThird Pattern");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
