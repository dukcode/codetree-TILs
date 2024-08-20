import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            n /= 2;
        }
        
        if (n % 2 == 1) {
            n = (n + 1) / 2;
        }

        System.out.println(n);
    }
}