package OOP_DZ.DZ1;

public class BabyProducts extends Goods {
    protected final double minimalAge;
    protected final boolean hypoallergenic;


    public BabyProducts(String name, int cost, int quantity, String measure, double minimalAge, boolean hypoallergenic) {
        super(name, cost, quantity, measure);
        this.minimalAge = minimalAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Minimal age=" + minimalAge +
                ", Hypoallergenic=" + hypoallergenic;
    }

    public double getMinimalAge() {
        return minimalAge;
    }

    public boolean isHypoallergenic() {
        return hypoallergenic;
    }
}
