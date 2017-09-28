package concurrency.Semaphore;

/**
 * Created by sourabh on 1/8/16.
 * <p>
 * Mutex
 * <p>
 * Strictly speaking, a mutex is locking mechanism used to synchronize access to a resource.
 * Only one task (can be a thread or process based on OS abstraction) can acquire the mutex.
 * It means there will be ownership associated with mutex, and only the owner can release the lock (mutex).
 * <p>
 * Semaphore
 * <p>
 * Semaphore is signaling mechanism (“I am done, you can carry on” kind of signal).
 * For example, if you are listening songs (assume it as one task) on your mobile and at the same time your friend called you,
 * an interrupt will be triggered upon which an interrupt service routine (ISR) will signal the call processing task to wakeup.
 */

public class BoundedSemaphore {
    private int signals = 0;
    private int bound = 0;

    public BoundedSemaphore(int upperBound) {
        this.bound = upperBound;
    }

    public synchronized void take() throws InterruptedException {
        while (this.signals == bound) wait();
        this.signals++;
        this.notify();
    }

    public synchronized void release() throws InterruptedException {
        while (this.signals == 0) wait();
        this.signals--;
        this.notify();
    }
}