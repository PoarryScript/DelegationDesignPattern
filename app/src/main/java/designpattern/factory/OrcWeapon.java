package designpattern.factory;

/**
 * Created by yangbo on 2017/9/6.
 */

public class OrcWeapon implements Weapon {
    private WeaponType weatherType;

    public OrcWeapon(WeaponType weatherType) {
        this.weatherType = weatherType;
    }

    @Override
    public String toString() {
        return "OrcWeapon "+weatherType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weatherType;
    }
}
