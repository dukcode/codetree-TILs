import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int y = 0; y < 2 * n - 1; ++y) {
            int space = Math.abs(n - 1 - y);
            int x = n - Math.abs(n - 1 - y);

            for (int i = 0; i < space; ++i) {
                System.out.print(" ");
            }

            for (int i = 0; i < x; ++i) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}