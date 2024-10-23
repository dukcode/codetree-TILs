import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Set<Integer> set = new HashSet<>();

    int n = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      int number = Integer.parseInt(st.nextToken());
      set.add(number);
    }

    int m = Integer.parseInt(br.readLine());
    StringJoiner sj = new StringJoiner(" ");
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      int number = Integer.parseInt(st.nextToken());
      sj.add(String.valueOf(set.contains(number) ? 1 : 0));
    }

    bw.write(sj.toString());

    br.close();
    bw.close();
  }


}