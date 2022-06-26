package Lectures.Third;

import java.net.PasswordAuthentication;
import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String day = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
            case "Wednesday":
            case "Thursday":
                switch (name) {
                    case "banana":
                        System.out.printf("%.02f",(count * 2.50));
                        break;
                    case "apple":
                        System.out.printf("%.02f",(count * 1.20));                        break;
                    case "orange":
                        System.out.printf("%.02f",(count * 0.85));                        break;
                    case "grapefruit":
                        System.out.printf("%.02f",(count * 1.45));
                    case "kiwi":
                        System.out.printf("%.02f",(count * 2.7));                        break;
                    case "pineapple":
                        System.out.printf("%.02f",(count * 5.5));                        break;
                    case "grapes":
                        System.out.printf("%.02f",(count * 3.85));                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (name) {
                    case "banana":
                        System.out.printf("%.02f",(count * 2.70));
                        break;
                    case "apple":
                        System.out.printf("%.02f",(count * 1.25));                        break;
                    case "orange":
                        System.out.printf("%.02f",(count * 0.90));                        break;
                    case "grapefruit":
                        System.out.printf("%.02f",(count * 1.6));
                        break;
                    case "kiwi":
                        System.out.printf("%.02f",(count * 3));                        break;
                    case "pineapple":
                        System.out.printf("%.02f",(count * 5.6));                        break;
                    case "grapes":
                        System.out.printf("%.02f",(count * 4.2));                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
