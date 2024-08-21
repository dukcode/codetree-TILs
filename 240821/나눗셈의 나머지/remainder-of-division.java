import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] counts = new int[b];

        while (a > 1) {
            counts[a % b]++;
            a /= b;
        }

        int sum = 0;
        for (int i = 0; i < b; ++i) {
            sum += counts[i] * counts[i];
        }

        System.out.println(sum);
    }
}