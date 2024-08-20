import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String g = sc.next();

        if (g.equals("S")) {
            System.out.println("Superior");
        } else if (g.equals("A")) {
            System.out.println("Excellent");
        } else if (g.equals("B")) {
            System.out.println("Good");
        } else if (g.equals("C")) {
            System.out.println("Usually");
        } else if (g.equals("D")) {
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }
    }
}