import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < m; ++i) {
            int y = sc.nextInt();
            int x = sc.nextInt();

            arr[y - 1][x - 1] = y * x;
        }

        for (int y = 0; y < n; ++y) {
            for (int x = 0; x < n; ++x) {
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }
    }
}