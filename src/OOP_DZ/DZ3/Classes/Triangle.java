package OOP_DZ.DZ3.Classes;


import java.util.ArrayList;
import java.util.Arrays;

public class Triangle extends Polygon {

    public Triangle() {
        super(new ArrayList<>(Arrays.asList(1.1, 1.1, 2.0)));
    }

//    public Triangle(ArrayList<Double> sideList, Double sideA, Double sideB, Double sideC) {
//        super(sideList);
//        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
//            sideList.add(sideA);
//            sideList.add(sideB);
//            sideList.add(sideC);
//        } else System.out.println(getClass().getSimpleName() + " Object is incorrect!");
//    }
    // No need at the end

    @Override
    public Double areaOf() {
        Double hp = perimeter() / 2; // half perimeter
        return Math.sqrt(hp * (hp - getSideA()) * (hp - getSideB()) * (hp - getSideC()));
    }

    @Override
    public String toString() {
        return super.toString() + ", Side A = " + getSideA() + ", Side B = " + getSideB() +
                ", Side C = " + getSideC() + "\n";
    }

    public Double getSideA() {
        return sideList.get(0);
    }

    public Double getSideB() {
        return sideList.get(1);
    }

    public Double getSideC() {
        return sideList.get(2);
    }

    public void setSideA(Double sideA) {
        if (sideList.size() > 0) {
            sideList.set(0, sideA);
        } else {
            System.out.println("Triangle with your parameters is impossible");
        }
    }

    public void setSideB(Double sideB) {
        if (sideList.size() > 0) {
            sideList.set(1, sideB);
        } else {
            System.out.println("Triangle with your parameters is impossible");
        }
    }

    public void setSideC(Double sideC) {
        if (sideList.size() > 0) {
            sideList.set(2, sideC);
        } else {
            System.out.println("Triangle with your parameters is impossible");
        }
    }
}
