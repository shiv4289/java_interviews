public class Solution {
    static public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        out[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            out[i] = out[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 2; i > 0; i++) {
            out[i] = out[i + 1] * nums[i + 1];
        }
        return out;
    }

    public static void main(String args[]) {
        System.out.println(productExceptSelf(new int[]{1, 2, 1, 3, 2, 5}).toString());
    }
}