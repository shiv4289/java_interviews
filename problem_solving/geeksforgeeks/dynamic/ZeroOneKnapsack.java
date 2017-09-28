package geeksforgeeks.dynamic;

import java.util.Arrays;

/**
 * Created by sourabh on 2/8/16.
 */
public class ZeroOneKnapsack {

    public static int Knapsack(int[] values, int[] weights, int weight) {
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        int dp[][] = new int[2][sum + 1];
        int i, j;
        for (j = 0; j < values.length; j++) {
            for (i = 0; i <= sum; i++) {
                if (i - weights[j] >= 0) {
                    dp[(j & 1)][i] =
                            Math.max(
                                    dp[j & 1][i],
                                    dp[((j & 1) == 0 ? 1 : 0)][(i - weights[j])] + values[j]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[((j & 1) == 0 ? 1 : 0)][weight];
    }

    public static void main(String args[]) {
        System.out.println(Knapsack(new int[]{60, 100, 120}, new int[]{10, 20, 30}, 50));

    }
}
