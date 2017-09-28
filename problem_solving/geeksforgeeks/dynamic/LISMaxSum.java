package geeksforgeeks.dynamic;

import java.util.Arrays;

/**
 * Created by sourabh on 2/8/16.
 */
public class LISMaxSum {

    public static int LISSum(int nums[]) {
        int dp[] = new int[nums.length];
        int pre[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (nums[i] >= nums[j] && (dp[i] < dp[j] + nums[i])) {
                    dp[i] = nums[i] + dp[j];
                    pre[i] = j;
                }
            }
        }
        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(dp));
        return dp[nums.length - 1];
    }

    public static void main(String args[]) {
        System.out.println(LISSum(new int[]{1, 101, 2, 3, 100, 4, 5}));
    }
}
