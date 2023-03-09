package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.ShowAffection;
import OOP_DZ.DZ2.Interfaces.Train;

import java.time.LocalDate;

public class Tiger extends WildAnimal implements ShowAffection, Train {
    public Tiger(String nameInZoo, double animalHeight, double animalWeight, String animalEyeColor, String habitat, LocalDate locationDate) {
        super(nameInZoo, animalHeight, animalWeight, animalEyeColor, habitat, locationDate);
    }

    @Override
    public void makeNoize() {
        System.out.println("Growl, roar, chuff, moan");
    }

    @Override
    public String showAffection() {
        return "Show affection: chuff, moan";
    }

    @Override
    public void goHunting() {
        System.out.println("Roar!!! I am hungry, give me a food or I am eat you, or anyone else");
    }

    @Override
    public void train() {
        System.out.print("Let`s train, Give me a paw....");
        System.out.println(" Good job....");
    }
}
