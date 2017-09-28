package geeksforgeeks.arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by sourabh on 15/6/16.
 */
public class MaxNumber implements Comparator {

    public static void getLargestNumber(LinkedList<Integer> linkedList) {
        Collections.sort(linkedList, new MaxNumber());
        System.out.println(linkedList);
    }


    @Override
    public int compare(Object o1, Object o2) {
        String i = o1.toString() + o2.toString();
        String j = o2.toString() + o1.toString();
        return j.compareTo(i);
    }
}
