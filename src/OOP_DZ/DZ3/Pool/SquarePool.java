package OOP_DZ.DZ3.Pool;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Classes.Square;
import OOP_DZ.DZ3.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquarePool {

    private List<Square> squarePoolList = new ArrayList<>(List.of(new Square()));

    public List<Square> getSquarePoolList() {
        return squarePoolList;
    }
    public void setSides(Double size){
        squarePoolList.get(0).setSides(size);
    }
    public Figure getSquare(Scanner sc){
        while (true){
            System.out.println("Enter side A,B,C,D: ");
            double sideA = Validator.valDouble(sc.nextLine(), sc);
            if (sideA > 0) {
                setSides(sideA);
                break;
            } else System.out.println("Square with your parameters is impossible, enter right parameters ");
        }
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
