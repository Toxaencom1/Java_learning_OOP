package OOP_DZ.DZ1;

public class Lemonade extends Drinks {
    public Lemonade(String name, int cost, int quantity, String measure, double capacity) {
        super(name, cost*quantity, quantity, measure, capacity);
    }

    @Override
    public String toString() {
        return super.toString()+". \"°O°o°\"";
    }
}
