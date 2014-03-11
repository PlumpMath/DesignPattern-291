package compisite;

import java.util.Iterator;

/**
 * Created by wujiabin on 14-3-11.
 */
public class Leaf extends Component implements Iterable<Component> {
    @Override
    public void operation() {
        System.out.println("\tLeaf");
    }

    @Override
    public Iterator<Component> iterator() {
        return new NullIterator();
    }
}
