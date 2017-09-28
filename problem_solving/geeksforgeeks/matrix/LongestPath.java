package geeksforgeeks.matrix;

import java.util.Arrays;

/**
 * Created by sourabh on 16/6/16.
 */
public class LongestPath {

    Integer[] Dx4 = new Integer[]{1, 0, -1, 0};
    Integer[] Dy4 = new Integer[]{0, -1, 0, 1};

    Integer[] Dx8 = new Integer[]{1, 1, 0, -1, -1, -1, 0, 1};
    Integer[] Dy8 = new Integer[]{0, -1, -1, -1, 0, 1, -1, 1};

    Boolean isSafe(Integer i, Integer j, Integer Rows, Integer Cols) {
        if (i < 0 || j < 0 || i >= Rows || j >= Cols) return false;
        return true;
    }

    public Integer DFS(Integer[][] dp, Integer[][] M, Integer x, Integer y, Integer Rows, Integer Cols) {
        if (dp[x][y] != Integer.MIN_VALUE)
            return dp[x][y];
        for (int i = 0; i < Dx4.length; i++) {
            Integer nX = x + Dx4[i];
            Integer nY = y + Dy4[i];
            if (isSafe(nX, nY, Rows, Cols) && M[x][y] + 1 == M[nX][nY]) {
                dp[x][y] = 1 + DFS(dp, M, nX, nY, Rows, Cols);
                return dp[x][y];
            }
        }
        return dp[x][y] = 1;
    }

    public void count(Integer[][] M, Integer rows, Integer cols) {
        Integer dp[][] = new Integer[rows][cols];
        set(dp, Integer.MIN_VALUE);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                DFS(dp, M, i, j, rows, cols);
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(dp[i][j]);
            }
        }
    }

    public void set(Integer[][] M, Integer value) {
        for (int i = 0; i < M.length; i++) {
            Arrays.fill(M[i], value);
        }
    }
}
