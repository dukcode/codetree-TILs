import java.util.*;

public class Main {

    private static final int MX = 987654321;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int minDiff = MX;
        for (int i = 1; i < n; ++i) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        System.out.println(minDiff);
    }
}