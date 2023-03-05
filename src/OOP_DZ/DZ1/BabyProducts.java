package OOP_DZ.DZ1;

public class BabyProducts extends Goods{
    int minimalAge;
    int quantityPerPackage;


    public BabyProducts(String name, int cost, int quantity, String measure,int minimalAge, int quantityPerPackage){
        super(name,cost,quantity, measure);
        this.minimalAge = minimalAge;
        this.quantityPerPackage = quantityPerPackage;
    }
}
