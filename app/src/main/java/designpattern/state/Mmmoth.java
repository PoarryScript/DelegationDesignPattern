package designpattern.state;

/**
 * Created by yangbo on 2017/7/19.
 */

public class Mmmoth {
    private State mState;

    public Mmmoth() {
        mState = new PeacefulState(this);
    }

    public void timePasses() {
        if (mState.getClass().equals(PeacefulState.class)) {
            changeState(new AngryState(this));
        } else {
            changeState(new PeacefulState(this));
        }
    }

    private void changeState(State state) {
        this.mState = state;
        this.mState.onEnterState();
    }

    @Override
    public String toString() {
        return "The mammoth";
    }

    public void observe() {
        this.mState.observe();
    }
}
