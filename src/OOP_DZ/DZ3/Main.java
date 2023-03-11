package OOP_DZ.DZ3;


import OOP_DZ.DZ3.Classes.*;
import OOP_DZ.DZ3.Classes.Base_Classes.Figure;
import OOP_DZ.DZ3.Interfaces.Circumference;
import OOP_DZ.DZ3.Interfaces.Perimeter;
import OOP_DZ.DZ3.Pool.CirclePool;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        Circle circle1 = new Circle(2.4);
        Rectangle rectangle1 = new Rectangle(new ArrayList<>(), 2.0, 3.0);
        Square square1 = new Square(new ArrayList<>(), 2.0);
        Triangle triangle1 = new Triangle(new ArrayList<>(), 1.1, 1.0, 2.0);

        List<Figure> figurelList = new ArrayList<>(Arrays.asList(circle1, rectangle1, square1, triangle1));
        CirclePool circlePool = new CirclePool();
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        while (true){
            menu.showMenu(menu.getMainMenuList());
            int menuChoice = Validator.valMenuChoice(sc.nextLine(),6,sc);
            switch (menuChoice){
                case 1 -> {
                    for (Figure figure:figurelList) {
                        System.out.println(figure.getClass().getSimpleName()+" "+figure.getId());
                        if (figure instanceof Perimeter) {
                            System.out.println("Perimeter: "+((Perimeter) figure).perimeter());
                        }
                        if (figure instanceof Circumference) {
                            System.out.println("Circumference: "+((Circumference) figure).circumference());
                        }
                        System.out.println("Area of: "+figure.areaOf());
                        System.out.println();
                    }
                }
                case 2 -> {
                    menu.showMenu(menu.getAddMenuList());
                    int addMenuChoice = Validator.valMenuChoice(sc.nextLine(),3,sc);
                    switch (addMenuChoice){
                        case 1 -> {
                            System.out.println("Enter radius of circle: ");
                            double radius = Validator.valDouble(sc.nextLine(),sc);
                            circlePool.getCirclePoolList().get(0).setRadius(radius);
                            figurelList.add(circlePool.getCirclePoolList().get(0));
                            circlePool.getCirclePoolList().remove(0);
                        }
                        case 2 -> {
                            System.out.println("Enter radius of circle: ");
                        }
                        case 3 -> {

                        }
                    }
                }
                case 3 -> {
                    System.out.println();
                    showFigureId(figurelList);
                    System.out.println("Which one to remove?");
                    int witchOne= Validator.valInt(sc.nextLine(),sc);
                    for (Figure figure :figurelList) {
                        if (figure.getId()==witchOne){
                            figurelList.remove(figure);
                            break;
                        }
                    }

                }
                case 4 -> {

                }
                case 5 -> {
                    showFigureId(figurelList);
                }
                case 6 -> {
                    sc.close();
                    System.exit(0);
                }
            }
        }

    }
    public static void showFigureId(List<Figure> figureList) {
        for (Figure figure : figureList) {
            System.out.println(figure.getClass().getSimpleName() +
                    " id = " + figure.getId());
        }
    }
}
