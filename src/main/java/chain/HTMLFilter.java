package chain;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-14
 * Time: 下午11:20
 * To change this template use File | Settings | File Templates.
 */
public class HTMLFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setData(request.getData().replace("<", "[").replace(">", "]"));
        chain.doFilter(request, response, chain);
        response.setData(response.getData() + "--HTML--");
    }
}
