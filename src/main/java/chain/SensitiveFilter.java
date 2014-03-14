package chain;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-14
 * Time: 下午11:29
 * To change this template use File | Settings | File Templates.
 */
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setData(request.getData().replace("色情", "**"));
        chain.doFilter(request, response, chain);
        response.setData(response.getData() + "--SENSITIVE--");
    }
}
