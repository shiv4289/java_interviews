package Singleton;

/**
 * Created by sourabh on 9/7/16.
 */
public class Singleton {
    // Private constructor prevents instantiation from other classes
    private Singleton() {
    }

    /**
     * SingletonHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to SingletonHolder.INSTANCE, not before.
     */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
