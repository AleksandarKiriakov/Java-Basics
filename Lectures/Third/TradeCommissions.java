package Lectures.Third;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        switch (city) {
            case "Sofia":
                if (0 <= sales && sales <= 500) {
                    System.out.printf("%.02f", (sales * 0.05));
                } else if (501 <= sales && sales <= 1000) {
                    System.out.printf("%.02f", (sales * 0.07));
                } else if (1001 <= sales && sales <= 10000) {
                    System.out.printf("%.02f", (sales * 0.08));
                } else if (sales > 10000) {
                    System.out.printf("%.02f", (sales * 0.12));
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (0 <= sales && sales <= 500) {
                    System.out.printf("%.02f", (sales * 0.055));
                } else if (501 <= sales && sales <= 1000) {
                    System.out.printf("%.02f", (sales * 0.08));
                } else if (1001 <= sales && sales <= 10000) {
                    System.out.printf("%.02f", (sales * 0.12));
                } else if (sales > 10000) {
                    System.out.printf("%.02f", (sales * 0.145));
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (0 <= sales && sales <= 500) {
                    System.out.printf("%.02f", (sales * 0.045));
                } else if (501 <= sales && sales <= 1000) {
                    System.out.printf("%.02f", (sales * 0.075));
                } else if (1001 <= sales && sales <= 10000) {
                    System.out.printf("%.02f", (sales * 0.1));
                } else if (sales > 10000) {
                    System.out.printf("%.02f", (sales * 0.13));
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
