package chain.filter;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-14
 * Time: 下午11:24
 * this is a chain of responsibility. Servlet
 */
public class Main {
    public static void main(String[] args) {
        FilterChain chain = new FilterChain();
        chain.addFilter(new HTMLFilter())
             .addFilter(new SensitiveFilter());
        Request request = new Request();
        request.setData("<色情>开心的放屁");
        Response response = new Response();
        chain.doFilter(request, response, chain);
        System.out.println(request.getData());
        System.out.println(response.getData());
    }
}
