package OOP_DZ.DZ1;

import java.time.LocalDate;

public class Food extends Goods{
    LocalDate expirationDate;

    public Food(String name, int cost, int quantity, String measure, LocalDate expirationDate){
        super(name,cost,quantity,measure);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString()+", Expiration date='" + expirationDate+ "'";
    }
}
