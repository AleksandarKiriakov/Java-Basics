package Lectures.Third;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String product=scanner.nextLine();
        String city= scanner.nextLine();
        double counts=Double.parseDouble(scanner.nextLine());
        if (city.equals("Sofia"))
        {
            switch (product){
                case "coffee":
                    System.out.println(counts*0.5);
                    break;
                case "water":
                    System.out.println(counts*0.8);
                    break;
                case "beer":
                    System.out.println(counts*1.2);
                    break;
                case "sweets":
                    System.out.println(counts*1.45);
                    break;
                case "peanuts":
                    System.out.println(counts*1.6);
                    break;
            }
        }
        else if (city.equals("Plovdiv"))
        {
            switch (product){
                case "coffee":
                    System.out.println(counts*0.4);
                    break;
                case "water":
                    System.out.println(counts*0.7);
                    break;
                case "beer":
                    System.out.println(counts*1.15);
                    break;
                case "sweets":
                    System.out.println(counts*1.3);
                    break;
                case "peanuts":
                    System.out.println(counts*1.5);
                    break;
            }
        }
        else if (city.equals("Varna"))
        {
            switch (product){
                case "coffee":
                    System.out.println(counts*0.45);
                    break;
                case "water":
                    System.out.println(counts*0.7);
                    break;
                case "beer":
                    System.out.println(counts*1.1);
                    break;
                case "sweets":
                    System.out.println(counts*1.35);
                    break;
                case "peanuts":
                    System.out.println(counts*1.55);
                    break;
            }
        }
    }
}
