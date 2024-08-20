import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        String ans = "Low";
        if (n >= 1.0) {
            ans = "High";
        } else if (n >= 0.5) {
            ans = "Middle";
        }

        System.out.println(ans);
    }
}