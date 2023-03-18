package OOP_DZ.DZ4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class AnthonyList<T> implements ArrayListInterface<T> {
    private  final T[] empty = (T[])new Object[0];
    private int size = 0;
    private T[] list;

    public AnthonyList() {
        this.list = (T[]) empty;
    }

    public AnthonyList(Collection<? extends T> c) {
        T[] a = (T[]) c.toArray();
        if ((size = a.length) != 0) {
            if (c.getClass() == ArrayList.class) {
                list = a;
            } else {
                list = (T[]) Arrays.copyOf(a, size, Object[].class);
            }
        } else {

            list = empty;
        }
    }
    public T[] newEmpty(int newObjectLength){
        try {
            return (T[])new Object[newObjectLength];
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        System.out.println("Something wrong with DownCast");
        return list;
    }
    private T tryCatchNumber(Number newNumber){
        try {
            return (T)newNumber;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        System.out.println("Something wrong with DownCast");
        return null;
    }
    private T tryCatchString(String newString){
        try {
            return (T)newString;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        System.out.println("Something wrong with DownCast");
        return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void set(int index, T item) {
        list[index] = item;
    }

    @Override
    public T get(int index) {
        return list[index];
    }

    @Override
    public boolean add(T item) {
        try {
            size++;
            T[] temp = list;
            list = newEmpty(temp.length + 1);
            System.arraycopy(temp, 0, list, 0, temp.length);
            list[list.length - 1] = item;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        try {
            size= size+c.toArray().length;
            T[] temp = list;
            list = newEmpty(temp.length + c.toArray().length);
            System.arraycopy(temp, 0, list, 0, index);
            System.arraycopy(c.toArray(), 0, list, index, c.toArray().length);
            System.arraycopy(temp, index, list, index+c.toArray().length, temp.length-index);
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }


    @Override
    public void remove(int index) {
        try {
            size--;
            T[] temp = list;
            list = newEmpty(temp.length - 1);
            System.arraycopy(temp, 0, list, 0, index);
            System.arraycopy(temp, index + 1, list, index, temp.length - index - 1);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }


    public T[] getList() {
        return list;
    }

    @Override
    public void remove(T item) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == item) {
                remove(i);
                break;
            }
        }
    }

    @Override
    public void removeIf(T item) {
        for (T o : list) {
            if (o.equals(item)) {
                remove(o);
            }
        }
    }

    public T max() {
        return (T) Arrays.stream(list).sorted(new TrippleComporator()).toArray()[list.length - 1];
    }

    public T min() {
        return (T) Arrays.stream(list).sorted(new TrippleComporator()).toArray()[0];
    }


    public T sum() {
        if (list[0] instanceof Integer) {
            Integer sum = 0;
            for (T item : this.list) {
                sum += (Integer) item;
            }
            return tryCatchNumber(sum);
        }
        if (list[0] instanceof Double) {
            Double sum = 0.0;
            for (T item : this.list) {
                sum += (Double) item;
            }
            return tryCatchNumber(sum);
        }
        if (list[0] instanceof String) {
            StringBuilder sb = new StringBuilder();
            for (T item : list) {
                sb.append(item);
            }
            return tryCatchString(sb.toString());
        }
        return (T) null;
    }

    public T multiply() {
        if (list[0] instanceof Integer) {
            Integer multiply = 1;
            for (T item : list) {
                multiply *= (Integer) item;
            }
            return tryCatchNumber(multiply);
        }
        if (list[0] instanceof Double) {
            Double multiply = 1.0;
            for (T item : list) {
                multiply *= (Double) item;
            }
            return tryCatchNumber(multiply);
        }
        if (list[0] instanceof String) {
            throw new IllegalArgumentException();
        }
        return (T) null;
    }

    @Override
    public int indexOf(T item) {
        for (int i = 0; i < list.length; i++) {
            if ((list[i]).equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T item) {
        for (int i = list.length - 1; i >= 0; i--) {
            if ((list[i]).equals(item)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public boolean contains(T item) {
        for (T obj : list) {
            if (obj.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public void sortBuble() {
        if (list[0] instanceof Integer) {
            int i = 0;
            T temp;
            while (i < list.length - 1) {
                if ((Integer) list[i] > (Integer) list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    i = -1;
                }
                i++;
            }
        }
        if (list[0] instanceof Double) {
            int i = 0;
            T temp;
            while (i < list.length - 1) {
                if ((Double) list[i] > (Double) list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    i = -1;
                }
                i++;
            }
        }
        if (list[0] instanceof String) {
            throw new IllegalArgumentException();
        }

    }

    public void sortSelection() {
        if (list[0] instanceof Integer) {
            for (int i = 0; i < list.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < list.length; j++) {
                    if ((Integer) list[j] < (Integer) list[index]) {
                        index = j;
                    }
                }
                T smallerNumber = list[index];
                list[index] = list[i];
                list[i] = smallerNumber;
            }
        }
        if (list[0] instanceof Double) {
            for (int i = 0; i < list.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < list.length; j++) {
                    if ((Double) list[j] < (Double) list[index]) {
                        index = j;
                    }
                }
                T smallerNumber = list[index];
                list[index] = list[i];
                list[i] = smallerNumber;
            }
        }
        if (list[0] instanceof String) {
            throw new IllegalArgumentException();
        }
    }

    public void sortInsertion() {
        if (list[0] instanceof Integer) {
            for (int i = 1; i < list.length; i++) {
                T current = list[i];
                int j = i - 1;
                while (j >= 0 && (Integer) current < (Integer) list[j]) {
                    list[j + 1] = list[j];
                    j--;
                }
                list[j + 1] = current;
            }
        }
        if (list[0] instanceof Double) {
            for (int i = 1; i < list.length; i++) {
                T current = list[i];
                int j = i - 1;
                while (j >= 0 && (Double) current < (Double) list[j]) {
                    list[j + 1] = list[j];
                    j--;
                }
                list[j + 1] = current;
            }
        }
        if (list[0] instanceof String) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < list.length; i++) {

            s.append(list[i]);
            if (i != list.length - 1) {
                s.append(", ");
            }
        }
        s.append("]");
        return s.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(list);
    }
}
