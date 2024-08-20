import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int ans = 0;
        if (a % 3 == 0 || a % 5 == 0) {
            ans = 1;
        }

        System.out.println(ans);
    }
}