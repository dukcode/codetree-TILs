public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        double fromFt = 30.48;
        int fromMi = 160934;

        double ft = 9.2;
        double mi = 1.3;
        System.out.printf("%.1fft = %.1fcm\n", ft, ft * fromFt);
        System.out.printf("%.1fmi = %.1fcm\n", mi, mi * fromMi);
    }
}