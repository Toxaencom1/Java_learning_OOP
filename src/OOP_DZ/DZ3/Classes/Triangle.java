package OOP_DZ.DZ3.Classes;


import java.util.ArrayList;
import java.util.Arrays;

public class Triangle extends Polygon {
    private Double angleA, angleB, angleC;
    private boolean isPossible = false;

    public Triangle() {
        super(new ArrayList<>(Arrays.asList(0.011, 0.011, 0.02)));
    }

    public Triangle(ArrayList<Double> sideList, Double sideA, Double sideB, Double sideC) {
        super(sideList);
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            isPossible = true;
            sideList.add(sideA);
            sideList.add(sideB);
            sideList.add(sideC);
            this.angleA = Math.toDegrees(Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) /
                    (2 * sideC * sideB)));
            this.angleB = Math.toDegrees(Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) /
                    (2 * sideA * sideB)));
            this.angleC = Math.toDegrees(Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) /
                    (2 * sideA * sideC)));
        } else System.out.println(getClass().getSimpleName() + " Object is incorrect!");
    }

    @Override
    public Double areaOf() {
        if (isPossible) {
            return 0.5 * getSideA() * getSideB() * Math.sin(Math.toRadians(angleB));
        } else {
            return 0.0;
        }
    }

    @Override
    public Double perimeter() {
        if (isPossible) {
            return super.perimeter();
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ": Side A = " + getSideA() + ", Side B = " + getSideB() +
                ", Side C = " + getSideC() + ", Angle α = " + getAngleA() +
                ", Angle β = " + getAngleB() + ", Angle γ = " + getAngleC() + "\n";
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
            recalculateAngles();
        } else {
            System.out.println("Triangle with your parameters is impossible");
        }
    }

    public void setSideB(Double sideB) {
        if (sideList.size() > 0) {
            sideList.set(1, sideB);
            recalculateAngles();
        } else {
            System.out.println("Triangle with your parameters is impossible");
        }
    }

    public void setSideC(Double sideC) {
        if (sideList.size() > 0) {
            sideList.set(2, sideC);
            recalculateAngles();
        } else {
            System.out.println("Triangle with your parameters is impossible");
        }
    }

    public boolean isPossible() {
        return isPossible;
    }

    public Double getAngleA() {
        if (isPossible) {
            return angleA;
        } else {
            return 0.0;
        }
    }

    public Double getAngleB() {
        if (isPossible) {
            return angleB;
        } else {
            return 0.0;
        }
    }

    public Double getAngleC() {
        if (isPossible) {
            return angleC;
        } else {
            return 0.0;
        }
    }

    private void recalculateAngles() {
        angleA = Math.toDegrees(Math.acos((Math.pow(getSideB(), 2) + Math.pow(getSideC(), 2) -
                Math.pow(getSideA(), 2)) / (2 * getSideC() * getSideB())));
        angleB = Math.toDegrees(Math.acos((Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2) -
                Math.pow(getSideC(), 2)) / (2 * getSideA() * getSideB())));
        angleC = Math.toDegrees(Math.acos((Math.pow(getSideA(), 2) + Math.pow(getSideC(), 2) -
                Math.pow(getSideB(), 2)) / (2 * getSideA() * getSideC())));
    }

}
