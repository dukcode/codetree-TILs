import java.util.Scanner;

public class Main {

    private static int[] arr;

    private static int gcd(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    private static int lcm(int st, int en) {
        if (st == en) {
            return arr[st];
        }
        
        int a = arr[st];
        int b = lcm(st + 1, en);

        int gcd = gcd(a, b);

        return a * (b / gcd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println(lcm(0, n - 1));
    }
}