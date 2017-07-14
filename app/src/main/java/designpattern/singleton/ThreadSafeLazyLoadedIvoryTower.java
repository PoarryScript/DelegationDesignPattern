package designpattern.singleton;

/**
 * Created by yangbo on 2017/7/14.
 */

public class ThreadSafeLazyLoadedIvoryTower {
    private ThreadSafeLazyLoadedIvoryTower() {
    }

    private static ThreadSafeLazyLoadedIvoryTower instance;

    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedIvoryTower();
        }
        return instance;
    }
}
