package OOP_DZ.DZ2.Clases;


import OOP_DZ.DZ2.Interfaces.Hunting;

import java.time.LocalDate;

public abstract class WildAnimal extends Animal implements Hunting {
    protected String habitat; //Место обитания
    protected LocalDate locationDate;

    protected WildAnimal(double animalHeight, double animalWeight, String animalEyeColor, String habitat, LocalDate locationDate) {
        super(animalHeight, animalWeight, animalEyeColor);
        this.habitat = habitat;
        this.locationDate = locationDate;
    }


    @Override
    public String info() {
        return super.info() + ", I live in " + habitat + " since " + locationDate;
    }

    public String getHabitat() {
        return habitat;
    }

    public LocalDate getLocationDate() {
        return locationDate;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setLocationDate(LocalDate locationDate) {
        this.locationDate = locationDate;
    }
}
