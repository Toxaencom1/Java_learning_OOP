package OOP_DZ.DZ3.Classes;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Interfaces.Circumference;

public class Circle extends Figure implements Circumference {
    Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double areaOf() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String checkFigure() {
        if (Math.PI == circumference() / (2 * radius)) {
            return "it is a Circle";
        } else return "i don't nooooo";
    }

    @Override
    public Double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Circumference: " + this.circumference() + ", Radius: " + radius;
    }
}
