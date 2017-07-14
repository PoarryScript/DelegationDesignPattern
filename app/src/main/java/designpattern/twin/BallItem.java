package designpattern.twin;

/**
 * Created by yangbo on 2017/7/14.
 */

public class BallItem extends GameItem {
    private boolean isSuspended;
    private BallThread twin;

    public void setTwin(BallThread twin) {
        this.twin = twin;
    }

    @Override
    protected void dodraw() {
        System.out.println("dodraw");
    }

    @Override
    protected void click() {
        isSuspended = !isSuspended;
        if (isSuspended) {
            twin.suspendMe();
        } else {
            twin.resumeMe();
        }
    }

    public void move() {
        System.out.println("move");
    }
}
