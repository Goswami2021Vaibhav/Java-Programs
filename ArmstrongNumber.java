import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Limit");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int temp, digits = 0, last, sum = 0;
            
            temp = i;
            // --------------Get Digits--------------
            while (temp > 0) {
                temp = temp / 10;
                digits++;
            }

            // -------------Get Last Digit----------------
            temp = i;
            while (temp > 0) {
                last = temp % 10;
                sum += (Math.pow(last, digits));
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.println(sum);
            }
        }

    }
}
