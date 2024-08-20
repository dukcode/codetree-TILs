import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringJoiner sj = new StringJoiner(" ");
        for (int i = n; i >= 1; --i) {
            sj.add(String.valueOf(i));
        }

        for (int i = 0; i < n; ++i) {
            System.out.println(sj);
        }
    }
}