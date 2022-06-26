package Lectures._04;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int biggerNum = Integer.MIN_VALUE;
        int smallerNum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int Num = Integer.parseInt(scanner.nextLine());
            if (Num > biggerNum) {
                biggerNum = Num;
            }
            if (Num < smallerNum) {
                smallerNum = Num;
            }
        }
        System.out.printf("Max number: %d%nMin number: %d", biggerNum, smallerNum);
    }
}
