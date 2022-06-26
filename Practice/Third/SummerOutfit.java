package Practice.Third;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        if (name.equals("Morning")) {
            if (10 <= temp && temp <= 18) {
                System.out.printf("It's %d degrees, get your %s and %s."
                        ,temp,"Sweatshirt","Sneakers");
            } else if (18 < temp && temp <= 24) {
                System.out.printf("It's %d degrees, get your %s and %s."
                        ,temp,"Shirt","Moccasins");
            } else if (temp >= 25) {
                System.out.printf("It's %d degrees, get your %s and %s."
                        ,temp,"T-Shirt","Sandals");
            }
        } else if (name.equals("Afternoon")) {
            if (10 <= temp && temp <= 18) {
                System.out.printf("It's %d degrees, get your %s and %s."
                        ,temp,"Shirt","Moccasins");
            } else if (18 < temp && temp <= 24) {
                System.out.printf("It's %d degrees, get your %s and %s."
                        ,temp,"T-Shirt","Sandals");
            } else if (temp >= 25) {
                System.out.printf("It's %d degrees, get your %s and %s."
                        ,temp,"Swim Suit","Barefoot");
            }
        } else if (name.equals("Evening")) {
            if (10 <= temp && temp <= 18) {
                System.out.printf("It's %d degrees, get your %s and %s."
                        ,temp,"Shirt","Moccasins");
            } else if (18 < temp && temp <= 24) {
                System.out.printf("It's %d degrees, get your %s and %s."
                        ,temp,"Shirt","Moccasins");
            } else if (temp >= 25) {
                System.out.printf("It's %d degrees, get your %s and %s."
                        ,temp,"Shirt","Moccasins");
            }
        }
    }
}