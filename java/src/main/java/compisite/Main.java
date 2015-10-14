package compisite;

import java.util.Iterator;

/**
 * Created by wujiabin on 14-3-11.
 */
public class Main {
    public static void main(String[] args) {
        Component root = new Composite();
        root.add(new Leaf());
        root.add(new Leaf());
        Component node = new Composite();
        node.add(new Leaf());
        node.add(new Leaf());
        root.add(node);

        for (Iterator<Component> iter = root.iterator(); iter.hasNext();) {
            iter.next().operation();
        }
    }
}
