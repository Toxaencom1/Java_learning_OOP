package OOP_DZ.DZ1;

public class Pacifier extends BabyProducts{
    public Pacifier(String name, int cost, int quantity, String measure,double minamalAge, boolean hypoallergenic) {
        super(name, cost*quantity, quantity, measure, minamalAge,hypoallergenic);
    }

    @Override
    public String toString() {
        return super.toString()+". Be Happy! Owner)";
    }
}
