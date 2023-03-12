package OOP_DZ.DZ3;


import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Pool.*;
import java.util.Scanner;

/*
    Написать программу на языках Java, в которой идёт со следующими геометрическими фигурами:
    1.Треугольник
    2.Квадрат
    3.Прямоугольник
    4.Круг
    В программе имеется массив фигур, с которым можно сделать следующие операции:
    1.Добавить новую фигуру
    2.Посчитать периметр у всех фигур
    3.Посчитать площадь у всех фигур
    Для фигуры использовать базовый абстрактный класс фигуры, у которого есть методы посчитать периметр
    и посчитать площадь фигуры.
    Создать класс-коллекцию фигур В классе-коллекции реализовать методы
    1. Вывода информации о всех периметах, площадях и длиннах окружности всех фигур, где это возможно,
    2. добавления новой фигуры,
    3. удаления фигуры,
    4. изменения фигуры по ндексу,
    5. сортировки по площади, вывод информации о всех фигурах.
    При создании фигур необходимо осуществлять проверку входных данных на возможность создания данной фигуры
    и в случае ошибки выдавать соответствующие сообщения. Продумать собственную иерархию исключений
 */
public class Main {
    public static void main(String[] args) {
        FigurePool fPool = new FigurePool();
        CirclePool cPool = new CirclePool();
        TrianglePool tPool = new TrianglePool();
        RectanglePool rPool = new RectanglePool();
        SquarePool sPool = new SquarePool();
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu.showMenu(menu.getMainMenuList());
            int menuChoice = Validator.valMenuChoice(sc.nextLine(), 6, sc);
            switch (menuChoice) {
                case 1 -> {
                    fPool.showProperties();
                }
                case 2 -> {
                    menu.showMenu(menu.getFigureSelectList());
                    int addMenuChoice = Validator.valMenuChoice(sc.nextLine(), 5, sc);
                    switch (addMenuChoice) {
                        case 1 -> {
                            System.out.println("Enter radius of circle: ");
                            double radius = Validator.valDouble(sc.nextLine(), sc);
                            if (cPool.getCirclePoolList().size() != 0){
                                fPool.addFigure(cPool.getCircle(radius));
                                cPool.refreshList();
                            } else System.out.println("Circles out of stock)");
                        }
                        case 2 -> {
                            System.out.println("Enter side A: ");
                            double sideA = Validator.valDouble(sc.nextLine(), sc);
                            System.out.println("Enter side B: ");
                            double sideB = Validator.valDouble(sc.nextLine(), sc);
                            System.out.println("Enter side C: ");
                            double sideC = Validator.valDouble(sc.nextLine(), sc);
                            if(tPool.getTrianglePoolList().size()!=0){
                                fPool.addFigure(tPool.getTriangle(sideA,sideB,sideC));
                                tPool.refreshList();
                            } else System.out.println("Triangles out of stock)");
                        }
                        case 3 -> {
                            System.out.println("Enter side A: ");
                            double sideA = Validator.valDouble(sc.nextLine(), sc);
                            System.out.println("Enter side B: ");
                            double sideB = Validator.valDouble(sc.nextLine(), sc);
                            if(rPool.getRectanglePoolList().size()!=0){
                                fPool.addFigure(rPool.getRectangle(sideA,sideB));
                                rPool.refreshList();
                            } else System.out.println("Rectangles out of stock)");
                        }
                        case 4 -> {
                            System.out.println("Enter side: ");
                            double sideA = Validator.valDouble(sc.nextLine(), sc);
                            if(sPool.getSquarePoolList().size()!=0){
                                fPool.addFigure(sPool.getSquare(sideA));
                                sPool.refreshList();
                            } else System.out.println("Squares out of stock)");
                        }
                        case 5 -> {}
                    }
                }
                case 3 -> {
                    System.out.println();
                    fPool.showFigureId();
                    System.out.println("Which one to remove?");
                    int witchOne = Validator.valInt(sc.nextLine(), sc);
                    for (Figure figure : fPool.getFigureList()) {
                        if (figure.getId() == witchOne) {
                            fPool.removeFigure(figure);
                            break;
                        }
                    }
                }
                case 4 -> {
                    fPool.showFigureId();
                    System.out.print("Choose figure id: ");
                    int changeChoice = Validator.valInt(sc.nextLine(),sc);
                    fPool.changeFigureParam(changeChoice,sc);
                }
                case 5 -> {
                    fPool.showFigureId();
                    fPool.sortFigures();
                }
                case 6 -> {
                    sc.close();
                    System.exit(0);
                }
            }
        }
    }
}
