package Lectures.First;
import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters=Double.parseDouble(scanner.nextLine());
        double price = meters*7.61;
        double discount= 0.18*price;
        System.out.printf("The final price is: %f lv.",price-discount);
        System.out.printf("The discount is: %f lv.",discount);
    }
}
