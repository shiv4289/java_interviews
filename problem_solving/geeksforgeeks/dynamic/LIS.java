package geeksforgeeks.dynamic;

import java.util.Arrays;

/**
 * Created by sourabh on 2/8/16.
 */
public class LIS {

    public static int LISLength(int nums[]) {
        int dp[] = new int[nums.length];
        int pre[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (nums[i] >= nums[j] && (dp[i] < dp[j] + 1)) {
                    dp[i] = 1 + dp[j];
                    pre[i] = j;
                }
            }
        }
        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(dp));
        return dp[nums.length - 1];
    }

    public static void main(String args[]) {
        System.out.println(LISLength(new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80}));
    }
}
