package OOP_DZ.DZ3;

import OOP_DZ.DZ3.Classes.*;
import OOP_DZ.DZ3.Classes.Base_Classes.Figure;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        Square square1 = new Square(new ArrayList<>(), 2.0);
        Rectangle rectangle1 = new Rectangle(new ArrayList<>(), 2.0, 3.0);
        Triangle triangle1 = new Triangle(new ArrayList<>(), 1.1, 1.0, 2.0);
        Circle circle1 = new Circle(2.4);

        List<Figure> circlePoolList = new ArrayList<>(Arrays.asList(circle1, rectangle1, square1, triangle1));


    }
}
