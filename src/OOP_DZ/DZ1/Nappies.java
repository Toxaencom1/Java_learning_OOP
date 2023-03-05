package OOP_DZ.DZ1;

public class Nappies extends BabyProducts {
    int size;
    int minimalWeigth;
    int maximalWeigth;
    String type;

    public Nappies(String name, int cost, int quantity, String measure, int minimalAge, boolean hypoallergenic,
                   int size, int minimalWeight, int maximalWeight, String type) {
         super(name,cost*quantity,quantity,measure,minimalAge,hypoallergenic);
         this.size = size;
         this.minimalWeigth = minimalWeight;
         this.maximalWeigth = maximalWeight;
         this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", size=" + size +
                ", Minimal weigth=" + minimalWeigth + " kg"+
                ", Maximal weigth=" + maximalWeigth + " kg"+
                ", type='" + type + '\'';
    }
}
