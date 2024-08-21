import java.util.Scanner;

public class Main {
    private static String shift(String s) {
        int len = s.length();

        return s.substring(len - 1) + s.substring(0, len - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int ret = -1;
        for (int i = 0; i < b.length() - 1; ++i) {
            a = shift(a);
            if (a.equals(b)) {
                ret = i + 1;
                break;
            }
        }

        System.out.println(ret);
    }
}