package designpattern.state;

/**
 * Created by yangbo on 2017/7/19.
 */

public class AngryState implements State {
    private Mmmoth mmmoth;

    public AngryState(Mmmoth mmmoth) {
        this.mmmoth = mmmoth;
    }

    @Override
    public void onEnterState() {
        System.out.println(String.format("%s is furious.", mmmoth));

    }

    @Override
    public void observe() {
        System.out.println(String.format("%s get angry.", mmmoth));
    }
}
