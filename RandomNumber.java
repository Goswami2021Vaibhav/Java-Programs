import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int x = r.nextInt(50);
            System.out.println(x);
        }
    }
}
