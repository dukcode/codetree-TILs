import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += sc.nextInt();
        }

        String ret = String.valueOf(sum);
        int len = ret.length();

        ret = ret.substring(1, len) + ret.substring(0, 1);

        System.out.println(ret);
    }
}