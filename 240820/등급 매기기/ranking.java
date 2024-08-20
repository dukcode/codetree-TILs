import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String grade = "F";
        if (n >= 90) {
            grade = "A";
        } else if (n >= 80) {
            grade = "B";
        } else if (n >= 70) {
            grade = "C";
        } else if (n >= 60) {
            grade = "D";
        }

        System.out.print(grade);

    }
}