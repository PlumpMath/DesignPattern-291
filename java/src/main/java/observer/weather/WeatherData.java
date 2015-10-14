package observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-8
 * Time: 17:11
 * To change this template use File | Settings | File Templates.
 */
public class WeatherData implements Subject {
    private List<Observer> obsersers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        obsersers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        obsersers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = obsersers.indexOf(observer);
        if (i >= 0) {
            obsersers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : obsersers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
