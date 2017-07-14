package designpattern.lazyload;

/**
 * Created by yangbo on 2017/7/14.
 */

public class HolderThreadSafe {
    private Heavy heavy;

    public HolderThreadSafe() {
        System.out.println("HolderThreadSafe created");
    }


    public synchronized Heavy getHeavy() {
        if (heavy == null) {
            heavy = new Heavy();
        }
        return heavy;
    }
}
