package OOP_DZ.DZ2.Clases;


public abstract class Animal {
    private final int id;
    private static int idStart = 0;
    protected String nameInZoo;
    protected double animalHeight;
    protected double animalWeight;
    protected final String animalEyeColor;

    protected Animal(String nameInZoo, double animalHeight, double animalWeight, String animalEyeColor) {
        this.id = ++idStart;
        this.nameInZoo = nameInZoo;
        this.animalHeight = animalHeight;
        this.animalWeight = animalWeight;
        this.animalEyeColor = animalEyeColor;
    }

    abstract public void makeNoize();

    public String info() {
        return "I am " + getClass().getSimpleName() + ", My name is '" + nameInZoo + "'" +
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

    public int getId() {
        return id;
    }

    public String getNameInZoo() {
        return nameInZoo;
    }
}
