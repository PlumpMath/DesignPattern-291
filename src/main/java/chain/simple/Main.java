package chain.simple;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-14
 * Time: 下午11:54
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.addHandler(new HTMLHandler())
                 .addHandler(new SensitiveHandler());
        String msg = "色情, <尼玛>, 开心";
        System.out.println(processor.handle(msg));
    }
}
