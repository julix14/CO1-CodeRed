package input;

import java.util.Scanner;

public class InputService {
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        return scanner.nextLine();
    }
}
