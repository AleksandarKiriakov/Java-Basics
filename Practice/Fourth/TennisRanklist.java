package Practice.Fourth;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int wins = 0;
        for (int i = 0; i < count; i++) {
            String s = scanner.nextLine();
            switch (s) {
                case "W":
                    points += 2000;
                    sum += 2000;
                    wins++;
                    break;
                case "F":
                    points += 1200;
                    sum += 1200;
                    break;
                case "SF":
                    points += 720;
                    sum += 720;
                    break;
            }
        }
        int average = sum / count;
        double pr = (wins * 1.00 / count) * 100.0;
        System.out.println("Final points: " + points);
        System.out.println("Average points: " + average);
        System.out.printf("%.2f" + "%%", pr);
    }
}
