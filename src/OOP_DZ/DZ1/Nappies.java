package OOP_DZ.DZ1;

public class Nappies extends BabyProducts {
    int size;
    int minimalWeigth;
    int maximalWeigth;
    String type;

    public Nappies(String name, int cost, int quantity, String measure, int minimalAge, int quantityPerPackage,
                   int size, int minimalWeight, int maximalWeight, String type) {
         super(name,cost,quantity,measure,minimalAge,quantityPerPackage);
         this.size = size;
         this.minimalWeigth = minimalWeight;
         this.maximalWeigth = maximalWeight;
         this.type = type;
    }
}
