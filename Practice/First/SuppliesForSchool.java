package Practice.First;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int pen= Integer.parseInt(scanner.nextLine());
        int markers=Integer.parseInt(scanner.nextLine());
        int cleaningLiquid=Integer.parseInt(scanner.nextLine());
        int percent=Integer.parseInt(scanner.nextLine());
        double sum=(pen*5.8+markers*7.2+cleaningLiquid*1.2);
        System.out.println(sum-(0.25*sum));
    }
}
