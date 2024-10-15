import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  private static final int MX = 987_654_321;

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;
  private static int[] coins;

  private static int[] cache;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    coins = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      coins[i] = Integer.parseInt(st.nextToken());
    }

    cache = new int[m + 1];
    Arrays.fill(cache, MX);

    cache[0] = 0;
    for (int i = 1; i <= m; ++i) {
      for (int coin : coins) {
        if (i - coin < 0) {
          continue;
        }

        cache[i] = Math.min(cache[i], cache[i - coin] + 1);
      }
    }

    bw.write(String.valueOf(cache[m] == MX ? -1 : cache[m]));

    br.close();
    bw.close();

  }

  private static int solve() {
    int ret = solve(m);
    return ret == MX ? -1 : ret;
  }

  private static int solve(int target) {
    if (target == 0) {
      return cache[target] = 0;
    }

    if (cache[target] != MX) {
      return cache[target];
    }

    int ret = MX;
    for (int coin : coins) {
      if (target - coin < 0) {
        continue;
      }

      ret = Math.min(ret, solve(target - coin) + 1);
    }

    return cache[target] = ret;
  }

}