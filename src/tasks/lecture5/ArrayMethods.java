package tasks.lecture5;

import tasks.TaskInterface;
import valdidation.ValidationService;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayMethods implements TaskInterface {
    final String name = "Array Methods";
    final ValidationService validationService = new ValidationService();
    final Scanner scanner  = new Scanner(System.in);

    @Override
    public void act() {
        int length = validationService.validateInputIsInt("Insert length of array");
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = validationService.validateInputIsInt("Insert value for index " + i);
        }
        System.out.println("Array: " + Arrays.toString(array));
        //Check if the Array cointains a specific value
        System.out.println("Does the array a specific value? ");
        this.contains(
                validationService.validateInputIsInt("Insert value to search for"),
                array);

        //Get the average of the values inside the Array
        this.next();
        System.out.println("Average of the values inside the Array: ");
        this.average(array);

        //Get the maximum value inside the Array and its index
        this.next();
        System.out.println("Maximum value inside the Array and its index: ");
        this.max(array);

        //Print every Value that's equal or bigger than the average
        this.next();
        System.out.println("Every Value that's equal or bigger than the average: ");
        this.print(array);


    }
    private void next(){
        System.out.println("Press enter to continue");
        scanner.nextLine();
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

    private void print(int... numbers) {
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

    @Override
    public String getName() {
        return this.name;
    }
}
