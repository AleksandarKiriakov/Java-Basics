package Practice.First;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cover=Integer.parseInt(scanner.nextLine());
        int paint=Integer.parseInt(scanner.nextLine());
        int thinner=Integer.parseInt(scanner.nextLine());
        int hours=Integer.parseInt(scanner.nextLine());
        double sumMaterials=((cover+2)*1.50)+((paint+(0.10*paint))*14.5)
                +(thinner*5)+0.4;
        System.out.println(sumMaterials+((sumMaterials*0.3)*hours));
    }
}
