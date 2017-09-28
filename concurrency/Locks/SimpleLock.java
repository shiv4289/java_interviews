package concurrency.Locks;

/**
 * Created by sourabh on 1/8/16.
 */
public class SimpleLock {

    public volatile boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {
        while (isLocked) {
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock() {
        isLocked = false;
        notify();
    }
}
