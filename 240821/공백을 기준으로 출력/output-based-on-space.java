import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        sb.append(sc.nextLine().replace(" ", "").replace("\n", ""));
        sb.append(sc.nextLine().replace(" ", "").replace("\n", ""));

        System.out.println(sb);
    }
}