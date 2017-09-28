package geeksforgeeks.matrix;

/**
 * Created by sourabh on 16/6/16.
 */
public class SearchInYoungsTablate {


    public static boolean isSafe(int i, int j, int Rows, int Cols) {
        if (i < 0 || j < 0) return false;
        if (i >= Rows || j >= Cols) return false;
        return true;
    }

    public static Boolean search(Integer[][] matrix, int R, int C, int x) {

        for (int i = 0, j = C - 1; isSafe(i, j, R, C); ) {
            if (matrix[i][j] == x) return true;
            if (matrix[i][j] > x) j--;
            i++;
        }
        return false;
    }
}
