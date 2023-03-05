package OOP_DZ.DZ1;

public class Drinks extends Goods{
    int capacity;
    public Drinks(String name, int cost, int quantity, String measure,int capacity){
        super(name,cost,quantity,measure);
        this.capacity = capacity;
    }
}
