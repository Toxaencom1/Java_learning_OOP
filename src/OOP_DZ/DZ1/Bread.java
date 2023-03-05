package OOP_DZ.DZ1;

import java.time.LocalDate;

public class Bread extends Food {
    private final String flourType;

    public Bread(String name, int cost, int quantity, String measure, LocalDate expirationDate, String flourType) {
        super(name, cost * quantity, quantity, measure, expirationDate);
        this.flourType = flourType;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Flour type='" + flourType + '\'';


    }

    public String getFlourType() {
        return flourType;
    }
}
