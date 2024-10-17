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

  private static Quest[] quests;
  private static int maxTime;

  private static int[] cache;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    quests = new Quest[n];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int e = Integer.parseInt(st.nextToken());
      int t = Integer.parseInt(st.nextToken());
      quests[i] = new Quest(e, t);

      maxTime += t;
    }

    cache = new int[maxTime + 1];
    Arrays.fill(cache, MX);
    cache[0] = 0;

    for (Quest q : quests) {
      for (int t = maxTime; t > 0; t--) {
        if (t - q.t < 0 || cache[t - q.t] == MX) {
          continue;
        }
        cache[t] = Math.min(cache[t], cache[t - q.t] + q.e);
      }

    }

    int ans = MX;
    for (int t = maxTime; t > 0; t--) {
      if (cache[t] < m || cache[t] == MX) {
        continue;
      }

      ans = t;
    }

    bw.write(String.valueOf(ans == MX ? -1 : ans));

    br.close();
    bw.close();
  }

  private static class Quest {

    int e;
    int t;

    public Quest(int e, int t) {
      this.e = e;
      this.t = t;
    }
  }


}