package input;

import java.util.Scanner;

public class GetUserInputService {
    public static float getFloatFromUserWithMessage(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextFloat();
    }

    public static int getIntFromUserWithMessage(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
