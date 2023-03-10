package OOP_DZ.DZ1;

import java.time.LocalDate;

public class Milk extends Drinks {
    private final double fatPercentage;
    private final LocalDate expirationDate;

    public Milk(String name, int cost, int quantity, String measure, double capacity, double fatPercentage,
                LocalDate expirationDate) {
        super(name, cost * quantity, quantity, measure, capacity);
        this.fatPercentage = fatPercentage;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Fat percentage=" + fatPercentage +
                ", Expiration date='" + expirationDate + "'";
    }

    public double getFatPercentage() {
        return fatPercentage;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
