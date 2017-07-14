package designpattern.lazyload;

/**
 * Created by yangbo on 2017/7/14.
 */

public class HolderNaive {

    private Heavy heavy;

    public HolderNaive() {
        System.out.println("HoderNaive created");
    }

    public Heavy getHeavy() {
        if (heavy == null) {
            heavy = new Heavy();
        }
        return heavy;
    }
}
