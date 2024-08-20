import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        String ans = "no";
        if (n >= 3000) {
            ans = "book";
        } else if (n >= 1000) {
            ans = "mask";
        }

        System.out.println(ans);
    }
}