import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int minVal;
        if (b < c) {
            minVal = b;
        } else {
            minVal = c;
        }

        if (a < minVal) {
            minVal = a;
        }

        System.out.println(minVal);
    }
}