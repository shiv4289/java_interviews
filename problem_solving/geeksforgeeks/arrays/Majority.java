package geeksforgeeks.arrays;

import java.util.List;

/**
 * Created by sourabh on 14/6/16.
 */
public class Majority {
    public static Integer getMajorityElement(List list) {
        Integer maj = (Integer) list.get(0);
        int count = 1;
        int size = list.size();
        for (int i = 1; i < size; i++) {
            if (count == 0) {
                maj = (Integer) list.get(i);
            }
            if (list.get(i) == maj) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int i = 0; i < size; i++) {
            if (list.get(i) == maj) {
                count++;
            }
        }
        if (count > size / 2) {
            return maj;
        }
        return -1;
    }
}
