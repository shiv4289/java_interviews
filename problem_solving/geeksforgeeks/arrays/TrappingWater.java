package geeksforgeeks.arrays;

import java.util.Stack;

/**
 * Created by sourabh on 14/6/16.
 */
public class TrappingWater {

    public static Integer maxWater(int[] nums) {
        int size = nums.length;
        int maxx = 0;
        Stack stk = new Stack();
        stk.push(nums[0]);
        for (int i = 1; i < size; i++) {
            if (stk.size() > 0 && (int) stk.peek() > nums[i]) {
                maxx = Math.max(maxx, nums[i] - (int) stk.peek());
                stk.pop();
            } else {
                stk.push(nums[i]);
            }
        }
        return maxx;
    }

    public static void main(String args[]) {
        int[] a = {3, 0, 0, 2, 0, 4};
        System.out.println(maxWater(a));
    }
}
