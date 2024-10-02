import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  private static BufferedReader br;
  private static BufferedWriter bw;

  private static char[] expression;
  private static int cntNums;
  private static int[] nums;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    expression = br.readLine().toCharArray();
    cntNums = cntNums();
    nums = new int[cntNums];
    bw.write(String.valueOf(solve(0)));

    br.close();
    bw.close();

  }

  private static int cntNums() {
    int ret = -1;
    for (char token : expression) {
      if (!Character.isAlphabetic(token)) {
        continue;
      }

      ret = Math.max(ret, token - 'a' + 1);
    }

    return ret;
  }

  private static int solve(int idx) {
    if (idx == cntNums) {
      return calculate();
    }

    int ret = 0;
    for (int i = 1; i <= 4; ++i) {
      nums[idx] = i;
      ret = Math.max(ret, solve(idx + 1));
    }

    return ret;
  }

  private static int calculate() {
    int res = 0;
    char op = '+';
    for (char token : expression) {
      if (Character.isAlphabetic(token)) {
        switch (op) {
          case '+':
            res += nums[token - 'a'];
            break;
          case '*':
            res *= nums[token - 'a'];
            break;
          case '-':
            res -= nums[token - 'a'];
            break;
        }
        continue;
      }

      op = token;
    }

    return res;
  }

}