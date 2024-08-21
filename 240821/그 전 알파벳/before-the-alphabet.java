import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char input = sc.next().charAt(0);

        char before = (char)((input - 'a' + 26 - 1) % 26 + 'a');

        System.out.println(before);
    }
}