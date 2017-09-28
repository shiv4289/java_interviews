package geeksforgeeks.arrays;

import java.util.LinkedList;

/**
 * Created by sourabh on 14/6/16.
 */
public class MaxSum {
    public static int sum(LinkedList<Integer> list) {
        int inc = list.get(0);
        int exc = 0;
        for (int i = 1; i < list.size(); i++) {
            int temp = inc;
            inc = list.get(i) + exc;
            exc = Math.max(exc, temp);
        }
        return Math.max(inc, exc);
    }
}
