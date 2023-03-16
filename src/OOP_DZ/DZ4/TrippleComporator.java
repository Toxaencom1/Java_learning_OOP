package OOP_DZ.DZ4;

import java.util.Comparator;

public class TrippleComporator<T> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        if (o1 instanceof Double) {
            if ((Double) o1 > (Double) o2)
                return 1;
            else if ((Double) o1 < (Double) o2)
                return -1;
            else
                return 0;
        } else if (o1 instanceof Integer) {
            if ((Integer) o1 > (Integer) o2)
                return 1;
            else if ((Integer) o1 < (Integer) o2)
                return -1;
            else
                return 0;
        } else if (o1 instanceof String) {
            throw new IllegalArgumentException();
        }
        return 0;

    }
}
