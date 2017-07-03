package nestviewpager.simple.com.delegationdesignpattern.printers;

import nestviewpager.simple.com.delegationdesignpattern.Printer;

/**
 * Created by j-yangbo on 2017/7/3.
 */

public class EpsonPrinter implements Printer {
    @Override
    public void printer(String msg) {
        System.out.println("Epson "+msg);
    }
}
