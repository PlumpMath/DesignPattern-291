package observer.weather;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-8
 * Time: 17:06
 * To change this template use File | Settings | File Templates.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
