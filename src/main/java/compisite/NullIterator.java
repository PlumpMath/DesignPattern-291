package compisite;

import java.util.Iterator;

/**
 * Created by wujiabin on 14-3-11.
 */
public class NullIterator implements Iterator<Component> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Component next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
