package OOP_DZ.DZ4;

import java.util.Collection;

public interface ArrayListInterface<T> extends Iterable<T> {
    int size();
    T get(int index);
    void set(int index, T t);
    boolean add(T t);
    boolean addAll(int index, Collection<? extends T> c);
    void remove(int index);
    void remove(T item);
    void removeIf(T item);
    int indexOf(T item);
    int lastIndexOf(T item);
    boolean contains(T item);
}
