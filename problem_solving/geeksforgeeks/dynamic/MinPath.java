package geeksforgeeks.dynamic;

/**
 * Created by sourabh on 2/8/16.
 */
public class MinPath {
    public static int PathWeight(int cost[][], int m, int n) {
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = Math.min(dp[i][j], Math.min(dp[i][j - 1], dp[i - 1][j])) + cost[i - 1][j - 1];
            }
        }
        return dp[n][m];
    }

    public static void main(String args[]) {
        System.out.println(((3 & 1) == 0 ? 1 : 0));
        System.out.println(PathWeight(new int[][]{{1, 2, 3}, {4, 8, 2}, {1, 5, 3}}, 2, 2));
    }
}
