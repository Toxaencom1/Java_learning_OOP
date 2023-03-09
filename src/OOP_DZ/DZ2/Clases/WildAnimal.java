package OOP_DZ.DZ2.Clases;


import OOP_DZ.DZ2.Interfaces.Hunting;

import java.time.LocalDate;

public abstract class WildAnimal extends Animal implements Hunting {
    String habitat; //Место обитания
    LocalDate locationDate;

    public WildAnimal(double animalHeight, double animalWeight, String animalEyeColor, String habitat, LocalDate locationDate) {
        super(animalHeight, animalWeight, animalEyeColor);
        this.habitat = habitat;
        this.locationDate = locationDate;
    }


    @Override
    public String info() {
        return super.info() + ", I live in " + habitat + " since " + locationDate;
    }
}
