package OOP_DZ.DZ1;

public class Drinks extends Goods {
    protected final double capacity;

    public Drinks(String name, int cost, int quantity, String measure, double capacity) {
        super(name, cost, quantity, measure);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacity=" + capacity + " l";

    }

    public double getCapacity() {
        return capacity;
    }

}
