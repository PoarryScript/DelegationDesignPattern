package designpattern.decorator;

/**
 * Created by yangbo on 2017/10/19.
 */

public class SmartHostile implements Hostile {
    private Hostile hostile;

    public SmartHostile(Hostile decorator) {
        this.hostile = decorator;
    }

    @Override
    public void attack() {
        System.out.println("It throws a rock at you!");
        hostile.attack();
    }

    @Override
    public int getAttackPower() {
        return hostile.getAttackPower()+20;
    }

    @Override
    public void fleeBattle() {
        System.out.println("It calls for help!");
        hostile.fleeBattle();

    }
}
