import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  private static final long MX = 3_000_000_000L;

  private static BufferedReader br;
  private static BufferedWriter bw;

  private static long s;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    s = Long.parseLong(br.readLine());
    bw.write(String.valueOf(solve(s)));

    br.close();
    bw.close();

  }

  private static long solve(long targetSum) {
    long st = 1;
    long en = MX;

    while (st <= en) {
      long half = (st + en) / 2;
      if (sumTo(half) <= targetSum) {
        st = half + 1;
      } else {
        en = half - 1;
      }
    }

    return st - 1;
  }

  private static long sumTo(long n) {
    return (1 + n) * n / 2;
  }

}