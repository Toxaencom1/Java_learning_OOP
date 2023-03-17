package OOP_DZ.DZ4;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private int index = 0;
    private final T[] list;

    public MyIterator(T[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.length;
    }

    @Override
    public T next() {
        return list[index++];
    }
}
