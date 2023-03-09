package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.ShowAffection;

import java.time.LocalDate;

public class Tiger extends WildAnimal implements ShowAffection {
    public Tiger(int animalHeight, int animalWeight, String animalEyeColor, String habitat, LocalDate locationDate) {
        super(animalHeight, animalWeight, animalEyeColor, habitat, locationDate);
    }
    @Override
    void makeNoize() {
        System.out.println("Growl, roar, chuff, moan");
    }

    @Override
    public void showAffection() {
        System.out.println("Thank you Human for you food!");
    }

    @Override
    public void goHunting() {
        System.out.println("Roarw!!! I am hungry, give me a food or I am eat you");
    }
}
