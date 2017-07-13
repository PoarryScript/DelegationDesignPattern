package designpattern.builder;

/**
 * Created by yangbo on 2017/7/13.
 */

public enum  Weapon {
    DAGGER,SWORD,AXE,WARHAMMER,BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
