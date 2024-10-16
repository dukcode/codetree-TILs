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
  private static int[] arr;

  private static int[] cache;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    arr = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    cache = new int[m + 1];
    Arrays.fill(cache, MX);

    cache[0] = 0;
    bw.write(String.valueOf(solve()));

    br.close();
    bw.close();
  }

  private static int solve() {
    int ret = solve(m, 0);
    return ret == MX ? -1 : ret;
  }

  private static int solve(int remaining, int idx) {
    if (remaining == 0) {
      return 0;
    }

    if (remaining < 0 || idx >= n) {
      return MX;
    }

    if (cache[remaining] != MX) {
      return cache[remaining];
    }

    int notUse = solve(remaining, idx + 1);
    int use = solve(remaining - arr[idx], idx + 1) + 1;

    return cache[remaining] = Math.min(notUse, use);
  }


}