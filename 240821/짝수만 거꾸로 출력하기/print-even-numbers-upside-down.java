import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> evens = new Stack<>();
        for (int i = 0; i < n; ++i) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evens.push(num);
            }
        }

        while (!evens.isEmpty()) {
            System.out.print(evens.pop() + " ");
        }
    }
}