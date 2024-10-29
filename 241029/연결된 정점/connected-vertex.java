import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;

  private static int[] parent;
  private static int[] height;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    parent = IntStream.range(0, n).toArray();
    height = new int[n];
    Arrays.fill(height, 1);

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      String command = st.nextToken();
      int a = Integer.parseInt(st.nextToken()) - 1;

      switch (command) {
        case "x":
          int b = Integer.parseInt(st.nextToken()) - 1;
          union(a, b);
          break;
        case "y":
          bw.write(String.valueOf(count(a)));
          bw.newLine();
        default:
          break;
      }
    }

    br.close();
    bw.close();

  }

  private static int count(int x) {
    int cnt = 0;

    int root = findRoot(x);
    for (int i = 0; i < n; i++) {
      if (root == findRoot(i)) {
        cnt++;
      }
    }

    return cnt;
  }

  private static void union(int a, int b) {
    int rootA = findRoot(a);
    int rootB = findRoot(b);

    if (height[rootA] > height[rootB]) {
      parent[rootB] = rootA;
      return;
    } else if (height[rootA] < height[rootB]) {
      parent[rootA] = rootB;
      return;
    }

    parent[rootA] = rootB;
    height[rootB]++;
  }

  private static int findRoot(int x) {
    if (parent[x] == x) {
      return x;
    }

    int rootX = findRoot(parent[x]);
    parent[x] = rootX;
    return rootX;
  }

}