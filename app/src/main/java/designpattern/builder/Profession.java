package designpattern.builder;

/**
 * Created by yangbo on 2017/7/13.
 */

public enum Profession {
    WARRIOR, THIEF, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toString();
    }
}
