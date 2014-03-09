package adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-10
 * Time: 上午12:39
 * To change this template use File | Settings | File Templates.
 */
public class EnumerationIterator<T> implements Iterator<T> {
    private Enumeration<T> enumeration;

    EnumerationIterator(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Enumeration cannot remove element.");
    }
}
