package singleton.staticinstance;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-9
 * Time: 下午7:41
 * To change this template use File | Settings | File Templates.
 */
public class Singleton {

    // 提前new出资源
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
