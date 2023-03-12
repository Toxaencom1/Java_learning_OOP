package OOP_DZ.DZ3;


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
                case 1 -> fPool.showProperties();
                case 2 -> {
                    menu.showMenu(menu.getFigureSelectList());
                    int addMenuChoice = Validator.valMenuChoice(sc.nextLine(), 5, sc);
                    switch (addMenuChoice) {
                        case 1 -> {
                            fPool.addFigure(cPool.getCircle(sc));
                            cPool.refreshList();
                        }
                        case 2 -> {
                            fPool.addFigure(tPool.getTriangle(sc));
                            tPool.refreshList();
                        }
                        case 3 -> {
                            fPool.addFigure(rPool.getRectangle(sc));
                            rPool.refreshList();
                        }
                        case 4 -> {
                            fPool.addFigure(sPool.getSquare(sc));
                            sPool.refreshList();
                        }
                        case 5 -> {
                        }
                    }
                }
                case 3 -> {
                    System.out.println();
                    fPool.showFigureId();
                    System.out.println("Which one to remove?");
                    int witchOne = Validator.valInt(sc.nextLine(), sc);
                    fPool.removeFigure(witchOne);
                }
                case 4 -> {
                    System.out.println();
                    fPool.showFigureId();
                    System.out.print("Choose figure id: ");
                    int changeChoice = Validator.valInt(sc.nextLine(), sc);
                    fPool.changeFigureParam(changeChoice, sc);
                }
                case 5 -> {
                    fPool.sortFigures();
                    System.out.println(fPool.getFigureList());
                }
                case 6 -> {
                    sc.close();
                    System.exit(0);
                }
            }
        }
    }
}
