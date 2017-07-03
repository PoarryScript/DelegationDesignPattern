package designpattern.delegation.printers;

import designpattern.delegation.Printer;

/**
 * Created by j-yangbo on 2017/7/3.
 */

public class HPPrinter implements Printer {
    @Override
    public void printer(String msg) {
        System.out.println("HP:"+msg);
    }
}
