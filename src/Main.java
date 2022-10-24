import menu.MenuHandler;


public class Main {
    public static void main(String[] args) {
        MenuHandler menuHandler = new MenuHandler();

        System.out.println("Hello!\n");

        menuHandler.act();

        System.out.println("\nThank you and goodbye!");

    }
}