package strategy.simuduck;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-8
 * Time: 15:21
 * To change this template use File | Settings | File Templates.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
