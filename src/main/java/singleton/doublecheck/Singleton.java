package singleton.doublecheck;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-9
 * Time: 下午7:41
 * To change this template use File | Settings | File Templates.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    // double-checked locking, not available in jdk 1.4 or before
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
