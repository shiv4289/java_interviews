package geeksforgeeks.arrays;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by sourabh on 14/6/16.
 */
public class Reorder {

    class CustomComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }

    public static void makePartsUtil(int n, LinkedList<Integer> list) {
        if (n <= 0) {
            System.out.println(list);
            return;
        }
        for (int i = 1; i <= n; i++) {
            list.add(i);
            makePartsUtil(n - i, list);
            list.remove();
        }
    }

    public static void main(String args[]) {
        int a[] = {10, 11, 12};
        int index[] = {1, 0, 2};
    }

}
