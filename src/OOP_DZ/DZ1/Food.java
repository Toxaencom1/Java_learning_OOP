package OOP_DZ.DZ1;

import java.time.LocalDate;

public class Food extends Goods{
    int expirationDate;

    public Food(String name, int cost, int quantity, String measure, int expirationDate){
        super(name,cost,quantity,measure);
        this.expirationDate = expirationDate;
    }
}
