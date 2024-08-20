import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 9;
        for (int y = 0; y < n; ++y) {
            for (int x = 0; x < n; ++x) {
                System.out.print(num--);
                if (num == 0) {
                    num = 9;
                }
            }
            System.out.println();
        }
    }
}