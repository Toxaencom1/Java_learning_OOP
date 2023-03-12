package OOP_DZ.DZ3.Classes.Base_Classes;

public abstract class Figure implements Comparable<Figure> {
    private final int id;
    private static int idStart = 0;

    protected Figure() {
        this.id = ++idStart;
    }

    abstract public Double areaOf();


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id = " + id + ", " + getClass().getSimpleName() + ": Area of: " + areaOf();
    }

    @Override
    public int compareTo(Figure o) {
        if (this.areaOf() > o.areaOf()) {
            return 1;
        } else if (this.areaOf() < o.areaOf()) {
            return -1;
        } else return 0;
    }
}
