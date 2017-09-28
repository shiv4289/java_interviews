package geeksforgeeks.arrays;

import java.util.LinkedList;

/**
 * Created by sourabh on 14/6/16.
 */
public class NonRepeatingElements {
    public static void printElements(LinkedList<Integer> list) {
        Integer xor = 0;
        for (int i = 0; i < list.size(); i++)
            xor ^= list.get(i);

        xor = xor & (xor - 1);
        int p1 = 0, p2 = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((xor & list.get(i)) == 1) {
                p1 ^= list.get(i);
            } else {
                p2 ^= list.get(i);
            }

        }
        System.out.println(p1);
        System.out.println(p2);
    }
}
