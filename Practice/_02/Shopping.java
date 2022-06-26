package Practice._02;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int RAM = Integer.parseInt(scanner.nextLine());
        double sum = videoCards * 250 + processor * ((videoCards * 250) * 0.35)
                + RAM * ((videoCards * 250) * 0.1);
        if (videoCards>processor)
        {
            sum-=(sum*0.15);
        }
        double finalPrice=Math.abs(budget-sum);
        if (sum > budget) {
            System.out.printf("Not enough money! You need %.02f leva more!",Math.abs(finalPrice));

        }
        else {
            System.out.printf("You have %.02f leva left!",finalPrice);
        }
    }
}

