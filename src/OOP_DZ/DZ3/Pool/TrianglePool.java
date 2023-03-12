package OOP_DZ.DZ3.Pool;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Classes.Triangle;

import java.util.ArrayList;
import java.util.List;

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

    public Figure getTriangle(Double sideA, Double sideB, Double sideC) {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            setSideA(sideA);
            setSideB(sideB);
            setSideC(sideC);
        } else System.out.printf("Triangle Id-№%d with your parameters is impossible, " +
                "add standard triangle, you can change parameters from menu №4\n", trianglePoolList.get(0).getId());
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
