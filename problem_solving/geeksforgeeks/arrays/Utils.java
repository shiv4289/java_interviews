package geeksforgeeks.arrays;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by sourabh on 14/6/16.
 */
public class Utils {

    public static List getRandomList(int size) {
        List list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            int n = Math.abs(new Random().nextInt()) % 71;
            list.add(n);
        }
        return list;
    }

    public static LinkedList getLinkedList(Integer[] array) {
        LinkedList list = new LinkedList(Stream.of(array).collect(Collectors.toList()));
        return list;
    }

    public static void displayList(List list) {
        System.out.println(list.toString());
    }

    public static Integer max(Integer... list) {
        Integer ret = Integer.MIN_VALUE;
        for (Integer i : list) {
            ret = Math.max(ret, i);
        }
        return ret;
    }

    public static Integer min(Integer... list) {
        Integer ret = Integer.MAX_VALUE;
        for (Integer i : list) {
            ret = Math.min(ret, i);
        }
        return ret;
    }
}
