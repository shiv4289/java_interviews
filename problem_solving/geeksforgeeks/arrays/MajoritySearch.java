package geeksforgeeks.arrays;

import java.util.ArrayList;

/**
 * Created by sourabh on 14/6/16.
 */
public class MajoritySearch {

    public static int lower_bound(ArrayList<Integer> list, int n) {
        int l = 0, r = list.size(), m;
        while (l < r) {
            m = (r - l) / 2 + l;
            if (list.get(m) < n) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    public static int upper_bound(ArrayList<Integer> list, int n) {
        int l = 0, r = list.size(), m;
        while (l < r) {
            m = (r - l) / 2 + l;
            if (list.get(m) <= n) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    public static int count_occurence(ArrayList<Integer> list, int n) {
        System.out.println(lower_bound(list, n));
        System.out.println(upper_bound(list, n));
        return upper_bound(list, n) - lower_bound(list, n);
    }
}
