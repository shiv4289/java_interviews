package geeksforgeeks.matrix;

/**
 * Created by sourabh on 16/6/16.
 */
public class SubMatrixWith1 {

    public static int sizeSubMatrixWith1(Integer[][] matrix, int R, int C) {
        Integer[][] dp = new Integer[R][C];

        for (int i = 0; i < R; i++) {
            dp[i][0] = matrix[i][0];
        }
        for (int j = 1; j < C; j++)
            dp[0][j] = matrix[0][j];


        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = 1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1]));
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                max = Math.max(max, dp[i][j]);
            }
        }

        return max;
    }

}
