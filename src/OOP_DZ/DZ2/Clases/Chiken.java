package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.ShowAffection;

public class Chiken extends Bird_A  implements ShowAffection {

    public Chiken(int animalHeigth, int animalWeight, String animalEyeColor) {
        super(animalHeigth, animalWeight, animalEyeColor, true, 0);
    }

    @Override
    public void makeNoize() {
        System.out.println("buk, buk, ba-gawk");
    }

    @Override
    public void showAffection() {
        System.out.println("I love you, Owner: buk, buk, ba-gawk!");
    }
}
