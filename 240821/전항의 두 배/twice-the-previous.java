import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        for (int i = 2; i < n; ++i) {
            arr[i] = arr[i - 1] + 2 * arr[i - 2];
        }

        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}