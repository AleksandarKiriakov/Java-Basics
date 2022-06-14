package Practice;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt((scanner.nextLine()));
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int V = len * width * height;
        double VinLiters = V/1000.00;
        double fullSpace=(percent/100);
        System.out.println(VinLiters*(1-fullSpace));
    }
}
