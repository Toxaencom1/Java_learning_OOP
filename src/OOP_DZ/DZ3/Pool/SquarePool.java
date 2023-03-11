package OOP_DZ.DZ3.Pool;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Classes.Square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquarePool {
    private Square square2 = new Square(new ArrayList<Double>(), 2.0);
    private Square square3 = new Square(new ArrayList<Double>(), 2.0);
    private Square square4 = new Square(new ArrayList<Double>(), 2.0);
    private Square square5 = new Square(new ArrayList<Double>(), 2.0);
    private Square square6 = new Square(new ArrayList<Double>(), 2.0);
    private Square square7 = new Square(new ArrayList<Double>(), 2.0);
    private Square square8 = new Square(new ArrayList<Double>(), 2.0);
    private Square square9 = new Square(new ArrayList<Double>(), 2.0);
    private List<Figure> squarePoolList = new ArrayList<>(Arrays.asList(square2, square3, square4,
            square5, square6, square7, square8, square9));

    public List<Figure> getSquarePoolList() {
        return squarePoolList;
    }
}
