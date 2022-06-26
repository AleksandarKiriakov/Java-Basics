package Lectures._04;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}
