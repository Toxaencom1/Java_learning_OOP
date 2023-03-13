package OOP_DZ.DZ3.Pool;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Classes.Rectangle;
import OOP_DZ.DZ3.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public Figure getRectangle(Scanner sc) {
        while (true){
            System.out.println("Enter side A,C: ");
            Double sideA = Validator.valDouble(sc.nextLine(), sc);
            System.out.println("Enter side B,D: ");
            Double sideB = Validator.valDouble(sc.nextLine(), sc);
            if (!sideA.equals(sideB) && sideA > 0 && sideB > 0) {
                setSideA(sideA);
                setSideB(sideB);
                break;
            } else System.out.println("Rectangle with your parameters is impossible, enter right parameters ");
        }
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
