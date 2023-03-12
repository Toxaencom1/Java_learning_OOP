package OOP_DZ.DZ3.Pool;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Classes.Square;

import java.util.ArrayList;
import java.util.List;

public class SquarePool {

    private List<Square> squarePoolList = new ArrayList<>(List.of(new Square()));

    public List<Square> getSquarePoolList() {
        return squarePoolList;
    }
    public void setSides(Double size){
        squarePoolList.get(0).setSides(size);
    }
    public Figure getSquare(Double sideA){
        if (sideA > 0) {
            setSides(sideA);
        } else System.out.printf("Square Id-№%d with your parameters is impossible, " +
                "add standard Square, you can change parameters from menu №4\n",squarePoolList.get(0).getId());
        return squarePoolList.get(0);
    }
    public void removeSquare() {
        squarePoolList.remove(0);
    }
    public void addSquare(){
        squarePoolList.add(new Square());
    }
    public void refreshList() {
        removeSquare();
        addSquare();
    }
}
