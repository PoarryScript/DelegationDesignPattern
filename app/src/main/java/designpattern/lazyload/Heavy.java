package designpattern.lazyload;

/**
 * Created by yangbo on 2017/7/14.
 */

public class Heavy {
    public Heavy() {
        System.out.println("Create Heavy ...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Heavy Created...");

    }

}
