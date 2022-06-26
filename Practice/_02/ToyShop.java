package Practice._02;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double sum = (puzzle * 2.6) + (dolls * 3) + (bears * 4.1) + (minions * 8.2) + (trucks * 2);
        int count = puzzle + dolls + bears + minions + trucks;
        if (count>=50){
           double discount=sum*0.25;
           sum-=discount;
        }
        sum-=(sum*0.1);
        if (sum>=price)
        {
            System.out.printf("Yes! %.02f lv left.%n",(sum-price));
        }
        else
        {
            System.out.printf("Not enough money! %.02f lv needed.",Math.abs(sum-price));
        }
    }
}
