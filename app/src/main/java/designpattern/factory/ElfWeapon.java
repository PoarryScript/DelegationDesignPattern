package designpattern.factory;

/**
 * Created by yangbo on 2017/9/6.
 */

public class ElfWeapon implements Weapon {
    private WeaponType weaponType;

    public ElfWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "ElfWeapon "+weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }
}
