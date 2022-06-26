package Practice._02;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int persons = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double clothesSum = price * persons;
        double fullCost=decor+clothesSum;
        if (fullCost>budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.02f leva more",fullCost-budget);
        }
        else
        {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.02f leva left.",(budget-fullCost));
        }

    }
}
