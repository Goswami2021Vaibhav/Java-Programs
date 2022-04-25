import java.util.Scanner;

public class PrimeNumber {
    static void Prime(int n) {
        if (n == 2) {
            System.out.println(n + " is a prime number");
        } else if (n == 0 || n == 1 || n % 2 == 0) {
            System.out.println(n + " is not a prime number");
        } else {
            System.out.println(n + " is a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        System.out.println("Enter A Number");
        int Num = N.nextInt();
        Prime(Num);
    }
}
