import java.util.Scanner;

public class Main {

    private static boolean isLeapYear(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    return true;
                }
                return false;
            }

            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (!isLeapYear(y) && m == 2 && d == 29) {
            System.out.println(-1);
        } else {
            if (3 <= m && m < 6) {
                System.out.println("Spring");
            } else if (6 <= m && m < 9) {
                System.out.println("Summer");
            } else if (9 <= m && m < 11) {
                System.out.println("Fall");
            } else {
                System.out.println("Winter");
            }
        }
    }
}