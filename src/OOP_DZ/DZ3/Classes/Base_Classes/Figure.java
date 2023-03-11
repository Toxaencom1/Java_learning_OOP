package OOP_DZ.DZ3.Classes.Base_Classes;

public abstract class Figure {
    private final int id;
    private static int idStart = 0;

    protected Figure() {
        this.id = ++idStart;
    }

    abstract public Double areaOf();
    abstract public String checkFigure();

    public int getId() {
        return id;
    }
}
