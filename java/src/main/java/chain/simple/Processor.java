package chain.simple;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-14
 * Time: 下午11:48
 * To change this template use File | Settings | File Templates.
 */
public class Processor implements Handler {
    private Handler prev = new NullHandler();
    private Handler first = prev;

    public Processor addHandler(Handler handler) {
        prev.setNext(handler);
        prev = handler;
        return this;
    }

    @Override
    public void setNext(Handler handler) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String handle(String msg) {
        return first.handle(msg);
    }
}
