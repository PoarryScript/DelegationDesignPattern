package designpattern.delegation.printers;

import designpattern.delegation.Printer;

/**
 * Created by j-yangbo on 2017/7/3.
 */

public class CanonPrinter implements Printer {
    @Override
    public void printer(String msg) {
        System.out.println("Canon "+msg);
    }
}
