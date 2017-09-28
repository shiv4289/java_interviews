package geeksforgeeks.arrays;

import java.util.LinkedList;

/**
 * Created by sourabh on 14/6/16.
 */
public class OddOccurence {
    public static int getNumber(LinkedList<Integer> linkedList) {
        int ret = linkedList.get(0);
        for (int i = 1; i < linkedList.size(); i++) {
            ret = ret ^ linkedList.get(i);
        }
        return ret;
    }
}
