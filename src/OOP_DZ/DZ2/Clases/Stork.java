package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.Fly;
import OOP_DZ.DZ2.Interfaces.Hunting;

//Аист
public class Stork extends Birds implements Hunting, Fly {
    public Stork(double animalHeight, double animalWeight, String animalEyeColor, Integer flyHeigth) {
        super(animalHeight, animalWeight, animalEyeColor, flyHeigth);
    }

    @Override
    public void makeNoize() {
        System.out.println("We are usually silent");
    }

    @Override
    public void goHunting() {
        System.out.println("I need find some fish");
    }

    @Override
    public void fly() {
        System.out.printf("I fly in %d meters high\n", flyHeight);
    }
}
