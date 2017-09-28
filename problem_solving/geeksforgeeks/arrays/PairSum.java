package geeksforgeeks.arrays;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by sourabh on 14/6/16.
 */
public class PairSum {

    public static void displayPairs(LinkedList<Integer> list, int sum) {
        Collections.sort(list);
        int i = 0, j = list.size() - 1;
        while (i < j) {
            int temp = list.get(i) + list.get(j);
            if (temp == sum) {
                System.out.println(list.get(i) + "," + list.get(j));
                i++;
                j--;
            } else if (temp < sum) {
                i++;
            } else {
                j--;
            }
        }
    }
}
