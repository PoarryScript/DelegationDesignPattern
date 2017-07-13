package designpattern.builder;

/**
 * Created by yangbo on 2017/7/13.
 */

public enum  Armor {
    CLOTHES("clothes"),LEATHER("leather"),CHAIN_MAIL("chain mail"),PLATE_MAIL("plate mail");
    private String mTitle;
    Armor(String title){
     mTitle = title;
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
