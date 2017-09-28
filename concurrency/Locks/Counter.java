package concurrency.Locks;

/**
 * Created by sourabh on 1/8/16.
 */
public class Counter {
    private int value;
    private SimpleLock lock = new SimpleLock();

    public int inc() throws InterruptedException {
        lock.lock();
        value++;
        lock.unlock();
        return value;
    }
}
