package chain;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-14
 * Time: 下午11:15
 * To change this template use File | Settings | File Templates.
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}
