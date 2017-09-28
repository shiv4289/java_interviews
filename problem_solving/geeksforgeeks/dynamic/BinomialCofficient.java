package geeksforgeeks.dynamic;

/**
 * Created by sourabh on 2/8/16.
 */
public class BinomialCofficient {

    public static int BC(int n, int k) {
        int[] dp = new int[k + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(k, i); j > 0; j--) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[0];
    }

    public static void main(String args[]) {

        System.out.println(BC(10, 2));
    }
}
