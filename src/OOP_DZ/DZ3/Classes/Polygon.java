package OOP_DZ.DZ3.Classes;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Interfaces.Perimeter;


import java.util.ArrayList;
import java.util.List;

public abstract class Polygon extends Figure implements Perimeter, Comparable<Figure> {
    protected List<Double> sideList = new ArrayList<>();

    protected Polygon(List<Double> sideList) {
        this.sideList = sideList;
    }

    public List<Double> getSideList() {
        return sideList;
    }

    @Override
    public Double perimeter() {
        Double sum = 0.0;
        for (Double el :
                sideList) {
            sum += el;
        }
        return sum;
    }


    @Override
    public String toString() {
        return super.toString() + ", Perimeter: " + this.perimeter();
    }
}
