package designpattern.builder;

/**
 * Created by yangbo on 2017/7/13.
 */

public enum  HairType {
    BALD("bald"),SHORT("short"),CURLY("curly"),LONG_STRAIGHT("long straight"),LONG_CURLY("long curly");
    private String title;

     HairType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return name().toString();
    }
}
