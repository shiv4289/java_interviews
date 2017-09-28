package geeksforgeeks.matrix;

import geeksforgeeks.arrays.Utils;

/**
 * Created by sourabh on 16/6/16.
 */
public class MinCostPath {

    public static int safeMin(Integer[][] M, Integer Rows, Integer Cols, Integer i, Integer j) {
        Integer a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, c = Integer.MAX_VALUE;
        if (i < Rows - 1) a = M[i + 1][j];
        if (j < Cols - 1) b = M[i][j + 1];
        if (i < Rows - 1 && j < Cols - 1) c = M[i + 1][j + 1];
        return Math.min(Math.min(a, b), c);
    }

    public static int minPath(Integer[][] M, Integer Rows, Integer Cols) {
        int i, j;

        Integer DP[][] = new Integer[Rows][Cols];

        DP[0][0] = M[0][0];

        for (i = 1; i < Rows; i++)
            DP[i][0] = DP[i - 1][0] + M[i][0];

        for (j = 1; j < Cols; j++)
            DP[0][j] = DP[0][j - 1] + M[0][j];

        for (i = 1; i < Rows; i++)
            for (j = 1; j < Cols; j++)
                DP[i][j] = Utils.min(DP[i - 1][j - 1], DP[i - 1][j], DP[i][j - 1]) + M[i][j];
        return DP[Rows - 1][Cols - 1];
    }

    public static int minPathRec(Integer[][] M, int i, int j) {

        if (i < 0 || j < 0) return Integer.MAX_VALUE;
        else if (i == 0 && j == 0) return M[i][j];
        else return M[i][j] + Math.min(
                    Math.min(
                            minPathRec(M, i - 1, j - 1),
                            minPathRec(M, i - 1, j)
                    ), minPathRec(M, i, j - i)
            );
    }

}
