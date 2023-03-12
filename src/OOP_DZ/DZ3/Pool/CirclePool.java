package OOP_DZ.DZ3.Pool;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Classes.Circle;

import java.util.ArrayList;
import java.util.List;

public class CirclePool {
    private List<Circle> circlePoolList = new ArrayList<>(List.of(new Circle()));

    public List<Circle> getCirclePoolList() {
        return circlePoolList;
    }

    public void setRadius(Double radius) {
        circlePoolList.get(0).setRadius(radius);
    }

    public Figure getCircle(Double radius) {
        if (radius > 0) {
            setRadius(radius);
        } else System.out.printf("Circle Id-№%d with your parameters is impossible, " +
                "add standard Circle, you can change parameters from menu №4\n", circlePoolList.get(0).getId());
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