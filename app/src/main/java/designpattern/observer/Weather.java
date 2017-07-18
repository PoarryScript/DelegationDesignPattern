package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangbo on 2017/7/18.
 */

public class Weather {
    private WeatherType currentType;
    private List<WeatherObserver> observers;

    public Weather() {
        observers = new ArrayList<>();
        currentType = WeatherType.COLD;
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        currentType = enumValues[(currentType.ordinal() + 1) % enumValues.length];
        System.out.println("the weather changed to :" + currentType + ".");
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver o : observers) {
            o.update(currentType);
        }
    }
}
