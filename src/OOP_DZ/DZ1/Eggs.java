package OOP_DZ.DZ1;

import java.time.LocalDate;

public class Eggs extends Food{
    int quantityPerPackage;
    public Eggs(String name, int cost, int quantity, String measure, LocalDate expirationDate, int quantityPerPackage) {
        super(name, cost*quantity, quantity, measure, expirationDate);
        this.quantityPerPackage = quantityPerPackage;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Quantity per package=" + quantityPerPackage;
    }
}
