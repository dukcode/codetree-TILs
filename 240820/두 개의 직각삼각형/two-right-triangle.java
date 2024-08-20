import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int y = 0; y < n; ++y) {
            int space = y * 2;
            int x = n - y;

            for (int i = 0; i < x; ++i) {
                System.out.print("*");
            }

            
            for (int i = 0; i < space; ++i) {
                System.out.print(" ");
            }

            
            for (int i = 0; i < x; ++i) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}