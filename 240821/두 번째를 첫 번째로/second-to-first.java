import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        System.out.println(word.replace(word.charAt(1), word.charAt(0)));
    }
}