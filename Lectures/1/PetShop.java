import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int dogFood=Integer.parseInt(scan.nextLine());
        int catFood=Integer.parseInt(scan.nextLine());
        System.out.println(dogFood*2.5+catFood*4);
    }
}
