package OOP_DZ.DZ3.Classes;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Interfaces.Perimeter;


import java.util.List;

public abstract class Polygon extends Figure implements Perimeter {
    protected List<Double> sideList;

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
    public String checkFigure() {
        if (sideList.size() == 0) {
            return "it's not a figure";
        } else if (sideList.size() == 3) {
            return "it's a Triangle";
        } else if (sideList.size() == 4 && !sideList.get(0).equals(sideList.get(1))) {
            return "it's a Rectangle";
        } else if (sideList.size() == 4 &&
                sideList.get(0).equals(sideList.get(1)) &&
                sideList.get(0).equals(sideList.get(2)) &&
                sideList.get(0).equals(sideList.get(3))) {
            return "it's a Square";
        } else {
            return "Something wrong";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Perimeter: " + this.perimeter();
    }
}
