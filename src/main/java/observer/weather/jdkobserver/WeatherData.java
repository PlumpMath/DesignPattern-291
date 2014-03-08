package observer.weather.jdkobserver;

import java.util.Observable;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-8
 * Time: 18:14
 * To change this template use File | Settings | File Templates.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    public void measurementsChanged() {
        setChanged();
        notifyObservers(); // 没有传送数据, 采用pull的方式, 不是push
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
