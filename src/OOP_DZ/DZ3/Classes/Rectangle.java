package OOP_DZ.DZ3.Classes;


import java.util.ArrayList;
import java.util.Arrays;

public class Rectangle extends Polygon {
    public Rectangle() {
        super(new ArrayList<>(Arrays.asList(1.01, 1.02, 1.01, 1.02)));
    }

//    public Rectangle(ArrayList<Double> sideList, Double sideAC, Double sideBD) {
//        super(sideList);
//        if (!sideAC.equals(sideBD) && sideAC > 0.0 && sideBD > 0.0) {
//            sideList.add(sideAC);
//            sideList.add(sideBD);
//            sideList.add(sideAC);
//            sideList.add(sideBD);
//        } else System.out.println("Rectangle sides must be more than zero, and not equals!");
//    }
// No need at the end

    @Override
    public Double areaOf() {
        return getSideA() * getSideB();
    }

    @Override
    public String toString() {
        return super.toString() + ", Side A and C = " + getSideA() + ", Side B and D = " + getSideB() + "\n";

    }

    public Double getSideA() {
        return sideList.get(0);
    }

    public Double getSideB() {
        return sideList.get(1);
    }

    public void setSideA(Double sideAC) {
        sideList.set(0, sideAC);
        sideList.set(2, sideAC);
    }

    public void setSideB(Double sideBD) {
        sideList.set(1, sideBD);
        sideList.set(3, sideBD);
    }
}
