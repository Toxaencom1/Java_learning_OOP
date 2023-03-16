package OOP_DZ.DZ4;
/*
Реализовать класс для работы с одномерными динамическими массивами произвольных данных(произвольного типа).
Класс будет иметь следующие конструкторы:

1. Конструктор без параметров – конструктор по умолчанию, проводяющий базовую иницаилизацию массива
2. Конструктор с параметром T[] – конструктор, который проводит инициализацию и заполняет массив данными,
пришедшими из параметра

Так же класс будет иметь следующие публичные методы:
1. Вставка в массив
2. Удаление элемента по индексу
3. Удаление всех элементов с заданным значением
4. Поиск минимума
5. Поиск максимума
6. Поиск суммы элементов массива
7. Поиск произведения элементов массива
8. Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
9. Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет.
10. Пузырьковая сортировка
11. Сортировка простыми вставками
12. Сортировка простым выбором
13. Получение элемента массива по индексу
14. Задание значения элементу массива с заданным индексом
15. Печать массива на экран
16. Длинна массива

Так же класс должен содержать следующие приватные поля:
1. Сам массив произвольных данных.
2. Длинну массива
*Так же массив должен содержать следующие перегруженные операторы:
1. Оператор, получающий элемент по заданному индексу
2. Оператор, позволяющий установить значение элемента по заданному индексу
*Так же в случае, если могут произойти ошибки или некорретная работа в конструкторах или методах,
необходимо использовать механизм исключений для обработки возможных ошибок.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnthonyList<Double> al54 = new AnthonyList<>();
        System.out.println(al54.size());
        System.out.println(al54);
        AnthonyList<String> al45 = new AnthonyList<>(Arrays.asList("1a","2b","3c","4d","5e","6f","7g"));
        System.out.println(al45);
        System.out.println("Size al45: "+al45.size());
        AnthonyList<Double> al = new AnthonyList<>();

        al.add(3.1);
        al.add(2.2);
        al.add(1.3);
        al.add(6.4);
        al.add(5.5);
        al.add(3.1);
        al.add(4.6);
        System.out.println();
        System.out.println(al);
        al.addAll(0,Arrays.asList(8.9,9.7));
        System.out.println(al);
        System.out.println();
        al.sortSelection();
        System.out.println(al);
        System.out.println("Size: "+al.size());

        System.out.println("get: "+ al.get(0));
        al.set(0,3.2);
        System.out.println("get: "+ al.get(0));
        System.out.println("indexOf: "+al.indexOf(2.2));
        System.out.println("contains: "+ al.contains(4.2));
        al.sortInsertion();
        System.out.println(al);
        AnthonyList<Integer> al3 = new AnthonyList<>();
        al3.add(3);
        al3.add(2);
        al3.add(1);
        al3.add(6);
        System.out.println("Size AL3:"+al3.size());
        al3.add(5);
        al3.add(4);
        System.out.println("multy al3: "+al3.multiply());
        System.out.println();
        System.out.println(al3);
        al3.addAll(2,Arrays.asList(8,9));
        System.out.println(al3);
        System.out.println();

        System.out.println(al3);
        al3.sortInsertion();
        System.out.println(al3);

        System.out.println("multy3: " + al3.multiply());
        System.out.println("multy: " + al.multiply());
        System.out.println("sum: " + al.sum());
        System.out.println(al.size()+" Size");
        System.out.println(al);
        al.max();
        System.out.println(al.max()+" max");
        System.out.println(al.min()+" min");
        AnthonyList<String> al2 = new AnthonyList<>();
        al2.add("1a");
        al2.add("2a");
        al2.add("3a");
        al2.add("4a");
        al2.add("5a");
        al2.addAll(3,Arrays.asList("2n","2l"));
        System.out.println("indexOf al2: "+al2.indexOf("3a"));
        System.out.println(al2);
        System.out.println(al2.sum());
    }
}
