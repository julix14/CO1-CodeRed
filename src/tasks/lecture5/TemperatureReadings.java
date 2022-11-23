package tasks.lecture5;

import tasks.TaskInterface;
import validation.ValidationService;

public class TemperatureReadings implements TaskInterface {
    final String name = "Temperature Readings";
    final ValidationService validationService = new ValidationService();
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};



    @Override
    public void act() {
        double[] temperatures = getTemperatures();
        this.displayTemperatures(temperatures);
        this.wasHot(temperatures);
    }


    private double[] getTemperatures() {
        double[] temperatures = new double[7];
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = validationService.validateInputIsDouble("Insert temperature for day " + (i + 1));
        }
        return temperatures;
    }

    private void displayTemperatures(double[] temperatures) {
        System.out.println("*** Temperatures were entered ***\n");

        for (int i = 0; i < temperatures.length; i++) {
            System.out.printf("\nTemperatures for %s was %.2f", days[i], temperatures[i]);;
        }
    }

    private void wasHot(double[] temperatures) {
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] >= 18){
                System.out.printf("\n%s was a hot day with %.2f!", days[i], temperatures[i]);
            }
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
