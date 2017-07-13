package designpattern.builder;

/**
 * Created by yangbo on 2017/7/13.
 */

public enum  HairColor {
    WHITE,BLOND,RED,BROWN,BLACK;

    @Override
    public String toString() {
        return name().toString();
    }
}
