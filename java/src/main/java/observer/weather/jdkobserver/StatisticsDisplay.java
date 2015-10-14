package observer.weather.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-8
 * Time: 18:36
 * To change this template use File | Settings | File Templates.
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200f;
    private float tempSum = 0.0f;
    private int numReadings = 0;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.numReadings++;
            this.tempSum += weatherData.getTemperature();
            if (this.minTemp > weatherData.getTemperature()) {
                this.minTemp = weatherData.getTemperature();
            }

            if (this.maxTemp < weatherData.getTemperature()) {
                this.maxTemp = weatherData.getTemperature();
            }
        }
    }
}
