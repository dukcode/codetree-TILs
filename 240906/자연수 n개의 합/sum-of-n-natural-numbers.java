import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  private static final long MX = 1_000_000_000;

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static long s;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    s = Long.parseLong(br.readLine());
    bw.write(String.valueOf(solve()));

    br.close();
    bw.close();
  }

  private static long solve() {
    long l = 1;
    long r = MX;

    long ret = -1;
    while (l <= r) {
      long half = (l + r) / 2;
      long sum = sumTo(half);
      if (sum <= s) {
        l = half + 1;
        ret = Math.max(ret, half);
      } else {
        r = half - 1;
      }
    }

    return ret;
  }

  private static long sumTo(long b) {
    return b * (1 + b) / 2;
  }

}