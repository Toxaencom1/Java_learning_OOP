package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.Train;

import java.time.LocalDate;

public class Dog extends Pet implements Train {
    private Boolean trained;

    public Dog(String nameInZoo, double animalHeight, double animalWeight, String animalEyeColor, String nickName, String species,
               String furColor, boolean vaccination, LocalDate birthDate, Boolean trained) {
        super(nameInZoo, animalHeight, animalWeight, animalEyeColor, nickName, species, furColor, vaccination, birthDate);
        this.trained = trained;
    }
    @Override
    public void train() {
        System.out.println("Let`s train, Give me a paw....");
        this.trained = true;
        System.out.println("Now, I can follow your orders");
    }

    @Override
    public void makeNoize() {
        System.out.println("Whoof whoof");
    }

    @Override
    public String showAffection() {
        return super.showAffection()+"Whoof whoof";
    }

    @Override
    public String info() {
        String isTrained;
        if (trained) {
            isTrained = ", I can follow your orders";
        } else {
            isTrained = ", I can`t follow your orders";
        }
        return super.info() + isTrained;
    }

    public Boolean getTrained() {
        return trained;
    }
}
