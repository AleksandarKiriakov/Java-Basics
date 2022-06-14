package Lectures;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String NameOfFigure = scanner.nextLine();
        double area=0;
        if (NameOfFigure.equals("square")) {
            double sideLen=Double.parseDouble(scanner.nextLine());
           area=(sideLen*sideLen);
        }
        else if (NameOfFigure.equals("rectangle")) {
            double sideALen=Double.parseDouble(scanner.nextLine());
            double sideBLen=Double.parseDouble((scanner.nextLine()));
            area=(sideALen*sideBLen);
        }
        else if (NameOfFigure.equals("circle")) {
        double radius= Double.parseDouble(scanner.nextLine());
            area=(Math.PI*radius*radius);
        }
        else if (NameOfFigure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area=((a*h)/2);
        }
        System.out.printf("%.3f",area);
    }
}
