package designpattern.decorator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import nestviewpager.simple.com.delegationdesignpattern.R;


/**
 *
 * The Decorator pattern is a more flexible alternative to subclassing. The Decorator class
 * implements the same interface as the target and uses composition to "decorate" calls to the
 * target. Using the Decorator pattern it is possible to change the behavior of the class during
 * runtime.
 * <p>
 * In this example we show how the simple {@link Troll} first attacks and then flees the battle.
 * Then we decorate the {@link Troll} with a {@link SmartHostile} and perform the attack again. You
 * can see how the behavior changes after the decoration.
 *
 */

public class DecoratorActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);
        textView = (TextView) findViewById(R.id.test_text);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A simple looking troll approaches.");

        Troll troll = new Troll();
        troll.attack();
        troll.fleeBattle();
        stringBuilder.append(("Simple troll power %d.\n"+ troll.getAttackPower()));

        stringBuilder.append("\nA smart looking troll surprises you.");
        Hostile smart = new SmartHostile(troll);
        smart.attack();
        smart.fleeBattle();
        stringBuilder.append("Simple smart power %d.\n" +smart.getAttackPower());
        textView.setText(stringBuilder);
    }
}
