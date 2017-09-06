package designpattern.factory;

/**
 * Created by yangbo on 2017/9/6.
 */

public class OrcBlacksmith implements Blacksmith {
    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new OrcWeapon(weaponType);
    }
}
