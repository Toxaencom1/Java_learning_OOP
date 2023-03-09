package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.ShowAffection;

import java.time.LocalDate;

public abstract class Pet extends Animal implements ShowAffection {
    String nickName;
    String species;
    String furColor;
    boolean vaccination;
    LocalDate birthDate;

    public Pet(double animalHeight, double animalWeight, String animalEyeColor, String nickName, String species,
               String furColor, boolean vaccination, LocalDate birthDate) {
        super(animalHeight, animalWeight, animalEyeColor);
        this.nickName = nickName;
        this.species = species;
        this.furColor = furColor;
        this.vaccination = vaccination;
        this.birthDate = birthDate;
    }

    public String showAffection() {
        return "I Love you, Owner: ";
    }


    @Override
    public String info() {
        String vacc;
        if (vaccination) {
            vacc = ", I am vaccinated!";
        } else {
            vacc = ", I am not vaccinated(((";
        }
        return super.info() + ", My nickName is '" + nickName + '\'' +
                ", My species is '" + species + '\'' +
                ",  My fur color is '" + furColor + '\'' +
                vacc +
                ", my birth date is " + birthDate;
    }
}
