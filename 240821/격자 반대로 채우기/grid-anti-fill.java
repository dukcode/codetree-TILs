import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 1;
        int[][] arr = new int[n][n];
        for (int x = n - 1; x >= 0; --x) {
            boolean forward = (n - 1) % 2 != x % 2;

            if (forward) {
                for (int y = 0; y < n; ++y) {
                    arr[y][x] = num++;
                }
            } else {
                for (int y = n - 1; y >= 0; --y) {
                    arr[y][x] = num++;
                }
            }
        }

        for (int y = 0; y < n; ++y) {
            for (int x = 0; x < n; ++x) {
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }
    }
}