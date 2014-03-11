package compisite;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by wujiabin on 14-3-11.
 */
public class CompositeInterator implements Iterator<Component> {
    private Stack<Iterator<Component>> stack;

    public CompositeInterator(Iterator<Component> iterator) {
        stack = new Stack<Iterator<Component>>();
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<Component> iterator = stack.peek();
            if(iterator.hasNext()) {
                return true;
            } else {
                stack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public Component next() {
        if (hasNext()) {
            Iterator<Component> iterator = stack.peek();
            Component component = iterator.next();
            stack.push(component.iterator());
            return component;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
