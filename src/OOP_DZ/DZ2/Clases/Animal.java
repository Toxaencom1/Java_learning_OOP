package OOP_DZ.DZ2.Clases;

public abstract class Animal {
    protected double animalHeight;
    protected double animalWeight;
    protected final String animalEyeColor;

    protected Animal(double animalHeight, double animalWeight, String animalEyeColor) {
        this.animalHeight = animalHeight;
        this.animalWeight = animalWeight;
        this.animalEyeColor = animalEyeColor;
    }

    abstract public void makeNoize();

    public String info() {
        return "I am " + getClass().getSimpleName() +
                ", My height is = " + animalHeight + "M" +
                ", My weight is = " + animalWeight + "kg" +
                ", My eye color is '" + animalEyeColor + '\'';
    }

    public double getAnimalHeight() {
        return animalHeight;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public String getAnimalEyeColor() {
        return animalEyeColor;
    }

    public void setAnimalHeight(double animalHeight) {
        this.animalHeight = animalHeight;
    }

    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }
}
