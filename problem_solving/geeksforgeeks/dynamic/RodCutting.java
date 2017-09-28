package geeksforgeeks.dynamic;

/**
 * Created by sourabh on 2/8/16.
 */
public class RodCutting {

    public static int Cutting(int[] prices) {
        int[] values = new int[prices.length + 1];
        for (int i = 0; i <= prices.length; i++) {
            for (int j = 0; j < i; j++) {
                values[i] = Math.max(values[i], values[i - j - 1] + prices[j]);
            }
        }
        return values[prices.length];
    }

    public static void main(String args[]) {
        System.out.println(Cutting(new int[]{1, 5, 8, 9, 10, 17, 17, 20}));
    }
}
