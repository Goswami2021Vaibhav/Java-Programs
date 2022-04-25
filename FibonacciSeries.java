public class FibonacciSeries {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0;
        int nextNum = 0;
       System.out.println("Fibonacci Series");
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                nextNum = num1 + num2;
                System.out.println(nextNum);
            } else if (i == 1) {
                num1 = 0;
                num2 = 1;
                nextNum = num1 + num2;
                System.out.println(nextNum);
            } else {
                nextNum = num1 + num2;
                System.out.println(nextNum);
                num1 = num2;
                num2 = nextNum;
            }
        }
    }
}
