package OOP_DZ.DZ1;

public class Bread extends Food{
    String flourType;
    public Bread(String name, int cost, int quantity, String measure, int expirationDate, String flourType){
        super(name,cost,quantity,measure,expirationDate);
        this.flourType = flourType;
    }
}
