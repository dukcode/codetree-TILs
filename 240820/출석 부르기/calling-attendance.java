import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String ans = "Vacancy";
        if (n == 1) {
            ans = "John";
        } else if (n == 2) {
            ans = "Tom";
        } else if (n == 3) {
            ans = "Paul";
        }

        System.out.println(ans);
    }
}