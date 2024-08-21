import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        int idx = word.indexOf("e");

        String ans = word.substring(0, idx) + word.substring(idx + 1);

        System.out.println(ans);
    }
}