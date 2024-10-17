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

  private static int n;
  private static int[] arr;

  private static int total;

  private static int[][] cache;

  {

  }

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    arr = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      total += arr[i];
    }

    cache = new int[n][total * 2 + 1];
    for (int y = 0; y < n; y++) {
      Arrays.fill(cache[y], -1);
    }

    bw.write(String.valueOf(solve()));

    br.close();
    bw.close();
  }

  private static int solve() {
    return solve(0, 0, 0);
  }

  private static int solve(int idx, int sumA, int sumB) {
    if (idx == n) {
      return sumA - sumB == 0 ? sumA : -1;
    }

    if (cache[idx][toIdx(sumB - sumA)] != -1) {
      return cache[idx][toIdx(sumB - sumA)];
    }

    int ret = solve(idx + 1, sumA, sumB);
    ret = Math.max(ret, solve(idx + 1, sumA + arr[idx], sumB));
    ret = Math.max(ret, solve(idx + 1, sumA, sumB + arr[idx]));

    return cache[idx][toIdx(sumB - sumA)] = ret;
  }

  private static int toIdx(int subBFromA) {
    return subBFromA + total;
  }

}