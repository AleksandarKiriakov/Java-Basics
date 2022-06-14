package Practice;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int depositSum= Integer.parseInt(scanner.nextLine());
        int months=Integer.parseInt(scanner.nextLine());
        double yearPercentage=Double.parseDouble((scanner.nextLine()));
        double interestCount= depositSum*(yearPercentage/100);
        System.out.println(depositSum+(months*(interestCount/12)));
    }
}
