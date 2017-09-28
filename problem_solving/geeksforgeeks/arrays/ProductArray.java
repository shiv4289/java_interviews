package geeksforgeeks.arrays;

import java.util.ArrayList;

/**
 * Created by sourabh on 14/6/16.
 */
public class ProductArray {
    public static ArrayList productArray(ArrayList<Integer> list) {

        ArrayList<Integer> rlist = new ArrayList<Integer>(list.size());

        rlist.add(list.size() - 1, list.get(list.size() - 1));

        for (int i = list.size() - 2; i >= 0; i--)
            rlist.add(i, list.get(i) * rlist.get(i + 1));

        Integer product = 1;

        for (int i = 0; i < list.size(); i++) {
        }
        return list;
    }

}
