package Practice.Second;

import java.util.Scanner;

public class TimePlus15Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int totalTime = hour * 60 + min + 15;
        hour = totalTime / 60;
        min = totalTime % 60;
       if (hour>=24){
           hour%=24;
       }
        System.out.printf("%d:%02d%n", hour, min);
    }
}
