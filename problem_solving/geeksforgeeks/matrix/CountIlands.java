package geeksforgeeks.matrix;

/**
 * Created by sourabh on 16/6/16.
 */
public class CountIlands {

    Integer[] Dx4 = new Integer[]{1, 0, -1, 0};
    Integer[] Dy4 = new Integer[]{0, -1, 0, 1};

    Integer[] Dx8 = new Integer[]{1, 1, 0, -1, -1, -1, 0, 1};
    Integer[] Dy8 = new Integer[]{0, -1, -1, -1, 0, 1, -1, 1};

    Boolean isSafe(Integer[][] M, Integer i, Integer j, Integer Rows, Integer Cols) {
        if (i < 0 || j < 0 || i >= Rows || j >= Cols || M[i][j] == -1) return false;
        return M[i][j] == 1;
    }

    public void DFS(Integer[][] M, Integer x, Integer y, Integer Rows, Integer Cols) {
        M[x][y] = -1;
        for (int i = 0; i < Dx8.length; i++) {
            Integer nX = x + Dx8[i];
            Integer nY = y + Dy8[i];
            if (isSafe(M, nX, nY, Rows, Cols)) {
                DFS(M, nX, nY, Rows, Cols);
            }
        }
    }

    public int count(Integer[][] M, Integer rows, Integer cols) {
        Integer c = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (M[i][j] == 1) {
                    c++;
                    DFS(M, i, j, rows, cols);
                }
            }
        }
        return c;
    }
}
