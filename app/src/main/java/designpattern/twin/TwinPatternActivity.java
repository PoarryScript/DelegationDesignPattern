package designpattern.twin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nestviewpager.simple.com.delegationdesignpattern.R;

/**
 * Twin pattern is a design pattern which provides a standard solution to simulate multiple
 * inheritance in java.
 * <p>
 * In this example, the essence of the Twin pattern is the {@link BallItem} class and
 * {@link BallThread} class represent the twin objects to coordinate with each other(via the twin
 * reference) like a single class inheriting from {@link GameItem} and {@link Thread}.
 */
public class TwinPatternActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twin_pattern);
        BallItem ballItem = new BallItem();
        BallThread ballThread = new BallThread();

        ballItem.setTwin(ballThread);
        ballThread.setTwin(ballItem);

        ballThread.start();
        waiting();
        ballItem.click();
        waiting();

        ballItem.click();
        waiting();

        ballThread.stopMe();
    }

    private void waiting() {
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
