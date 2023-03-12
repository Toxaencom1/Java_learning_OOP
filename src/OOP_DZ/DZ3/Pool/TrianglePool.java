package OOP_DZ.DZ3.Pool;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Classes.Triangle;
import OOP_DZ.DZ3.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrianglePool {
    private List<Triangle> trianglePoolList = new ArrayList<>(List.of(new Triangle()));

    public List<Triangle> getTrianglePoolList() {
        return trianglePoolList;
    }

    public void setSideA(Double size) {
        trianglePoolList.get(0).setSideA(size);
    }

    public void setSideB(Double size) {
        trianglePoolList.get(0).setSideB(size);
    }

    public void setSideC(Double size) {
        trianglePoolList.get(0).setSideC(size);
    }

    public Figure getTriangle(Scanner sc) {
        while (true){
            System.out.println("Enter side A: ");
            Double sideA = Validator.valDouble(sc.nextLine(), sc);
            System.out.println("Enter side B: ");
            Double sideB = Validator.valDouble(sc.nextLine(), sc);
            System.out.println("Enter side C: ");
            Double sideC = Validator.valDouble(sc.nextLine(), sc);
            if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
                setSideA(sideA);
                setSideB(sideB);
                setSideC(sideC);
                break;
            } else System.out.println("Triangle with your parameters is impossible, enter right parameters");
        }
        return trianglePoolList.get(0);
    }

    public void removeTriangle() {
        trianglePoolList.remove(0);
    }

    public void addTriangle() {
        trianglePoolList.add(new Triangle());
    }

    public void refreshList() {
        removeTriangle();
        addTriangle();
    }
}
