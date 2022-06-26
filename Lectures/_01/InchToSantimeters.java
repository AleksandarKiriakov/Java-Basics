package Lectures._01;
import java.util.Scanner;

public class InchToSantimeters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double inch = Double.parseDouble(scan.nextLine());
        System.out.println(inch*2.54);
    }
}
