package designpattern.singleton;

/**
 * Created by yangbo on 2017/7/14.
 */

public enum  EnumIvoryTower {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName()+"@"+hashCode();
    }
}
