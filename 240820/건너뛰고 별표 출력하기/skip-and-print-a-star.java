import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 1 1
        // 2 2
        // 3 3
        // 4 4
        // 3 5
        // 2 6
        // 1 7
        for (int x = 1; x <= 2 * n - 1; ++x) {
            int y = n - Math.abs(n - x);
            for (int i = 0; i < y; ++i) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}