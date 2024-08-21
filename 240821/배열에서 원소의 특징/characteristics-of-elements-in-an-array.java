import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 1; i < n; ++i) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i - 1]);
                break;
            }
        }
    }
}