package designpattern.callback;

/**
 * Created by j-yangbo on 2017/7/4.
 */

public abstract class Task {

    public final void executeWEith(Callback callback) {
        execute();
        if (callback != null) {
            callback.callback();
        }
    }

    protected abstract void execute();
}
