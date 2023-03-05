package OOP_DZ.DZ1;

public class Goods {
    String name;
    int cost;
    int quantity;
    String measure; // Единица измерения

    public Goods(String name, int cost, int quantity, String measure){
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.measure = measure;
    }
}
