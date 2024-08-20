import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int y = 0; y < n; ++y) {
            if (y == 0 || y == n - 1) {
                printLine(n);
                continue;
            }

            int a = y;
            int b = n - 1 - a;

            for (int i = 0; i < a; ++i) {
                System.out.print("* ");
            }
            
            
            for (int i = 0; i < b; ++i) {
                System.out.print("  ");
            }

            System.out.println("*");
        }


    }

    private static void printLine(int n) {
        for (int i = 0; i < n; ++i) {
            System.out.print("* ");
        }
        System.out.println();
    }
}