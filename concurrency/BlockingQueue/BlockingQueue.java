package concurrency.BlockingQueue;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sourabh on 1/8/16.
 */
public class BlockingQueue {
    private final int size;
    private List list = new LinkedList<>();
    ;

    public BlockingQueue(int size) {
        this.size = size;
    }

    public synchronized void enqueue(Object val) throws InterruptedException {
        while (list.size() == size) {
            wait();
        }
        notifyAll();
        list.add(val);
    }

    public synchronized Object dequeue() throws InterruptedException {
        if (list.size() == 0) {
            wait();
        }
        notifyAll();
        return list.remove(0);
    }
}
