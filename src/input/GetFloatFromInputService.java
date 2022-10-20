package input;

import java.util.Scanner;

public class GetFloatFromInputService {
    public static float getFloatFromUserWithMessage(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextFloat();
    }
}
