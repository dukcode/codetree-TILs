import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        while (n < 1000) {
            cnt ++;
            if (n % 2 == 0) {
                n = n * 3 + 1;
                continue;
            }

            n = n * 2 + 2;
        }

        System.out.println(cnt);
    }
}