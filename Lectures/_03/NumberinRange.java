package Lectures._03;

import java.util.Scanner;

public class NumberinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number != 0 && number >= -100 && number <= 100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
