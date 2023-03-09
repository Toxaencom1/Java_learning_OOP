package OOP_DZ.DZ2.Clases;

public abstract class Bird_A extends Animal {
    boolean domesticated;
    protected Integer flyHeigth;

    public Bird_A(int animalHeight, int animalWeight, String animalEyeColor, boolean domesticated, Integer flyHeigth) {
        super(animalHeight, animalWeight, animalEyeColor);
        this.domesticated = domesticated;
        this.flyHeigth = flyHeigth;
    }

    protected void fly(){
        if (flyHeigth == 0){
            System.out.println("I am a bird, but i can`t fly");
        } else {
            System.out.printf("Я лечу на %d метрах\n",flyHeigth);
        }
    }

    @Override
    public String info() {
        String domestic;
        String flying;
        if (domesticated){
            domestic = ", I am pet";
        } else {
            domestic = ", I am wild animal";
        }
        if (flyHeigth == 0){
            flying = "";
        } else {
            flying = ", I can fly in "+ flyHeigth+" height meters";
        }
        return super.info()+domestic+flying;
    }
}
