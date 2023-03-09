package OOP_DZ.DZ2.Clases;

import java.time.LocalDate;

public abstract class Pet extends Animal{
    String nickName;
    String species;
    String furColor;
    boolean vaccination;
    LocalDate birthDate;

    public Pet(int animalHeight, int animalWeight, String animalEyeColor, String nickName, String species,
               String furColor, boolean vaccination, LocalDate birthDate) {
        super(animalHeight, animalWeight, animalEyeColor);
        this.nickName = nickName;
        this.species = species;
        this.furColor = furColor;
        this.vaccination = vaccination;
        this.birthDate = birthDate;
    }
    abstract void showAffection();

    @Override
    public String info() {
        String vacc;
        if (vaccination){
            vacc = ", I am vaccinated!";
        } else {
            vacc = ", I am not vaccinated(((";
        }
        return super.info()+", My nickName is'" + nickName + '\'' +
                ", My species is'" + species + '\'' +
                ",  MY fur color is'" + furColor + '\'' +
                vacc +
                ", my birth date is " + birthDate;
    }
}
