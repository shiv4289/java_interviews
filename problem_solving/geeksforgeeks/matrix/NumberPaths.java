package geeksforgeeks.matrix;

/**
 * Created by sourabh on 16/6/16.
 */
public class NumberPaths {
    public static Integer numPaths(Integer m, Integer n) {
        if (m == 1 || n == 1) return 1;
        return numPaths(m - 1, n) + numPaths(m, n - 1);
    }
}
