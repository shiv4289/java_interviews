package geeksforgeeks.arrays;

import java.util.Collections;
import java.util.List;

/**
 * Created by sourabh on 14/6/16.
 */
public class ReverseArray {

    public static List iterativeReverse(List list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++)
            Collections.swap(list, i, size - 1 - i);
        return list;
    }

    public static List recurrsiveReverse(List list) {
        if (list.size() > 1)
            Collections.addAll(recurrsiveReverse(list.subList(1, list.size())), list.subList(0, 0));
        return list;
    }


}
