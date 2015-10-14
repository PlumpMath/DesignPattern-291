package chain.simple;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-14
 * Time: 下午11:51
 * To change this template use File | Settings | File Templates.
 */
public class SensitiveHandler implements Handler {
    private Handler next = null;

    @Override
    public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public String handle(String msg) {
        msg = msg.replace("色情", "**").replace("尼玛", "**");
        if (next != null) {
            return next.handle(msg);
        }
        return msg;
    }
}
