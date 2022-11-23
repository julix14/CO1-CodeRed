package tasks.lecture1;

import tasks.TaskInterface;
import validation.ValidationService;

public class GroupCalculator implements TaskInterface {
    final String name = "Group-Calculator";
    private final ValidationService validationService = new ValidationService();

    @Override
    public void act() {
        this.calculateGroupSize(
                validationService.validateInputIsInt("Insert group size: "),
                validationService.validateInputIsInt("Insert total amount of Students: "));
    }
    private void calculateGroupSize(int groupSize, int totalMembers) {
        int subgroups = totalMembers / groupSize;
        int studentsLeft = totalMembers % groupSize;

        System.out.println("Number of groups: " + subgroups);
        System.out.println("Number of students crossed over: " + studentsLeft);
    }

    @Override
    public String getName() {
        return name;
    }
}
