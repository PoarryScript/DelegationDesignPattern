package nestviewpager.simple.com.delegationdesignpattern;

/**
 * Created by j-yangbo on 2017/7/3.
 */
/**
 * The delegate pattern provides a mechanism to abstract away the implementation and control of the desired action.
 * The class being called in this case {@link PrinterController} is not responsible for the actual desired action,
 * but is actually delegated to a helper class either {@link nestviewpager.simple.com.delegationdesignpattern.printers.CanonPrinter},
 * {@link nestviewpager.simple.com.delegationdesignpattern.printers.EpsonPrinter} or {@link nestviewpager.simple.com.delegationdesignpattern.printers.HPPrinter}.
 * The consumer does not have or require knowledge of the actual class carrying out the action, only the
 * container on which they are calling.
 *
 * In this example the delegates are {@link EpsonPrinter}, {@link HpPrinter} and {@link CanonPrinter} they all implement
 * {@link Printer}. The {@link PrinterController} class also implements {@link Printer}. However neither provide the
 * functionality of {@link Printer} by printing to the screen, they actually call upon the instance of {@link Printer}
 * that they were instantiated with. Therefore delegating the behaviour to another class.
 */

public class PrinterController implements Printer {
    private final Printer mPrinter;

    public PrinterController(Printer mPrinter) {
        this.mPrinter = mPrinter;
    }

    @Override
    public void printer(String msg) {
        mPrinter.printer(msg);
    }
}
