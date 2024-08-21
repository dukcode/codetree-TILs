import java.util.Scanner;

public class Main {

    private static int getNum(String word) {
        int ret = 0;
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            if (Character.isDigit(c)) {
                ret *= 10;
                ret += c - '0';
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();

        System.out.println(getNum(word1) + getNum(word2));
    }
}