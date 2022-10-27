package tasks;

import valdidation.ValidationService;

public class GradeConverter implements TaskInterface{
    String name = "Grade Converter";
    ValidationService validationService = new ValidationService();

    @Override
    public void act() {
        this.convert(
                validationService.validateInputIsInt("Insert grade"));
    }

    private void convert(int grade){
        if(grade >= 96){
            System.out.println("1");
        } else if(grade >= 91){
            System.out.println("1.3");
        } else if(grade >= 86){
            System.out.println("1.7");
        } else if(grade >= 81){
            System.out.println("2");
        } else if(grade >= 76){
            System.out.println("2.3");
        } else if(grade >= 71){
            System.out.println("2.7");
        } else if(grade >= 66){
            System.out.println("3");
        } else if(grade >= 61){
            System.out.println("3.3");
        } else if(grade >= 56){
            System.out.println("3.7");
        } else if(grade >= 50){
            System.out.println("4");
        } else if(grade < 50){
            System.out.println("5");
        } else{
            System.out.println("Invalid grade");
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
