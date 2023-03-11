package OOP_DZ.DZ3.Pool;

import OOP_DZ.DZ3.Classes.Circle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CirclePool {
    private Circle circle2 = new Circle(2.0);
    private Circle circle3 = new Circle(2.0);
    private Circle circle4 = new Circle(2.0);
    private Circle circle5 = new Circle(2.0);
    private Circle circle6 = new Circle(2.0);
    private Circle circle7 = new Circle(2.0);
    private Circle circle8 = new Circle(2.0);
    private Circle circle9 = new Circle(2.0);
    private List<Circle> circlePoolList = new ArrayList<>(Arrays.asList(circle2, circle3, circle4,
            circle5, circle6, circle7, circle8, circle9));

    public List<Circle> getCirclePoolList() {
        return circlePoolList;
    }
}
