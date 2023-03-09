package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.ShowAffection;

import java.time.LocalDate;

public abstract class Pet extends Animal implements ShowAffection {
    protected String nickName;
    protected final String species;
    protected String furColor;
    protected boolean vaccination;
    protected final LocalDate birthDate;

    protected Pet(String nameInZoo, double animalHeight, double animalWeight, String animalEyeColor, String nickName, String species,
               String furColor, boolean vaccination, LocalDate birthDate) {
        super(nameInZoo, animalHeight, animalWeight, animalEyeColor);
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
                ", My birth date is " + birthDate;
    }

    public String getNickName() {
        return nickName;
    }

    public String getSpecies() {
        return species;
    }

    public String getFurColor() {
        return furColor;
    }

    public boolean isVaccination() {
        return vaccination;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setVaccinate() {
        if (!vaccination){
            this.vaccination = true;
        }
    }
}
