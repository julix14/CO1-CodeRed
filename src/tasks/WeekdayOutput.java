package tasks;

import valdidation.ValidationService;

public class WeekdayOutput implements TaskInterface{
    public String name = "Weekday Output";
    ValidationService validationService = new ValidationService();
    @Override
    public void act() {
        outputWeekday(
                validationService.validateInputIsInt("Insert weekday number"),
                validationService.validateInputIsString("Insert language (en/de)"));
    }

    private void outputWeekday(int weekday, String language) {
        if (language.equalsIgnoreCase("en")) {
            switch (weekday) {
                case 0 -> System.out.println("Monday");
                case 1 -> System.out.println("Tuesday");
                case 2 -> System.out.println("Wednesday");
                case 3 -> System.out.println("Thursday");
                case 4 -> System.out.println("Friday");
                case 5 -> System.out.println("Saturday");
                case 6 -> System.out.println("Sunday");
                default -> System.out.println("Invalid weekday");
            }
        } else if (language.equalsIgnoreCase("de")) {
            switch (weekday) {
                case 0 -> System.out.println("Montag");
                case 1 -> System.out.println("Dienstag");
                case 2 -> System.out.println("Mittwoch");
                case 3 -> System.out.println("Donnerstag");
                case 4 -> System.out.println("Freitag");
                case 5 -> System.out.println("Samsatg");
                case 6 -> System.out.println("Sonntag");
                default -> System.out.println("Invalid weekday");
            }
        } else {
            System.out.println("Invalid language");
        }
    }
    @Override
    public String getName() {
        return this.name;
    }
}
