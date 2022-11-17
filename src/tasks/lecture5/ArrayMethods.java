package tasks.lecture5;

import tasks.TaskInterface;
import valdidation.ValidationService;

import java.util.stream.IntStream;

public class ArrayMethods implements TaskInterface {
    final String name = "Array Methods";
    ValidationService validationService = new ValidationService();

    @Override
    public void act() {
        int length = validationService.validateInputIsInt("Insert length of array");
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = validationService.validateInputIsInt("Insert value for index " + i);
        }
        //Check if the Array cointains a specific value
        this.contains(
                validationService.validateInputIsInt("Insert value to search for"),
                array);

        //Get the average of the values inside the Array
        this.average(array);

        //Get the maximum value inside the Array and its index
        this.max(array);

        //Print every Value that's equal or bigger than the average
        this.print(array);


    }

    private void contains(int number, int... numbers) {
        for (int i : numbers) {
            if (i == number) {
                System.out.printf("%d is in the array", number);
            }
        }
        System.out.printf("%d is not in the array", number);
    }

    private int average(int... numbers) {
        int sum = IntStream.of(numbers).sum();

        return sum / numbers.length;
    }

    private void print(int... numbers) {
        int sum = average(numbers);

        for(int i: numbers) {
            if (i >= sum) {
                System.out.printf("\n%d is equal or bigger than the " ,i);
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
        System.out.printf("\n%d is the biggest number, and it's on pos. %d", max, position);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
