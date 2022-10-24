package tasks;

import valdidation.ValidationService;

public class GroupCalculator implements TaskInterface {
    public final String name = "Group-Calculator";
    private final ValidationService validationService = new ValidationService();

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

}