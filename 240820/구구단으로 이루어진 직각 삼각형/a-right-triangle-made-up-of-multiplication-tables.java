import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int y = 1; y <= n; ++y) {
            StringJoiner sj = new StringJoiner(" / ");
            for (int x = 1; x <= n + 1 - y; ++x) {
                sj.add(y + " * " + x + " = " + (y * x));
            }

            System.out.println(sj);
        }
    }
}