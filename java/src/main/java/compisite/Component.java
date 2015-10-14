package compisite;

/**
 * Created by wujiabin on 14-3-11.
 */
public abstract class Component implements Iterable<Component> {
    public void operation() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void add(Component component) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
