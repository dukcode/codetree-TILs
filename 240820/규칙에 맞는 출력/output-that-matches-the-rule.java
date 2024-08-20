import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int y = 0; y < n; ++y) {
            for (int x = n - y; x <= n; ++x) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}