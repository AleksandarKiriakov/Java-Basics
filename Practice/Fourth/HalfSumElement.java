package Practice.Fourth;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int biggest = 0;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > biggest) {
                sum+=biggest;
                biggest = num;
            } else {
                sum += num;
            }
        }
        if (biggest==sum)
        System.out.printf("Yes%nSum = %d",sum);
        else{
            System.out.printf("No%nDiff = %d",Math.abs(sum-biggest));
        }
    }
}
