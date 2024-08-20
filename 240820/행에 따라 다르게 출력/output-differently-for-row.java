import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 0;

        for (int y = 0; y < n; ++y) {
            for (int x = 0; x < n; ++x) {
                if (y % 2 == 0) {
                    num += 1;
                } else {
                    num += 2;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}