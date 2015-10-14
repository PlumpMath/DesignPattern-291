package compisite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wujiabin on 14-3-11.
 */
public class Composite extends Component implements Iterable<Component> {
    private List<Component> childs;

    public Composite() {
        childs = new ArrayList<Component>();
    }

    @Override
    public void operation() {
        System.out.println("Composite");
    }

    @Override
    public void add(Component component) {
        this.childs.add(component);
    }

    @Override
    public void remove(Component component) {
        this.childs.remove(component);
    }

    @Override
    public Component getChild(int index) {
        if (index >= 0 && index < this.childs.size())
            return this.childs.get(index);
        else
            throw new IllegalArgumentException("index is out of range. [index -> " + index + "]");
    }

    @Override
    public Iterator<Component> iterator() {
        return new CompositeInterator(this.childs.iterator());
    }
}
