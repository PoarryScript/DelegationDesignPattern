package designpattern.proxy;

/**
 * Created by yangbo on 2017/7/17.
 */

public class Wizard {
    private String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                '}';
    }
}
