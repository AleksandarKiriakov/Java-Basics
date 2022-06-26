package Lectures.Third;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double Age=Double.parseDouble(scanner.nextLine());
        String gender= scanner.nextLine();
        switch (gender){
            case "f":
                if (Age>=16){
                    System.out.println("Ms.");
                }
                else{
                    System.out.println("Miss");
                }
                break;
            case "m":
                if (Age>=16){
                    System.out.println("Mr.");
                }
                else{
                    System.out.println("Master");
                }
                break;
        }
    }
}
