package OOP_DZ.DZ2.Clases;

import java.time.LocalDate;

public class Cat extends Pet {
    Boolean fur;

    public Cat(int animalHeight, int animalWeight, String animalEyeColor, String nickName, String species,
               String furColor, boolean vaccination, LocalDate birthDate, Boolean fur) {
        super(animalHeight, animalWeight, animalEyeColor, nickName, species, furColor, vaccination, birthDate);
        this.fur = fur;
    }

    @Override
    void makeNoize() {
        System.out.println("Meaow");
    }

    @Override
    void showAffection() {
        System.out.println("I love you, Owner: Trrr,trrr,brrr");
    }

    @Override
    public String info() {
        String isFur;
        if (fur) {
            isFur = ", I have a fur";
        } else {
            isFur = ", I don`t need a fur";
        }
        return super.info() + isFur;
    }
}
