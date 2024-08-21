import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String pattern = sc.next();

        int cnt = 0;

        Loop:
        for (int i = 0; i <= word.length() - pattern.length(); ++i) {
            for (int idx = 0; idx < pattern.length(); ++idx) {
                if (word.charAt(i + idx) != pattern.charAt(idx)) {
                    continue Loop;
                }
            }

            cnt++;
        }

        System.out.println(cnt);
    }
}