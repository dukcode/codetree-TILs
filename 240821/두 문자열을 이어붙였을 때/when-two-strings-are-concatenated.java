import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String w1 = sc.next();
        String w2 = sc.next();

        System.out.println(w1.concat(w2).equals(w2.concat(w1)) ? "true": "false");
    }
}