package designpattern.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nestviewpager.simple.com.delegationdesignpattern.R;

public class FactoryActivity extends AppCompatActivity {

    private Blacksmith blacksmith;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        blacksmith = new ElfBlacksmith();
        manufactureWeapons();
        blacksmith = new OrcBlacksmith();
        manufactureWeapons();
    }

    private void manufactureWeapons() {
        Weapon weapon;
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(weapon);

    }
}
