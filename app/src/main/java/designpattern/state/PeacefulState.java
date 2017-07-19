package designpattern.state;

/**
 * Created by yangbo on 2017/7/19.
 */

public class PeacefulState implements State {
    private Mmmoth mmmoth;

    public PeacefulState(Mmmoth mmmoth) {
        this.mmmoth = mmmoth;
    }

    @Override
    public void onEnterState() {
        System.out.println(String.format("%s is calm and peaceful.", mmmoth));
    }

    @Override
    public void observe() {
        System.out.println(String.format("%s is calm down.", mmmoth));

    }
}
