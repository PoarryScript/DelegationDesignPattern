package designpattern.proxy;

/**
 * Created by yangbo on 2017/7/17.
 */

public class WizardTowerProxy extends WizardTower {
    private static final int MUN_WIZARD_ALLOWED = 3;
    private int numWizards;

    @Override
    public void enter(Wizard wizard) {
        if (numWizards < MUN_WIZARD_ALLOWED) {
            super.enter(wizard);
            numWizards++;
        } else {
            System.out.println(wizard + "is not allowed to enterd");
        }
    }
}
