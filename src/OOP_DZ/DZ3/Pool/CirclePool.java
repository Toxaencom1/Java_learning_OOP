package OOP_DZ.DZ3.Pool;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Classes.Circle;
import OOP_DZ.DZ3.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CirclePool {
    private List<Circle> circlePoolList = new ArrayList<>(List.of(new Circle()));

    public List<Circle> getCirclePoolList() {
        return circlePoolList;
    }

    public void setRadius(Double radius) {
        circlePoolList.get(0).setRadius(radius);
    }

    public Figure getCircle(Scanner sc) {
        while (true){
            System.out.println("Enter radius of circle: ");
            double radius = Validator.valDouble(sc.nextLine(), sc);
            if (radius > 0) {
                setRadius(radius);
                break;
            } else System.out.println("Circle with your parameter is impossible, enter right parameter");
        }
        return circlePoolList.get(0);

    }

    public void removeCircle() {
        circlePoolList.remove(0);
    }

    public void addCircle() {
        circlePoolList.add(new Circle());
    }

    public void refreshList() {
        removeCircle();
        addCircle();
    }

}