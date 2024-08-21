import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int n = word.length();
        for (int i = n - 1; i >= 0; --i) {
            if (i % 2 == 1) {
                System.out.print(word.charAt(i));
            }
        }
    }
}