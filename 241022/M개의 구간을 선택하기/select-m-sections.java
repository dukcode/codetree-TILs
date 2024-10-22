import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  private static final int UNUSED = Integer.MIN_VALUE;
  private static final int MN = -987_654_321;

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

    cache = new int[n][m + 1];
    for (int i = 0; i < n; i++) {
      Arrays.fill(cache[i], UNUSED);
    }

    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < n; ++i) {
      ans = Math.max(ans, solve(i, m));
    }

    bw.write(String.valueOf(ans));

    br.close();
    bw.close();
  }

  private static int solve(int idx, int cnt) {
    if (idx == -1) {
      return cnt == 0 || cnt == 1 ? 0 : MN;
    }

    if ((idx + 2) / 2 < cnt) {
      return MN;
    }

    if (cache[idx][cnt] != UNUSED) {
      return cache[idx][cnt];
    }

    int ret = solve(idx - 1, cnt) + arr[idx];
    for (int i = -1; i < idx - 1; ++i) {
      ret = Math.max(ret, solve(i, cnt - 1) + arr[idx]);
    }

    return cache[idx][cnt] = ret;
  }


}