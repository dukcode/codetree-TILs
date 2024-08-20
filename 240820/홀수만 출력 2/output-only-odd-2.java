import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();

        StringJoiner sj = new StringJoiner(" ");
        for (int i = b; i >= a; --i) {
            if (i % 2 == 0) {
                continue;
            }
            sj.add(String.valueOf(i));
        }

        System.out.println(sj.toString());
    }
}