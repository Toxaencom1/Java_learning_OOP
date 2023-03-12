package OOP_DZ.DZ3.Pool;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Classes.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class RectanglePool {
    private List<Rectangle> rectanglePoolList = new ArrayList<>(List.of(new Rectangle()));

    public List<Rectangle> getRectanglePoolList() {
        return rectanglePoolList;
    }

    public void setSideA(Double size) {
        rectanglePoolList.get(0).setSideA(size);
    }

    public void setSideB(Double size) {
        rectanglePoolList.get(0).setSideB(size);
    }

    public Figure getRectangle(Double sideA, Double sideB) {
        if (!sideA.equals(sideB) && sideA > 0 && sideB > 0) {
            setSideA(sideA);
            setSideB(sideB);
        } else System.out.printf("Rectangle Id-№%d with your parameters is impossible, " +
                "add standard Rectangle, you can change parameters from menu №4\n", rectanglePoolList.get(0).getId());
        return rectanglePoolList.get(0);
    }

    public void removeRectangle() {
        rectanglePoolList.remove(0);
    }

    public void addRectangle() {
        rectanglePoolList.add(new Rectangle());
    }

    public void refreshList() {
        removeRectangle();
        addRectangle();
    }
}
