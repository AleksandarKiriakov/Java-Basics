package Practice._04;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;
        int countToy = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                counter++;
                sum += (10 * counter);
                continue;
            }
            countToy++;
        }
        double finalSum = sum + (countToy * priceToy) - counter;
        if (finalSum >= price) {
            System.out.printf("Yes! %.2f", (finalSum - price));
        } else {
            System.out.printf("No! %.2f", (price - finalSum));
        }
    }
}
