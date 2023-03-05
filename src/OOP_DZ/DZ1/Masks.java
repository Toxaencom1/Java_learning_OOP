package OOP_DZ.DZ1;

public class Masks extends HygieneItems{
    public Masks(String name, int cost, int quantity, String measure, int quantityPerPackage){
        super(name,cost*quantity,quantity,measure,quantityPerPackage);
    }

    @Override
    public String toString() {
        return super.toString() + ". Check yourself for covid! Be healthy!";
    }
}
