import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = 2;
        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][][] arrs = new int[k][h][w];
        for (int i = 0; i < k; ++i) {
            for (int y = 0; y < h; ++y) {
                for (int x = 0; x < w; ++x) {
                    arrs[i][y][x] = sc.nextInt();
                }
            }
        }

        for (int y = 0; y < h; ++y) {
            for (int x = 0; x < w; ++x) {
                System.out.print((arrs[0][y][x] == arrs[1][y][x] ? 0 : 1) + " ");
            }
            System.out.println();
        }
    }
}