import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  private static BufferedReader br;
  private static BufferedWriter bw;
  private static StringTokenizer st;

  private static int h;
  private static int w;
  private static int[][] board;
  private static int[][] cache;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    h = Integer.parseInt(st.nextToken());
    w = Integer.parseInt(st.nextToken());
    board = new int[h][w];
    for (int y = 0; y < h; ++y) {
      st = new StringTokenizer(br.readLine());
      for (int x = 0; x < w; ++x) {
        board[y][x] = Integer.parseInt(st.nextToken());
      }
    }
    cache = new int[h][w];
    for (int y = 0; y < h; ++y) {
      Arrays.fill(cache[y], -1);
    }

    bw.write(String.valueOf(solve(h - 1, w - 1)));

    br.close();
    bw.close();
  }

  private static int solve(int r, int c) {
    if (r == 0 && c == 0) {
      return 1;
    }

    if (cache[r][c] != -1) {
      return cache[r][c];
    }

    int ret = 1;
    for (int y = 0; y < r; ++y) {
      for (int x = 0; x < c; ++x) {
        if (board[y][x] >= board[r][c]) {
          continue;
        }

        ret = Math.max(ret, solve(y, x) + 1);
      }
    }

    return cache[r][c] = ret;
  }


}