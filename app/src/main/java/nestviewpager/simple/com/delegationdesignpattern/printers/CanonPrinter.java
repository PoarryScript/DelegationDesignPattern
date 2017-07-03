package nestviewpager.simple.com.delegationdesignpattern.printers;

import nestviewpager.simple.com.delegationdesignpattern.Printer;

/**
 * Created by j-yangbo on 2017/7/3.
 */

public class CanonPrinter implements Printer {
    @Override
    public void printer(String msg) {
        System.out.println("Canon "+msg);
    }
}
