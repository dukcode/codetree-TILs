import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int y = 2; y <= 8; y += 2) {
            StringJoiner sj = new StringJoiner(" / ");
            for (int x = b; x >= a; --x) {
                sj.add(x + " * " + y + " = " + (x * y));
            }

            System.out.println(sj);
        }
        
    }
}