package geeksforgeeks.dynamic;

/**
 * Created by sourabh on 2/8/16.
 */
public class MatrixChainMultiplication {

    public static int EditDistanceLength(int p[]) {
        int n = p.length;
        int dp[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {

            }
        }
        return dp[n + 1];
    }

    public static void main(String args[]) {

        System.out.println(EditDistanceLength(new int[]{2}));
    }
}
