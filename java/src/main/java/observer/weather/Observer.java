package observer.weather;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-8
 * Time: 17:07
 * To change this template use File | Settings | File Templates.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
