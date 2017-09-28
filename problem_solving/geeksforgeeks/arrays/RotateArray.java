package geeksforgeeks.arrays;

import java.util.Collections;
import java.util.List;

/**
 * Created by sourabh on 14/6/16.
 * 1 2 3 4 5
 * d : 2
 * 3 4 5 1 2
 */
public class RotateArray {

    public static void rotateList(List list, int d) {
        if (list.isEmpty()) return;
        d = d % list.size();
        Collections.addAll(
                ReverseArray.iterativeReverse(list.subList(0, d)),
                ReverseArray.iterativeReverse(list.subList(d + 1, list.size()))
        );
        ReverseArray.iterativeReverse(list);
        Utils.displayList(list);
    }
}
