package designpattern.delegation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import designpattern.delegation.printers.CanonPrinter;
import designpattern.delegation.printers.EpsonPrinter;
import designpattern.delegation.printers.HPPrinter;
import nestviewpager.simple.com.delegationdesignpattern.R;

public class DelegationActivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delegation_activity);

        PrinterController HPprinterController = new PrinterController(new HPPrinter());
        PrinterController CanonprinterController = new PrinterController(new CanonPrinter());
        PrinterController EsponprinterController = new PrinterController(new EpsonPrinter());
        HPprinterController.printer("Message:Hello wprld ");
        CanonprinterController.printer("Message:Hello wprld ");
        EsponprinterController.printer("Message:Hello wprld ");
    }
}
