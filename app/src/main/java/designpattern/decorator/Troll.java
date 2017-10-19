package designpattern.decorator;

/**
 * Created by yangbo on 2017/10/19.
 */

public class Troll implements Hostile {
    @Override
    public void attack() {
        System.out.println("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }


    @Override
    public void fleeBattle() {
        System.out.println("The troll shrieks in horror and runs away!");
    }
}
