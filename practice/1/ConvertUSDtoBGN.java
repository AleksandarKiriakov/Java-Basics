package Practice;

import java.util.Scanner;

public class ConvertUSDtoBGN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double USD=Double.parseDouble(scanner.nextLine());
        System.out.println(USD*1.79549);
    }
}
