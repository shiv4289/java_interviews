package concurrency.NNumbers;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by sourabh on 2/8/16.
 */

class Counter {
    AtomicInteger counter;

    Counter(int initialValue) {
        counter = new AtomicInteger(initialValue);
    }

    public void printNext(int threadId, int numOfThreads) throws InterruptedException {
        synchronized (this) {
            while (counter.get() % numOfThreads != threadId) {
                wait();
            }
            System.out.println(threadId + " " + counter.getAndIncrement());
            notifyAll();
        }
    }
}

class PrinterThreads implements Runnable {
    private int threadId;
    private int numOfThreads;
    private int finalValue;
    Counter counter;

    public PrinterThreads(Counter counter, int threadId, int numOfThreads, int finalValue) {
        this.counter = counter;
        this.threadId = threadId;
        this.numOfThreads = numOfThreads;
        this.finalValue = finalValue;
    }

    public void run() {
        try {
            for (int i = 0; i < finalValue / numOfThreads; i++) {
                counter.printNext(threadId, numOfThreads);
            }
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }
}
