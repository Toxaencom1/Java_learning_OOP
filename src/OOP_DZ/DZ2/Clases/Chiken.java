package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.Fly;
import OOP_DZ.DZ2.Interfaces.ShowAffection;

public class Chiken extends Birds implements ShowAffection, Fly {

    public Chiken(double animalHeigth, double animalWeight, String animalEyeColor) {
        super(animalHeigth, animalWeight, animalEyeColor, 0);
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
}
