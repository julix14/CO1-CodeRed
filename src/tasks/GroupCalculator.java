package tasks;

public class GroupCalculator {
    public String name = "Group-Calculator";
    public static void calculateGroupSize(int groupSize, int totalMembers) {
        int subgroups = totalMembers / groupSize;
        int studentsLeft = totalMembers % groupSize;

        System.out.println("Number of groups: " + subgroups);
        System.out.println("Number of students crossed over: " + studentsLeft);
    }

}
