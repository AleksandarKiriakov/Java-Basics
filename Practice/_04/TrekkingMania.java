package Practice._04;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int all = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (int i = 0; i < count; i++) {
            int persons = Integer.parseInt(scanner.nextLine());
            all += persons;
            if (persons <= 5) {
                p1 += persons;
            } else if (6 <= persons && persons <= 12) {
                p2 += persons;
            } else if (13 <= persons && persons <= 25) {
                p3 += persons;
            } else if (26 <= persons && persons <= 40) {
                p4 += persons;
            } else if (41 <= persons && persons >= 41) {
                p5 += persons;
            }
        }
        System.out.printf("%.2f" + "%%%n", (p1 / all * 100));
        System.out.printf("%.2f" + "%%%n", (p2 / all * 100));
        System.out.printf("%.2f" + "%%%n", (p3 / all * 100));
        System.out.printf("%.2f" + "%%%n", (p4 / all * 100));
        System.out.printf("%.2f" + "%%%n", (p5 / all * 100));
    }
}
