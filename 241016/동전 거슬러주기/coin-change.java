import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    public static final int MAX_M = 10000;
    public static final int MAX_ANS = 10001;
    public static final int UNUSED = -1;

    public static int n, m;

    public static int[] coin = new int[MAX_N + 1];
    public static int[] memo = new int[MAX_M + 1];

    public static void initializeMemo() {
        for(int i = 0; i <= m; i++)
            memo[i] = UNUSED;
    }

    // sum에서부터 시작하여
    // 최종적으로 합 m을 만드는 데
    // 필요한 최소 동전의 수를
    // 반환하는 재귀입니다.
    public static int findMinCnt(int sum) {
        // 미리 계산된 적이 있는 경우 해당 값을 사용해줍니다.
        if(memo[sum] != UNUSED)
            return memo[sum];

        // 합이 m이 되면 동전이 추가적으로 필요 없으므로
        // 필요한 동전의 수 0을 반환 합니다.
        if(sum == m) {
            return memo[sum] = 0;
        }

        // 최소를 구하는 문제이므로
        // 초기값을 답이 될 수 있는 최대보다 조금 더 큰
        // MAX_ANS로 설정합니다.
        int minCnt = MAX_ANS;

        // 동전들을 하나씩 사용해봅니다.
        for(int i = 1; i <= n; i++) {
            if(sum + coin[i] <= m)
                minCnt = Math.min(minCnt, findMinCnt(sum + coin[i]) + 1);
        }

        return memo[sum] = minCnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 1; i <= n; i++)
            coin[i] = sc.nextInt();

        initializeMemo();

        // 합 0에서부터 시작하여
        // 합 m을 만들기 위해 필요한
        // 최소 동전의 수를 계산합니다.
        int minCnt = findMinCnt(0);

        // 거슬러주는것이 불가능 할 시, -1을 출력합니다.
        if(minCnt == MAX_ANS)
            minCnt = -1;

        System.out.println(minCnt);
    }
}