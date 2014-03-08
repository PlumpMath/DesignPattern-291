package decorator.starbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-9
 * Time: 上午12:31
 * To change this template use File | Settings | File Templates.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
