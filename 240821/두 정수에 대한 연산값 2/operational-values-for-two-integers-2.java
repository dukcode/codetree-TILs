import java.util.Scanner;

public class Main {
    private static void solve(int[] arr) {
        int minIdx = arr[0] < arr[1] ? 0 : 1;
        int maxIdx = arr[0] > arr[1] ? 0 : 1;

        arr[minIdx] += 10;
        arr[maxIdx] *= 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = {a, b};
        solve(arr);

        System.out.println(arr[0] + " " + arr[1]);
    }
}