import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int y = 1; y <= n; ++y) {
            for (int x = n; x >= 1; --x) {
                System.out.print((y * x) + " ");
            }
            System.out.println();
        }
    }
}