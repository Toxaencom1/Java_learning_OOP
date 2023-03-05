package OOP_DZ.DZ1;

public class Milk extends Drinks{
    int expirationDate;
    public Milk(String name, int cost, int quantity, String measure,int capacity,int expirationDate){
        super(name,cost,quantity,measure,capacity);
        this.expirationDate = expirationDate;
    }
}
