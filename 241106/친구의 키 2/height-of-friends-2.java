import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;

  private static boolean[][] adj;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    adj = new boolean[n][n];
    for (int i = 0; i < m; ++i) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken()) - 1;
      int b = Integer.parseInt(st.nextToken()) - 1;

      adj[a][b] = true;
    }

    bw.write(solve() ? "Consistent" : "Inconsistent");

    br.close();
    bw.close();
  }

  private static boolean solve() {
    boolean[] vis = new boolean[n];
    return dfsAll(vis);
  }

  private static boolean dfsAll(boolean[] vis) {
    List<Integer> order = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
      if (vis[i]) {
        continue;
      }

      dfs(i, vis, order);
    }

    for (int i = 0; i < n; ++i) {
      for (int j = i + 1; j < n; ++j) {
        if (adj[order.get(i)][order.get(j)]) {
          return false;
        }
      }
    }

    return true;
  }

  private static void dfs(int here, boolean[] vis, List<Integer> order) {
    vis[here] = true;

    for (int there = 0; there < n; ++there) {
      if (vis[there] || !adj[here][there]) {
        continue;
      }

      dfs(there, vis, order);
    }

    order.add(here);
  }

}