import java.util.*;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int pro = 1;
        if (num > 2) {
            for (int i = 1; i <= num; i++) {
                pro = pro * i;
            }
            System.out.println("Factorial of " + num + " is = " + pro);
        } else {
            System.out.println("Factorial of " + num + " is = " + num);
        }
    }
}
