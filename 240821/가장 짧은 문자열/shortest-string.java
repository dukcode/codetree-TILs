import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();

        int maxLength = Math.max(word1.length(), word2.length());
        maxLength = Math.max(maxLength, word3.length());

        int minLength = Math.min(word1.length(), word2.length());
        minLength = Math.min(minLength, word3.length());

        System.out.println(maxLength - minLength);
    }
}