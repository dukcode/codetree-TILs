import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    TreeMap<String, Integer> tree = new TreeMap<>();
    for (int i = 0; i < n; i++) {
      String word = br.readLine();
      tree.put(word, tree.getOrDefault(word, 0) + 1);
    }

    for (String word : tree.keySet()) {
      bw.write(word);
      bw.write(" ");
      bw.write(String.format("%.4f", 100.0 * tree.get(word) / n));
      bw.newLine();
    }

    br.close();
    bw.close();
  }


}