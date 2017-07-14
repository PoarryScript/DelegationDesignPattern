package designpattern.twin;

/**
 * Created by yangbo on 2017/7/14.
 */

public abstract class GameItem {

    public void draw(){
        System.out.println("draw");
        dodraw();
    }

    protected abstract void dodraw();
    protected abstract void click();


}
