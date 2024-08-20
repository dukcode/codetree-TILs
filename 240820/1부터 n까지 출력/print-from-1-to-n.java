import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringJoiner sj = new StringJoiner(" ");
        for (int i = 1; i <= n; ++i) {
            sj.add(String.valueOf(i));
        }

        System.out.println(sj.toString());
    }
}