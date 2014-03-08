package decorator.starbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-9
 * Time: 上午12:27
 * To change this template use File | Settings | File Templates.
 */
public abstract class Beverage {
    String description = "";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
