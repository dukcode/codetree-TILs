import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int divisor = 0;
        while (n > 1) {
            divisor++;
            n /= divisor;
        }

        System.out.println(divisor);
    }
}