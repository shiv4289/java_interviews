package geeksforgeeks.dynamic;

/**
 * Created by sourabh on 2/8/16.
 */
public class EggProblem {

    public static int EggProblem(int n, int k) {
        if (n == 1) return k;
        if (k <= 1) return k;
        return EggProblem(n - 1, k - 1) + EggProblem(n, n - k);
    }

    public static void main(String args[]) {
        System.out.println(EggProblem(5, 3));

    }
}
