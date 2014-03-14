package chain.simple;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-14
 * Time: 下午11:40
 * To change this template use File | Settings | File Templates.
 */
public interface Handler {
    void setNext(Handler handler);
    String handle(String msg);
}
