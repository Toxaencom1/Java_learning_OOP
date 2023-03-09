package OOP_DZ.DZ2.Clases;

public abstract class Animal {
    int animalHeight;
    int animalWeight;
    String animalEyeColor;

    protected Animal(int animalHeight, int animalWeight, String animalEyeColor) {
        this.animalHeight = animalHeight;
        this.animalWeight = animalWeight;
        this.animalEyeColor = animalEyeColor;
    }

    abstract void makeNoize();
    public String info(){
        return "I am "+getClass().getSimpleName() +
                ", My height is = " + animalHeight +
                ", My weight is = " + animalWeight +
                ", My eye color is '" + animalEyeColor + '\'';
    }
}
