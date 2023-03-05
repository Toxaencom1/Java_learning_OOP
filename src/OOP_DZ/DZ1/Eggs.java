package OOP_DZ.DZ1;

public class Eggs extends Food{
    int quantityPerPackage;
    public Eggs(String name, int cost, int quantity, String measure, int expirationDate, int quantityPerPackage) {
        super(name, cost, quantity, measure, expirationDate);
        this.quantityPerPackage = quantityPerPackage;
    }
}
