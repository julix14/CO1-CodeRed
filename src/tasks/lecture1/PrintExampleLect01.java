package tasks.lecture1;

import tasks.TaskInterface;

public class PrintExampleLect01 implements TaskInterface {
    final String name = "Print Example";

    @Override
    public void act() {
        this.printExample();
    }
    private void printExample(){
        System.out.println("Hello!");

        int age = 40;
        double salary = 3000.45;
        char gender = 'm';

        System.out.println("Age "+age);
        System.out.println("Salary "+salary);
        System.out.println("Generder "+ gender);
        System.out.print("One\nTwo\nThree\n");

    }

    @Override
    public String getName() {
        return name;
    }
}
