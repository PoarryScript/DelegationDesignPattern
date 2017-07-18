package designpattern.observer;

/**
 * Created by yangbo on 2017/7/18.
 */

public enum WeatherType {
    SUNNY, RAINY, WINDY, COLD;

    @Override
    public String toString() {
        return name().toString();
    }
}
