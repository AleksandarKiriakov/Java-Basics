package Lectures.Second;


import java.util.Scanner;

public class guessPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String correctPass = "s3cr3t!P@ssw0rd";
        if (text.equals(correctPass)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
