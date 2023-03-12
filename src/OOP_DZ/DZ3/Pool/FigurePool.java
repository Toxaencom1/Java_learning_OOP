package OOP_DZ.DZ3.Pool;

import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Classes.Circle;
import OOP_DZ.DZ3.Classes.Rectangle;
import OOP_DZ.DZ3.Classes.Square;
import OOP_DZ.DZ3.Classes.Triangle;
import OOP_DZ.DZ3.Interfaces.Circumference;
import OOP_DZ.DZ3.Interfaces.Perimeter;
import OOP_DZ.DZ3.Validator;

import java.util.*;

public class FigurePool {

    private List<Figure> figureList = new ArrayList<>(Arrays.asList(new Circle(), new Rectangle(), new Square(), new Triangle()));

    public List<Figure> getFigureList() {
        return figureList;
    }
    public void addFigure(Figure figure){
        figureList.add(figure);
    }
    public void removeFigure(Figure figure){
        figureList.remove(figure);
    }
    public void removeFigure(int witchOne){
        for (Figure figure : figureList) {
            if (figure.getId() == witchOne) {
                removeFigure(figure);
                break;
            }
        }
    }
    public void showFigureId() {
        for (Figure figure : figureList) {
            System.out.println(figure.getClass().getSimpleName() +
                    " id = " + figure.getId());
        }
    }
    public void showProperties(){
        for (Figure figure : figureList) {
            System.out.println("\n=====================================================");
            System.out.println(figure.getClass().getSimpleName() + " " + figure.getId());
            if (figure instanceof Perimeter) {
                System.out.println("Perimeter: " + ((Perimeter) figure).perimeter());
            }
            if (figure instanceof Circumference) {
                System.out.println("Circumference: " + ((Circumference) figure).circumference());
            }
            System.out.println("Area of: " + figure.areaOf());
        }
        System.out.println("=====================================================");

    }
    public void changeFigureParam(int id, Scanner sc){
        for (Figure figure :figureList) {
            if(figure.getId() == id) {
                if (figure instanceof Circle) {
                    System.out.println("Enter radius of circle: ");
                    double radius = Validator.valDouble(sc.nextLine(), sc);
                    if(radius>0){
                        ((Circle) figure).setRadius(radius);
                    } else System.out.println("Circle with your parameter is impossible, return to menu");
                } else if (figure instanceof Triangle) {
                    System.out.println("Enter side A: ");
                    double sideA = Validator.valDouble(sc.nextLine(), sc);
                    System.out.println("Enter side B: ");
                    double sideB = Validator.valDouble(sc.nextLine(), sc);
                    System.out.println("Enter side C: ");
                    double sideC = Validator.valDouble(sc.nextLine(), sc);
                    if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
                        ((Triangle) figure).setSideA(sideA);
                        ((Triangle) figure).setSideB(sideB);
                        ((Triangle) figure).setSideC(sideC);
                    } else System.out.println("Triangle with your parameters is impossible, return to menu");
                } else if (figure instanceof Rectangle) {
                    System.out.println("Enter side A: ");
                    double sideA = Validator.valDouble(sc.nextLine(), sc);
                    System.out.println("Enter side B: ");
                    double sideB = Validator.valDouble(sc.nextLine(), sc);
                    if (sideA>0 && sideB>0 && sideA!=sideB) {
                        ((Rectangle) figure).setSideA(sideA);
                        ((Rectangle) figure).setSideB(sideB);
                    } else System.out.println("The sides of the Rectangle must be greater than zero and not equal" +
                            ", return to menu");
                } else if (figure instanceof Square) {
                    System.out.println("Enter side: ");
                    double sideA = Validator.valDouble(sc.nextLine(), sc);
                    if (sideA > 0) {
                        ((Square) figure).setSides(sideA);
                    } else System.out.println("The sides of the square must be greater than zero, return to menu");
                }
            }
        }
    }
    public void sortFigures(){
        Collections.sort(figureList);
    }
}
