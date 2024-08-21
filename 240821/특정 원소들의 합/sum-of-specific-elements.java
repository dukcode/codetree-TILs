import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        int[][] arr = new int[n][n];
        for (int y = 0; y < n; ++y) {
            for (int x = 0; x < n; ++x) {
                arr[y][x] = sc.nextInt();
            }
        }
        
        int sum = 0;
        for (int y = 0; y < n; ++y) {
            for (int x = 0; x <= y; ++x) {
                sum += arr[y][x];
            }
        }

        System.out.println(sum);
    }
}