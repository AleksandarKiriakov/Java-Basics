package Lectures.First;
import java.util.Scanner;

public class ConcatData {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String Fname=scanner.nextLine();
        String Lname=scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());
        String Town=scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.",Fname,Lname,age,Town);
    }
}
