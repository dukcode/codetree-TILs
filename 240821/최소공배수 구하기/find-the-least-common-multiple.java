import java.util.Scanner;

public class Main {

    private static int gdc(int a, int b) {
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

    private static int lcm(int a, int b) {
        return a / gdc(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(lcm(a, b));
    }
}