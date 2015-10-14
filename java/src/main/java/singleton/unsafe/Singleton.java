package singleton.unsafe;

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

    // 这样同步性能是个问题
    public synchronized static Singleton getInstance() {
//    public static Singleton getInstance() { // 多线程环境下是不安全的
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
