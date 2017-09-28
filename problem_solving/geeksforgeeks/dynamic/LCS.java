package geeksforgeeks.dynamic;

/**
 * Created by sourabh on 2/8/16.
 */
public class LCS {

    public static int LCSLength(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String args[]) {
        System.out.println(LCSLength("abcdef", "adefg"));
    }
}
