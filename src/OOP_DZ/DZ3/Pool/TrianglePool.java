package OOP_DZ.DZ3.Pool;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Classes.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrianglePool {
    private Triangle triangle2 = new Triangle(new ArrayList<Double>(), 1.1, 1.1, 2.0);
    private Triangle triangle3 = new Triangle(new ArrayList<Double>(), 1.1, 1.1, 2.0);
    private Triangle triangle4 = new Triangle(new ArrayList<Double>(), 1.1, 1.1, 2.0);
    private Triangle triangle5 = new Triangle(new ArrayList<Double>(), 1.1, 1.1, 2.0);
    private Triangle triangle6 = new Triangle(new ArrayList<Double>(), 1.1, 1.1, 2.0);
    private Triangle triangle7 = new Triangle(new ArrayList<Double>(), 1.1, 1.1, 2.0);
    private Triangle triangle8 = new Triangle(new ArrayList<Double>(), 1.1, 1.1, 2.0);
    private Triangle triangle9 = new Triangle(new ArrayList<Double>(), 1.1, 1.1, 2.0);
    private List<Figure> trianglePoolList = new ArrayList<>(Arrays.asList(triangle2, triangle3, triangle4,
            triangle5, triangle6, triangle7, triangle8, triangle9));

    public List<Figure> getTrianglePoolList() {
        return trianglePoolList;
    }
}
