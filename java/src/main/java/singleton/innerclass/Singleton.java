package singleton.innerclass;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-4-29
 * Time: 下午10:15
 * To change this template use File | Settings | File Templates.
 */
public class Singleton {
    private static class _Singleton {
        private static final _Singleton instance = new _Singleton();
        private _Singleton() {}
        public static _Singleton getInstance() {
            return instance;
        }
    }

    public static _Singleton getInstance() {
        return _Singleton.getInstance();
    }
}
