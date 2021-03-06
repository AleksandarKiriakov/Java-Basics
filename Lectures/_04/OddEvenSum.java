package Lectures._04;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= count; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sum1 += number;
                continue;
            }
            sum2 += number;
        }
        if (sum1 == sum2) {
            System.out.println("Yes");
            System.out.printf("Sum = %d",sum1);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sum1-sum2));
        }
    }
}
