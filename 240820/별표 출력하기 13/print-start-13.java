import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; ++i) {
            int a = n - i;
            int b = i + 1;

            for (int x = 0; x < a; ++x) {
                System.out.print("* ");
            }
            System.out.println();

            
            for (int x = 0; x < b; ++x) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}