package tasks.lecture5;

import tasks.TaskInterface;
import valdidation.ValidationService;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class ArrayMethods implements TaskInterface {
    final String name = "Array Methods";
    final ValidationService validationService = new ValidationService();

    @Override
    public void act() {

        methodSelection();

    }
    private void contains(int number, int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                System.out.printf("%d is in the array at position %d\n", number, i);
                return;
            }
        }
        System.out.printf("%d is not in the array\n", number);
    }

    private int average(int... numbers) {
        int sum = IntStream.of(numbers).sum();
        System.out.println(sum / numbers.length);
        return sum / numbers.length;
    }

    private void printIfBiggerAsAverage(int... numbers) {
        int average = average(numbers);

        for(int i: numbers) {
            if (i >= average) {
                System.out.printf("\n%d is equal or bigger than the average\n" ,i);
            }
        }
    }

    private void max(int... numbers) {
        int max = numbers[0];
        int position = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                position = i + 1;
            }
        }
        System.out.printf("\n%d is the biggest number, and it's on pos. %d\n", max, position);
    }

    private int[] buildArray(){
        int length = validationService.validateInputIsInt("Insert length of array");
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = validationService.validateInputIsInt("Insert value for index " + i);
        }
        System.out.println("Your Array is: " + Arrays.toString(array));
        return array;
    }

    private void methodSelection(){
        int selectedItem;
        int[] array = buildArray();

        LinkedList<String> menuItems = new LinkedList<>();
        menuItems.add("Quit");
        menuItems.add("Contains a specific value");
        menuItems.add("Average of the values inside the Array");
        menuItems.add("Max value inside the Array and its index");
        menuItems.add("Print if bigger as average");
        menuItems.add("Build new Array");

        do {
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.printf("[%d] -> %s\n", i, menuItems.get(i));
            }
            selectedItem = validationService.validateInputIsInRange("Select a method to run", 0, menuItems.size() - 1);
            switch (selectedItem){
                case 0 -> System.out.println("Bye");
                case 1 -> this.contains(validationService.validateInputIsInt("Insert value to search for"), array);
                case 2 -> this.average();
                case 3 -> this.max();
                case 4 -> this.printIfBiggerAsAverage();
                case 5 -> this.buildArray();
            }
        }while (selectedItem != 0);

    }

    @Override
    public String getName() {
        return this.name;
    }
}
