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

  private static long m;
  private static long a;
  private static long b;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    m = Long.parseLong(br.readLine());

    st = new StringTokenizer(br.readLine());
    a = Long.parseLong(st.nextToken());
    b = Long.parseLong(st.nextToken());

    int cnt = 0;
    long s = 1;
    long e = m;
    boolean firstEnd = false;

    int first = 0;
    while (s <= e) {
      cnt++;
      long half = (s + e) / 2;

      if (a <= half && half <= b) {
        if (!firstEnd) {
          first = cnt;
          firstEnd = true;
        }

        if (half - a < b - half) {
          s = half + 1;
        } else {
          e = half - 1;
        }
      }

      if (half < a) {
        s = half + 1;
      } else {
        e = half - 1;
      }

    }

    bw.write(String.valueOf(first));
    bw.write(' ');
    bw.write(String.valueOf(cnt));

    br.close();
    bw.close();
  }


}