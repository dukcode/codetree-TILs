import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;

  private static TrieNode root;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    root = new TrieNode();

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; ++i) {
      String word = st.nextToken();
      root.insert(word);
    }

    String s = br.readLine();
    int[] ans = root.getPrefixCounts(s);

    for (Integer cnt : ans) {
      bw.write(String.valueOf(cnt));
      bw.write(' ');
    }

    br.close();
    bw.close();
  }

  private static class TrieNode {

    TrieNode[] children = new TrieNode[26];
    int cnt = 0;

    public void insert(String word) {
      TrieNode cur = this;
      for (char c : word.toCharArray()) {
        int idx = c - 'a';

        if (cur.children[idx] == null) {
          cur.children[idx] = new TrieNode();
        }

        cur = cur.children[idx];
        cur.cnt++;
      }
    }

    public int[] getPrefixCounts(String word) {
      int[] counts = new int[m];
      TrieNode cur = root;
      for (int i = 0; i < m; ++i) {
        char c = word.charAt(i);
        int idx = c - 'a';

        if (cur.children[idx] == null) {
          break;
        }
        cur = cur.children[idx];
        counts[i] = cur.cnt;
      }

      return counts;
    }
  }


}