package practice;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int pagesCount=Integer.parseInt(scanner.nextLine());
        int readPagesPerHour=Integer.parseInt(scanner.nextLine());
        int days=Integer.parseInt(scanner.nextLine());
        System.out.println((pagesCount/readPagesPerHour)/days);
    }
}
