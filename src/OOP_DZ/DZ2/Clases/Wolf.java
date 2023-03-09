package OOP_DZ.DZ2.Clases;

import OOP_DZ.DZ2.Interfaces.Hunting;

import java.time.LocalDate;

public class Wolf extends WildAnimal implements Hunting {
    boolean alfa;

    public Wolf(int animalHeight, int animalWeight, String animalEyeColor, String habitat,
                LocalDate locationDate, Boolean alfa) {
        super(animalHeight, animalWeight, animalEyeColor, habitat, locationDate);
        this.alfa = alfa;
    }

    @Override
    void makeNoize() {
        System.out.println("Aaauuuuuuuuuuu!, whof whof");
    }

    @Override
    public String info() {
        String isAlfa;
        if (alfa){
            isAlfa = ", I am Alfa";
        } else {
            isAlfa = ", I am not Alfa";
        }
        return super.info()+isAlfa;
    }

    @Override
    public void goHunting() {
        System.out.println("I need food! i need to hunt");
    }
}
