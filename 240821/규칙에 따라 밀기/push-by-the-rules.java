import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String commands = sc.next();

        int n = word.length();
        for (char command : commands.toCharArray()) {
            if (command == 'L') {
                word = word.substring(1) + word.substring(0, 1);
            } else { // R
                word = word.substring(n - 1) + word.substring(0, n - 1);
            }
        }

        System.out.println(word);
    }
}