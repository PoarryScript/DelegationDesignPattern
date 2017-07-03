package nestviewpager.simple.com.delegationdesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nestviewpager.simple.com.delegationdesignpattern.printers.CanonPrinter;
import nestviewpager.simple.com.delegationdesignpattern.printers.EpsonPrinter;
import nestviewpager.simple.com.delegationdesignpattern.printers.HPPrinter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PrinterController HPprinterController = new PrinterController(new HPPrinter());
        PrinterController CanonprinterController = new PrinterController(new CanonPrinter());
        PrinterController EsponprinterController = new PrinterController(new EpsonPrinter());
        HPprinterController   .printer("Message:Hello wprld ");
        CanonprinterController.printer("Message:Hello wprld ");
        EsponprinterController.printer("Message:Hello wprld ");
    }
}
