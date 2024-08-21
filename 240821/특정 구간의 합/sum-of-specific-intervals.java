import java.util.Scanner;

public class Main {

    private static int n;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int m = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; ++i) {
            int fr = sc.nextInt() - 1;
            int to = sc.nextInt() - 1;
            System.out.println(sum(fr, to));
        }
    }

    private static int sum(int fr, int to) {
        int ret = 0;
        for (int i = fr; i <= to; ++i) {
            ret += arr[i];
        }

        return ret;
    }
}