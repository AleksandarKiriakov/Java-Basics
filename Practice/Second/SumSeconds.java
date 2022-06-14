package Practice.Second;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secondsFirst = Integer.parseInt(scanner.nextLine());
        int secondsSecond = Integer.parseInt(scanner.nextLine());
        int secondsThird = Integer.parseInt(scanner.nextLine());
        int sum = secondsFirst + secondsSecond + secondsThird;
        int min = sum / 60;
        int sec = sum % 60;
        if (sec<10){
            System.out.printf("%d:0%d",min,sec);
        }
        else{
            System.out.printf("%d:%d",min,sec);
        }

    }
}
