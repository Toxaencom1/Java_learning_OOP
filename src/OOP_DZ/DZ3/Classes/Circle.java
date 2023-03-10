package OOP_DZ.DZ3.Classes;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Interfaces.Circumference;

public class Circle extends Figure implements Circumference {
    private Double radius;

    public Circle() {
        this.radius = 1.0;
    }

//    public Circle(Double radius) {
//        if (radius > 0) {
//            this.radius = radius;
//        } else System.out.println("Circle create fail");
//    }
// No need at the end

    @Override
    public Double areaOf() {
        return Math.PI * Math.pow(radius, 2);
    }


    @Override
    public Double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Circumference: " + this.circumference() + ", Radius: " + radius + "\n";
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }


}
