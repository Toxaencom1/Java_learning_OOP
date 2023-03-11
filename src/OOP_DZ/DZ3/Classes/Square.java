package OOP_DZ.DZ3.Classes;


import java.util.ArrayList;


public class Square extends Rectangle {

    public Square(ArrayList<Double> sideList, Double sideA) {
        super(sideList, sideA, sideA);
        if (sideA > 0) {
            sideList.add(this.sideA);
            sideList.add(this.sideB);
            sideList.add(this.sideC);
            sideList.add(this.sideD);
        } else {
            System.out.println("Square sides must be more than zero!");
        }
    }

    @Override
    public Double areaOf() {
        return Math.pow(sideA, 2);
    }


    public Double getSideA() {
        return sideList.get(0);
    }

    public void setSides(Double side) {
        for (int i = 0; i < sideList.size(); i++) {
            sideList.set(i, side);
        }
    }
}
