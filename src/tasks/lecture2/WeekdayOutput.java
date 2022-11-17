package tasks.lecture2;

import tasks.TaskInterface;
import valdidation.ValidationService;

public class WeekdayOutput implements TaskInterface {
    public String name = "Weekday Output";
    ValidationService validationService = new ValidationService();
    @Override
    public void act() {
        outputWeekday(
                validationService.validateInputIsInt("Insert weekday number"),
                validationService.valdidateInputIsNotEmpty("Insert language (en/de)"));
    }

    private void outputWeekday(int weekday, String language) {
        if (language.equalsIgnoreCase("en")) {
            switch (weekday) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Invalid weekday");
            }
        } else if (language.equalsIgnoreCase("de")) {
            switch (weekday) {
                case 1 -> System.out.println("Montag");
                case 2 -> System.out.println("Dienstag");
                case 3 -> System.out.println("Mittwoch");
                case 4 -> System.out.println("Donnerstag");
                case 5 -> System.out.println("Freitag");
                case 6 -> System.out.println("Samsatg");
                case 7 -> System.out.println("Sonntag");
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
