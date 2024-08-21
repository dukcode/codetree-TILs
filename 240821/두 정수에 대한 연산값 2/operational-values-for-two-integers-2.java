import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        System.out.println((min + 10) + " " + (max * 2));
    }
}