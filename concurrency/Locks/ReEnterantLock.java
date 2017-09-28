package concurrency.Locks;

/**
 * Created by sourabh on 1/8/16.
 */
public class ReEnterantLock {

    private volatile boolean isLocked = false;
    private Thread lockedby = null;
    private volatile int lockCount = 0;

    public synchronized void lock() throws InterruptedException {
        Thread currentThread = Thread.currentThread();
        while (isLocked && currentThread != lockedby) {
            wait();
        }
        lockCount++;
        isLocked = true;
        lockedby = currentThread;
    }

    public synchronized void unlock() {
        if (lockedby == Thread.currentThread()) {
            lockCount--;
            if (lockCount == 0) {
                isLocked = false;
                notify();
            }
        }
    }
}
