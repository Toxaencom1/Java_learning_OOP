package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.Hunting;

//Аист
public class Stork extends Bird_A implements Hunting {
    public Stork(int animalHeigth, int animalWeight, String animalEyeColor, Integer flyHeigth) {
        super(animalHeigth, animalWeight, animalEyeColor, false, flyHeigth);
    }

    @Override
    void makeNoize() {
        System.out.println("We are usually silent");
    }

    @Override
    public void goHunting() {
        System.out.println("I need find some fish");
    }
}
