package OOP_DZ.DZ1;

public class HygieneItems extends Goods{
    int quantityPerPackage;
    public HygieneItems(String name, int cost, int quantity, String measure, int quantityPerPackage){
        super(name,cost,quantity,measure);
        this.quantityPerPackage=quantityPerPackage;
    }
}
