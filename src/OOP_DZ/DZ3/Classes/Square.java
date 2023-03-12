package OOP_DZ.DZ3.Classes;


import java.util.ArrayList;
import java.util.Arrays;


public class Square extends Polygon {

    public Square() {
        super(new ArrayList<>(Arrays.asList(0.01,0.01,0.01,0.01)));
    }
    public Square(ArrayList<Double> sideList, Double sideA) {
        super(sideList);
        if (sideA > 0) {
            sideList.add(sideA);
            sideList.add(sideA);
            sideList.add(sideA);
            sideList.add(sideA);
        } else System.out.println("Square sides must be more than zero!");
    }

    @Override
    public Double areaOf() {
        return Math.pow(getSideA(), 2);
    }


    @Override
    public String toString() {
        return super.toString() + ": Side A,B,C,D = " + getSideA() +
                ", Area of Rectangle: " + this.areaOf() +
                ", Perimeter: " + this.perimeter()+"\n";
    }

    public Double getSideA() {
        return sideList.get(0);
    }

    public void setSides(Double side) {
        sideList.replaceAll(ignored -> side);
    }
}
