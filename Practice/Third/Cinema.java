package Practice.Third;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        switch (projection) {
            case "Premiere":
                double sum = rows * cols * 12;
                System.out.printf("%.02f" + "%n%s",  sum, "leva");
                break;
            case "Normal":
                double Sum = rows * cols * 7.5;
                System.out.printf("%.02f" + "%n%s", Sum, "leva");
                break;
            case "Discount":
                double Sum1 = rows * cols * 5;
                System.out.printf("%.02f" + "%n%s",Sum1, "leva");
                break;
        }
    }
}
