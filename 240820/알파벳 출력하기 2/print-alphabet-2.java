import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 0;
        for (int y = 0; y < n; ++y) {
            for (int i = 0; i < y; ++i) {
                System.out.print("  ");
            }

            for (int i = 0; i < n - y; ++i) {
                System.out.print((char)(num + 'A') + " ");
                num++;
            }

            System.out.println();
        }
    }
}