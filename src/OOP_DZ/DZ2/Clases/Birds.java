package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.Fly;


public abstract class Birds extends Animal implements Fly {

    protected int flyHeight;

    protected Birds(String nameInZoo, double animalHeight, double animalWeight, String animalEyeColor, int flyHeight) {
        super(nameInZoo, animalHeight, animalWeight, animalEyeColor);
        this.flyHeight = flyHeight;
    }

    @Override
    public String info() {
        String isflying;
        if (flyHeight == 0) {
            isflying = ", I can`t fly";
        } else {
            isflying = ", I can fly in " + flyHeight + " meters high";
        }
        return super.info() + isflying;
    }

    public Integer getFlyHeight() {
        return flyHeight;
    }

    public void setFlyHeight(Integer flyHeight) {
        if (flyHeight >= 1) {
            this.flyHeight = flyHeight;
        } else {
            System.out.println("Can`t fly lower than one meter");
        }
    }
}
