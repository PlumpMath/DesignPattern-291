package chain.filter;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-14
 * Time: 下午11:16
 * To change this template use File | Settings | File Templates.
 */
public class Request {
    private String data;

    public Request() {
        this.data = new String();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
