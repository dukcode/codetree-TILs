import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = 1;
        for (int i = 1; i <= b; ++i) {
            if (i % a == 0) {
                product *= i;
            }
        }

        System.out.println(product);
    }
}