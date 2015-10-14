package adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-10
 * Time: 上午1:02
 * To change this template use File | Settings | File Templates.
 */
public class IteratorEnumeration<T> implements Enumeration<T> {

    private Iterator<T> iterator;

    public IteratorEnumeration(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public T nextElement() {
        return iterator.next();
    }
}
