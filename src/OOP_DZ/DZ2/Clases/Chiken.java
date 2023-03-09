package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.ShowAffection;


public class Chiken extends Birds implements ShowAffection {

    public Chiken(String nameInZoo, double animalHeigth, double animalWeight, String animalEyeColor) {
        super(nameInZoo, animalHeigth, animalWeight, animalEyeColor, 0);
    }


    @Override
    public void makeNoize() {
        System.out.println("buk, buk, ba-gawk");
    }

    @Override
    public String showAffection() {
        return "I love you, Owner: buk, buk, ba-gawk!";
    }

    @Override
    public void fly() {
        System.out.println("I am a bird, but i can`t fly");
    }

    @Override
    public void setFlyHeight(Integer flyHeight) {
        System.out.printf("I can`t fly, sorry, %d meters high is impossible to me\n", flyHeight);
    }
}
