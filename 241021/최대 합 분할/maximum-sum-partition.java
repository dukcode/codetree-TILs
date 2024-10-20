import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  private static final int MN = -987_654_321;

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int[] arr;

  private static int total;

  private static int[][] cache; // cache[idx][sumA - sumB]


  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    arr = new int[n + 1];
    st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      total += arr[i];
    }

    cache = new int[n + 1][2 * total + 1];
    for (int y = 0; y <= n; y++) {
      Arrays.fill(cache[y], MN);
    }
    cache[0][total] = 0;

    for (int idx = 1; idx <= n; ++idx) {
      int num = arr[idx];
      for (int diff = -total; diff <= total; diff++) {
        update(idx, diff, diff - num, num);
        update(idx, diff, diff + num, 0);
        update(idx, diff, diff, 0);
      }
    }

    bw.write(String.valueOf(cache[n][total]));

    br.close();
    bw.close();
  }

  private static void update(int idx, int diff, int diffBefore, int num) {
    if (diffBefore < -total || diffBefore > total) {
      return;
    }

    if (cache[idx - 1][diffBefore + total] == MN) {
      return;
    }

    cache[idx][diff + total] = Math.max(
        cache[idx][diff + total],
        cache[idx - 1][diffBefore + total] + num);
  }


}