import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        StringJoiner sj = new StringJoiner(" ");
        for (int i = a; i <= b; ++i) {
            if (i % 2 == 0) {
                continue;
            }

            sj.add(String.valueOf(i));
        }

        System.out.println(sj);
    }
}