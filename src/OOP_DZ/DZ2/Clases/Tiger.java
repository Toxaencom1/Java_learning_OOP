package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.ShowAffection;

import java.time.LocalDate;

public class Tiger extends WildAnimal implements ShowAffection {
    public Tiger(double animalHeight, double animalWeight, String animalEyeColor, String habitat, LocalDate locationDate) {
        super(animalHeight, animalWeight, animalEyeColor, habitat, locationDate);
    }

    @Override
    public void makeNoize() {
        System.out.println("Growl, roar, chuff, moan");
    }

    @Override
    public String showAffection() {
        return "chuff, moan";
    }

    @Override
    public void goHunting() {
        System.out.println("Roar!!! I am hungry, give me a food or I am eat you");
    }
}
