package OOP_DZ.DZ3.Pool;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Classes.Rectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RectanglePool {
    private Rectangle rectangle2 = new Rectangle(new ArrayList<Double>(), 1.0, 2.0);
    private Rectangle rectangle3 = new Rectangle(new ArrayList<Double>(), 1.0, 2.0);
    private Rectangle rectangle4 = new Rectangle(new ArrayList<Double>(), 1.0, 2.0);
    private Rectangle rectangle5 = new Rectangle(new ArrayList<Double>(), 1.0, 2.0);
    private Rectangle rectangle6 = new Rectangle(new ArrayList<Double>(), 1.0, 2.0);
    private Rectangle rectangle7 = new Rectangle(new ArrayList<Double>(), 1.0, 2.0);
    private Rectangle rectangle8 = new Rectangle(new ArrayList<Double>(), 1.0, 2.0);
    private Rectangle rectangle9 = new Rectangle(new ArrayList<Double>(), 1.0, 2.0);
    private List<Figure> rectamglePoolList = new ArrayList<>(Arrays.asList(rectangle2, rectangle3, rectangle4,
            rectangle5, rectangle6, rectangle7, rectangle8, rectangle9));

    public List<Figure> getRectamglePoolList() {
        return rectamglePoolList;
    }
}
