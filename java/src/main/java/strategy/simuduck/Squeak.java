package strategy.simuduck;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-8
 * Time: 15:20
 * To change this template use File | Settings | File Templates.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
