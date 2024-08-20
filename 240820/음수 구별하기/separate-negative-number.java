import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num);

        if (num < 0) {
            System.out.println("minus");
        }
    }
}