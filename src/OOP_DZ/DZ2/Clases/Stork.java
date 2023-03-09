package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.Hunting;

//Аист
public class Stork extends Bird_A implements Hunting {
    public Stork(double animalHeigth, double animalWeight, String animalEyeColor, Integer flyHeigth) {
        super(animalHeigth, animalWeight, animalEyeColor, flyHeigth);
    }

    @Override
    public void makeNoize() {
        System.out.println("We are usually silent");
    }

    @Override
    public void goHunting() {
        System.out.println("I need find some fish");
    }
}
