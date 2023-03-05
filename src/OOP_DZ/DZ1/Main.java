package OOP_DZ.DZ1;

import java.time.LocalDate;

/*
Реализовать класс товар, содержащий следующие свойства:
1. Название
2. Цена
3. Количество
4. Единица измерения

А так же реализовать следующие классы-наследники:
1. Продукты питания, содержащие следующие свойства:
1.1 Срок годности

2. Напитки, содержащие следующие свойства:
2.1 Объём

3. Предметы гигиены, содержащие следующие свойства:
3.1 Количество штук в упаковке

4. Детские товары:
4.1 Минимальный возраст
4.2 Гипоаллергенность,

А так же реализовать слеюущие классы, наследуемые от приведённых выше классов(надеюсь сами разберётесь от каких именно):
5. Молоко, содержащиее следующее свойство:
5.1 Процент жирности
5.2 Срок годности

6. Лимонад

7. Хлеб, содержащий следующие свойство:
7.1 Тип муки

8. Яйца, содержащее следующиее свойство:
8.1 Количество в упаковке

9. Маски

10. Туалетная бумага, содержащее следующее свойство:
10.1 Количество слоёв

11. Подгузники, содержащие следующее свойства:
11.1 Размер
11.2 Минимальный вес
11.3 Максимальный вес
11.4 Тип

12. Соска
У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы,
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, принемающие все поля.
Реализовать в классе Program, метод выводящий все данные о товаре.
Создать в Main все объекты товаров и проверить работу метода, созданного в классе Program
 */
public class Main {
    public static void main(String[] args) {
        Milk Milk = new Milk("Adal", 500, 2, "piece", 0.75, 3.2,
                LocalDate.of(2023, 12, 1));
        Drinks lemonade = new Lemonade("Buratino", 150, 3, "piece", 1);
        Bread bread = new Bread("Factory", 100, 2, "piece",
                LocalDate.of(2023, 12, 1), "1st grade");
        Eggs eggs = new Eggs("Ak-su", 1000, 1, "box",
                LocalDate.of(2023, 12, 1), 10);
        BabyProducts pacifier = new Pacifier("Aguu", 1500, 1,
                "blister", 0, true);
        Nappies nappies = new Nappies("Pampers", 5600, 2, "package", 1,
                true, 2, 4, 8, "breathable");
        HygieneItems mask = new Masks("Medical Mask", 200, 5, "package", 3);
        ToiletPaper toiletPaper = new ToiletPaper("Kari", 2500, 2, "package",
                6, 3);

        Food canndedFood = new Food("Tuna", 550, 1, "canned",
                LocalDate.of(2024, 12, 1));
        Drinks alcohol = new Drinks("Vodka: Kanoplyanka", 2500, 1, "piece", 1);
        HygieneItems sponge = new HygieneItems("Sponge: Ya samaya",980,1,
                "package",100);
        BabyProducts babyBath = new BabyProducts("HappyBaby",15000,1,"piece",
                0,true);
        Program.showGoods(Milk);
        Program.showGoods(lemonade);
        Program.showGoods(bread);
        Program.showGoods(eggs);
        Program.showGoods(pacifier);
        Program.showGoods(nappies);
        Program.showGoods(mask);
        Program.showGoods(toiletPaper);
        Program.showGoods(canndedFood);
        Program.showGoods(alcohol);
        Program.showGoods(sponge);
        Program.showGoods(babyBath);
    }
}
