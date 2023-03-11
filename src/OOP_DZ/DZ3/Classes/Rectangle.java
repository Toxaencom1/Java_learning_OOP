package OOP_DZ.DZ3.Classes;

import OOP_DZ.DZ3.Interfaces.Perimeter;

import java.util.ArrayList;

public class Rectangle extends Polygon implements Perimeter {
    protected Double sideA,sideB,sideC,sideD;

    public Rectangle(ArrayList<Double> sideList, Double sideA, Double sideB) {
        super(sideList);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideA;
        this.sideD = sideB;
        if (!sideA.equals(sideB) && sideA>0 && sideB>0){
            sideList.add(this.sideA);
            sideList.add(this.sideB);
            sideList.add(this.sideC);
            sideList.add(this.sideD);
        } else {
            System.out.println("Rectangle sides must be more than zero, and not equals!");
        }

    }

    @Override
    public Double areaOf() {
        return sideA * sideB;
    }

    public Double getSideA() {
        return sideList.get(0);
    }

    public Double getSideB() {
        return sideList.get(1);
    }

    public void setSideA(Double sideAC) {
        if (!sideAC.equals(sideB)) {
            sideList.set(0, sideAC);
            sideList.set(2, sideAC);
        } else {
            System.out.println("If you do this, it's be a Square, Cancel operation!");
        }
    }

    public void setSideB(Double sideBD) {
        if (!sideBD.equals(sideA)) {
            sideList.set(1, sideBD);
            sideList.set(3, sideBD);
        } else {
            System.out.println("If you do this, it's be a Square, Cancel operation!");
        }
    }

    public void switchSides() {
        sideList.set(0, sideB);
        sideList.set(1, sideA);
        sideList.set(2, sideB);
        sideList.set(3, sideA);
    }
}
