package Practice._02;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double secR = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secsPerMeter = Double.parseDouble(scanner.nextLine());
        double ivanTime = meters * secsPerMeter;
        double resistance = Math.floor((meters / 15)) * 12.5;
        double fullTime = ivanTime + resistance;
        if (fullTime>=secR)
        {
            System.out.printf("No, he failed! He was %.02f seconds slower.",(fullTime-secR));
        }
        else
        {
            System.out.printf("Yes, he succeeded! The new world record is %.02f seconds.",fullTime);
        }
    }
}
