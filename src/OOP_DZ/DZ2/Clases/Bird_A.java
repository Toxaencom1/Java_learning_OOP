package OOP_DZ.DZ2.Clases;

public abstract class Bird_A extends Animal {

    protected Integer flyHeigth;

    public Bird_A(double animalHeight, double animalWeight, String animalEyeColor, Integer flyHeigth) {
        super(animalHeight, animalWeight, animalEyeColor);
        this.flyHeigth = flyHeigth;
    }

    public void fly() {
        if (flyHeigth == 0) {
            System.out.println("I am a bird, but i can`t fly");
        } else {
            System.out.printf("Я лечу на %d метрах\n", flyHeigth);
        }
    }

    @Override
    public String info() {
        String isflying;
        if (flyHeigth == 0) {
            isflying = "";
        } else {
            isflying = ", I can fly in " + flyHeigth + " meters high";
        }
        return super.info() + isflying;
    }
}
