import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  // 서 남 북 동
  private static final int[] DX = {-1, 0, 0, 1};
  private static final int[] DY = {0, -1, 1, 0};

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int n;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    int y = 0;
    int x = 0;
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int dir = toDir(st.nextToken());
      int dist = Integer.parseInt(st.nextToken());

      x += DX[dir] * dist;
      y += DY[dir] * dist;
    }

    bw.write(String.valueOf(x));
    bw.write(' ');
    bw.write(String.valueOf(y));
    bw.newLine();

    br.close();
    bw.close();

  }

  private static int toDir(String dir) {
    if (dir.equals("W")) {
      return 0;
    }

    if (dir.equals("S")) {
      return 1;
    }

    if (dir.equals("N")) {
      return 2;
    }

    return 3;
  }

}