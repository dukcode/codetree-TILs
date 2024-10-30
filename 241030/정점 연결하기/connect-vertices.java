import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;

  private static int[] parent;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    parent = IntStream.range(0, n).toArray();

    for (int i = 0; i < n - 2; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken()) - 1;
      int b = Integer.parseInt(st.nextToken()) - 1;

      union(a, b);
    }

    Set<Integer> unlinked = new HashSet<>();
    for (int i = 0; i < n; i++) {
      unlinked.add(findRoot(i));
    }

    List<Integer> ans = unlinked.stream().sorted().collect(Collectors.toList());
    Collections.sort(ans);

    bw.write(String.valueOf(ans.get(0) + 1));
    bw.write(' ');
    bw.write(String.valueOf(ans.get(1) + 1));

    br.close();
    bw.close();
  }

  private static int findRoot(int x) {
    if (parent[x] == x) {
      return x;
    }

    return parent[x] = findRoot(parent[x]);
  }

  private static void union(int a, int b) {
    int rootA = findRoot(a);
    int rootB = findRoot(b);

    if (rootA == rootB) {
      return;
    }

    if (rootA > rootB) {
      union(rootB, rootA);
      return;
    }

    parent[rootB] = rootA;
  }


}