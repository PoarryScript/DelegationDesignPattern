package designpattern.twin;

/**
 * Created by yangbo on 2017/7/14.
 */

public class BallThread extends Thread {

    private BallItem twin;
    private volatile boolean isSuspended;
    private volatile boolean isRuning = true;

    public void setTwin(BallItem t) {
        twin = t;
    }


    @Override
    public void run() {
        super.run();
        while (isRuning) {
            if (!isSuspended) {
                twin.draw();
                twin.move();
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }

    public void suspendMe() {
        isSuspended = true;
        System.out.println("Bagin to suspend BallThread");
    }

    public void resumeMe() {
        isSuspended = false;
        System.out.println("Bagin to resume BallThread");
    }

    public void stopMe() {
        isSuspended = false;
        isRuning = false;
        System.out.println("stop to resume BallThread");
    }
}
