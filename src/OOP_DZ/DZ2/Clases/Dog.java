package OOP_DZ.DZ2.Clases;

import java.time.LocalDate;

public class Dog extends Pet {
    Boolean trained;

    public Dog(int animalHeight, int animalWeight, String animalEyeColor, String nickName, String species, String furColor, boolean vaccination, LocalDate birthDate, Boolean trained) {
        super(animalHeight, animalWeight, animalEyeColor, nickName, species, furColor, vaccination, birthDate);
        this.trained = trained;
    }

    void train() {
        System.out.println("Let`s train, Give me a paw....");
        trained = true;
    }

    @Override
    void makeNoize() {
        System.out.println("Whoof whoof");
    }

    @Override
    void showAffection() {
        System.out.println("I love you, Owner: Whoof whoof");
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
}
