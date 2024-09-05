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

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[] arr = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; ++i) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int ans = 0;
    for (int startIdx = 0; startIdx < n; ++startIdx) {
      ans = Math.max(ans, getMaxSum(arr, startIdx, m));
    }

    bw.write(String.valueOf(ans));

    br.close();
    bw.close();
  }

  private static int getMaxSum(int[] arr, int idx, int cnt) {
    int[] nums = new int[arr.length];
    System.arraycopy(arr, 0, nums, 0, arr.length);

    int ret = 0;
    int numToMove = arr[idx];
    for (int i = 0; i < cnt; ++i) {
      ret += numToMove;
      int tmp = nums[numToMove - 1];
      nums[numToMove - 1] = numToMove;
      numToMove = tmp;
    }

    return ret;
  }


}