package decorator.starbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-9
 * Time: 上午12:35
 * To change this template use File | Settings | File Templates.
 */
public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
