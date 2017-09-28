package concurrency.NNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sourabh on 2/8/16.
 */
public class NumbersDemo {
    public static void main(String args[]) {
        List<Thread> list = new ArrayList<Thread>();
        final int size = 4;
        Counter counter = new Counter(0);
        for (int i = 0; i < size; i++) {
            list.add(new Thread(new PrinterThreads(counter, i, size, 100)));
        }

        for (int i = 0; i < size; i++) {
            list.get(i).start();
        }
    }
}
