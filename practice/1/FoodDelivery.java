package practice;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int menuChicken=Integer.parseInt(scan.nextLine());
        int menuFish=Integer.parseInt(scan.nextLine());
        int menuVegan=Integer.parseInt(scan.nextLine());

        double menuPrice=(10.35*menuChicken)+(12.4*menuFish)+(menuVegan*8.15);
        double desert=(menuPrice*0.2);
        System.out.println(menuPrice+desert+2.5);
    }
}
