package designpattern.singleton;

/**
 * Created by yangbo on 2017/7/14.
 */

public final class IvoryTower {
    private static final IvoryTower INSTANCE = new IvoryTower();

    private IvoryTower() {
    }
    public static IvoryTower getInstance(){
        return INSTANCE;
    }
}
