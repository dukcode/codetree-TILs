import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> evens = new ArrayDeque<>();
        for (int i = 0; i < n; ++i) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evens.offer(num);
            }
        }

        while (!evens.isEmpty()) {
            System.out.println(evens.poll());
        }
    }
}