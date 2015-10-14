package factory.factorymethod;

public abstract class PizzaStore {

    // 将创建的过程延迟到子类中实现, 就是factory method
    protected abstract Pizza createPizza(String item);

    // final 不允许子类修改, 保证流程一致
    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
