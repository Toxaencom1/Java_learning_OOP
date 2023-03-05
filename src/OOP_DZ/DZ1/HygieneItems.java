package OOP_DZ.DZ1;

public class HygieneItems extends Goods{
    int quantityPerPackage;
    public HygieneItems(String name, int cost, int quantity, String measure, int quantityPerPackage){
        super(name,cost,quantity,measure);
        this.quantityPerPackage=quantityPerPackage;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Quantity per package=" + quantityPerPackage;
    }
}
