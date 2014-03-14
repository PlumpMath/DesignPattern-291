package chain.simple;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-14
 * Time: 下午11:52
 * To change this template use File | Settings | File Templates.
 */
public class NullHandler implements Handler {
    private Handler next = null;

    @Override
    public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public String handle(String msg) {
        if (next != null) {
            return next.handle(msg);
        }
        return msg;
    }
}
