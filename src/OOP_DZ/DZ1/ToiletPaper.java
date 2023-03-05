package OOP_DZ.DZ1;

public class ToiletPaper extends HygieneItems {
    private final int layersQuantity;

    public ToiletPaper(String name, int cost, int quantity, String measure, int quantityPerPackage, int layersQuantity) {
        super(name, cost * quantity, quantity, measure, quantityPerPackage);
        this.layersQuantity = layersQuantity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Layers quantity=" + layersQuantity;
    }

    public int getLayersQuantity() {
        return layersQuantity;
    }
}
