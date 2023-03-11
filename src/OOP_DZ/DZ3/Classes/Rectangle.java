package OOP_DZ.DZ3.Classes;


import java.util.ArrayList;

public class Rectangle extends Polygon {

    public Rectangle(ArrayList<Double> sideList, Double sideA, Double sideB) {
        super(sideList);
        if (!sideA.equals(sideB) && sideA > 0.0 && sideB > 0.0) {
            sideList.add(sideA);
            sideList.add(sideB);
            sideList.add(sideA);
            sideList.add(sideB);
        } else {
            System.out.println("Rectangle sides must be more than zero, and not equals!");
        }

    }

    @Override
    public Double areaOf() {
        return getSideA() * getSideB();
    }

    @Override
    public String toString() {
        return super.toString() + ": Side A and C = " + getSideA() + ", Side B and D = " + getSideB();

    }

    public Double getSideA() {
        return sideList.get(0);
    }

    public Double getSideB() {
        return sideList.get(1);
    }

    public void setSideA(Double sideAC) {
        if (!sideAC.equals(getSideB())) {
            sideList.set(0, sideAC);
            sideList.set(2, sideAC);
        } else {
            System.out.println("If you do this, it's be a Square, Cancel operation!");
        }
    }

    public void setSideB(Double sideBD) {
        if (!sideBD.equals(getSideA())) {
            sideList.set(1, sideBD);
            sideList.set(3, sideBD);
        } else {
            System.out.println("If you do this, it's be a Square, Cancel operation!");
        }
    }

    public void switchSides() {
        sideList.set(0, getSideB());
        sideList.set(1, getSideA());
        sideList.set(2, getSideB());
        sideList.set(3, getSideA());
    }
}
