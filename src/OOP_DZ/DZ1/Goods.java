package OOP_DZ.DZ1;

public class Goods {
    protected final String name;
    protected int cost;
    protected int quantity;
    protected final String measure; // Единица измерения

    public Goods(String name, int cost, int quantity, String measure) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "Goods: " + getClass().getSimpleName() + ", " +
                "Name='" + name + '\'' +
                ", Price=" + cost + " ₸" +
                ", Quantity=" + quantity +
                ", Measure='" + measure + '\'';
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getMeasure() {
        return measure;
    }

    public void setCost(int cost) {
        this.cost = cost * this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
