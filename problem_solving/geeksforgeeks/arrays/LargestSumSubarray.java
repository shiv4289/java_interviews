package geeksforgeeks.arrays;

/**
 * Created by sourabh on 2/8/16.
 */
public class LargestSumSubarray {

    public static int kadanes(int[] nums) {
        if (nums.length == 0) return 0;
        int amax = 0;
        int cmax = 0;
        for (int i = 0; i < nums.length; i++) {
            cmax = Math.max(0, nums[i] + cmax);
            amax = Math.max(cmax, amax);
        }
        return amax;
    }

    public static void main(String args[]) {
        System.out.println(kadanes(new int[]{-2, -3, -1, -2, -3}));
    }
}
