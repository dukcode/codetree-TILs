import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  private static final int MX_T = 1_000_000_000;

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;
  private static int m;
  private static int c;

  private static int[] t;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());

    t = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      t[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(t);

    bw.write(String.valueOf((solve())));

    br.close();
    bw.close();
  }

  private static int solve() {
    int minT = 0;
    int maxT = t[t.length - 1] - t[0];

    while (minT <= maxT) {
      int halfT = (maxT + minT) / 2;
      if (getMaxM(halfT) > m) {
        minT = halfT + 1;
      } else {
        maxT = halfT - 1;
      }
    }

    return minT;
  }

  private static int getMaxM(int maxT) {
    int startIdx = 0;
    int ret = 1;
    for (int i = 0; i < n; ++i) {
      if (t[i] - t[startIdx] > maxT || i - startIdx + 1 > c) {
        ret++;
        startIdx = i;
      }
    }

    return ret;
  }

}