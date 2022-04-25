
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter Number");
        int Num = n.nextInt();
        
        n.close();
        int temp = Num;
        int r, sum = 0;
        while (Num > 0) {
            r = Num % 10;
            sum = (sum * 10) + r;
            Num = Num / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is a palindrome number");
        } else {
            System.out.println(temp + " is not a palindrome number");
        }
    }
}
