package designpattern.factory;

/**
 * Created by yangbo on 2017/9/6.
 */

public enum  WeaponType {
    SHORT_SWORD("short_sword"),SPEAR("spear"),AXE("axe"),UNDEFFINED("");
    private String title;

    WeaponType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
