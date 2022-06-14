package Practice.First;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tax=Integer.parseInt(scanner.nextLine());
        double shoes=tax*0.6;
        double dress=shoes*0.8;
        double ball=dress/4;
        double accessories=ball/5;
        System.out.println(tax+shoes+dress+ball+accessories);

    }
}
