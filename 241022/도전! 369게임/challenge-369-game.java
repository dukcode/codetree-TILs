import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  private static final int MOD = 100_000_007;

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int[] cache;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    cache = new int[n + 1];
    for (int num = 1; num <= n; num++) {
      cache[num] = (cache[num - 1] + isClap(num)) % MOD;
    }

    bw.write(String.valueOf(cache[n]));

    br.close();
    bw.close();
  }


  private static int isClap(int num) {
    if (num % 3 == 0) {
      return 1;
    }

    for (char ch : String.valueOf(num).toCharArray()) {
      if (ch == '3' || ch == '6' || ch == '9') {
        return 1;
      }
    }

    return 0;
  }
}