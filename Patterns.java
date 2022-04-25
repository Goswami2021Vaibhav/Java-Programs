public class Patterns {
    public static void main(String[] args) {
        System.out.println("Right Triangle Pattern");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Left Triangle Pattern");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            int sp = 10 - i;
            int star = i;
            for (int j = 0; j < sp; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
