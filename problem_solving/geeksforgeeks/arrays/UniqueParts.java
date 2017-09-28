package geeksforgeeks.arrays;

import java.util.LinkedList;

/**
 * Created by sourabh on 14/6/16.
 */
public class UniqueParts {

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

    public static void makeParts(int n) {
        makePartsUtil(n, new LinkedList<Integer>());
    }

    public static void main(String args[]) {
        makeParts(5);
    }

}
