package tasks;

public class PoundIntoKiloProcessor {
    public String name = "Pound into Kilo Processor";
    public static void poundsIntoKilo(float pounds) {
        float kg = pounds / 2.2f;
        System.out.println(pounds + " lb. = " + kg + " kg.");
    }
}
