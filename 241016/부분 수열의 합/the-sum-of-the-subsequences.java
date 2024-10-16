import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  private static final int FALSE = 0;
  private static final int TRUE = 1;

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;
  private static int[] arr;

  private static int[][] cache;

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

    cache = new int[m + 1][n];

    bw.write(solve());

    br.close();
    bw.close();
  }

  private static String solve() {
    return solve(m, 0) == TRUE ? "Yes" : "No";
  }

  private static int solve(int sum, int idx) {
    if (sum == 0) {
      return TRUE;
    }

    if (sum < 0 || idx >= n) {
      return FALSE;
    }

    int ret = solve(sum - arr[idx], idx + 1) | solve(sum, idx + 1);

    return cache[sum][idx] = ret;
  }

}