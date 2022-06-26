package Lectures._04;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int firstSum=0;
        int secSum=0;
        for (int i = 0; i < n * 2; i++)
        {
            int num=Integer.parseInt(scanner.nextLine());
            if (i<n)
            {
                firstSum+=num;
            }else{
                secSum+=num;
            }
        }
        if (firstSum==secSum)
        {
            System.out.printf("Yes, sum = %d",firstSum);
        }
        else{
            System.out.printf("No, diff = %d",Math.abs(firstSum-secSum));
        }

    }
}
