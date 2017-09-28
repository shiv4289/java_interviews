package geeksforgeeks.matrix;

import java.util.LinkedList;

/**
 * Created by sourabh on 16/6/16.
 */
public class PrinthPaths {

    static Boolean isSafe(Integer i, Integer j, Integer Rows, Integer Cols) {
        if (i < 0 || j < 0 || i >= Rows || j >= Cols) return false;
        return true;
    }

    public static void PrintPaths(Integer[][] M, Integer Rows, Integer Cols) {
        PrintPaths(M, new LinkedList<Integer>(), 0, 0, Rows, Cols);
    }

    public static void PrintPaths(Integer[][] M, LinkedList<Integer> path, int i, int j, Integer Rows, Integer Cols) {
        path.add(M[i][j]);
        if (i == Rows - 1 && j == Cols - 1) {
            System.out.println(path);
            return;
        }
        if (isSafe(i, j + 1, Rows, Cols)) {
            PrintPaths(M, path, i, j + 1, Rows, Cols);
            path.pollLast();
        }

        if (isSafe(i + 1, j, Rows, Cols)) {
            PrintPaths(M, path, i + 1, j, Rows, Cols);
            path.pollLast();
        }
    }

}
