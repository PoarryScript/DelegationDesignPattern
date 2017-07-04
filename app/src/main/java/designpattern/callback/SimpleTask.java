package designpattern.callback;

/**
 * Created by j-yangbo on 2017/7/4.
 */

public class SimpleTask extends Task {
    @Override
    protected void execute() {
        System.out.println("SimpleTask："+SimpleTask.class.getSimpleName());
    }
}
