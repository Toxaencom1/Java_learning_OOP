package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.Train;

import java.time.LocalDate;

public class Cat extends Pet implements Train {
    private Boolean fur;

    public Cat(String nameInZoo, double animalHeight, double animalWeight, String animalEyeColor, String nickName,
               String species, String furColor, boolean vaccination, LocalDate birthDate, Boolean fur) {
        super(nameInZoo, animalHeight, animalWeight, animalEyeColor, nickName,
                species, furColor, vaccination, birthDate);
        this.fur = fur;
    }

    @Override
    public void makeNoize() {
        System.out.println("Meaow");
    }

    @Override
    public String showAffection() {
        return super.showAffection() +"meow, mur";
    }

    @Override
    public String info() {
        String isFur;
        if (fur) {
            isFur = ", I have a fur";
        } else {
            isFur = "";
            return super.info().replace(",  My fur color is ''",", I don`t have a fur ");
        }
        return super.info() + isFur;
    }

    @Override
    public void train() {
        System.out.println("Let`s train, good job...");
    }

    public Boolean getFur() {
        return fur;
    }

    public void setFur(Boolean fur) {  // Побрить кота это жестоко, но возможно
        if (!fur){
            this.setFurColor("");
            this.fur = false;
        } else {
            this.fur = true;
        }
    }
}
