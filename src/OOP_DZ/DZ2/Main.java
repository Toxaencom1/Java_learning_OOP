package OOP_DZ.DZ2;

import java.util.Scanner;

/*
На языке Java реализовать интерфейс "Животное" со следующими полями:
1.Рост животного
2.Вес животного
3.Цвет глаз животного
И методы:
1.Издать звук
2.Напечатать информацию о животном
Так же реализовать следующие интерфейсы, реализующие интерфейс Животное:
1.Домашнее животное со следующими свойствами:
1.1 Кличка
1.2 Порода
1.3 Наличие прививок
1.4 Цвет шерсти
1.5 Дата рождения
И методами:
1.5 Проявлять ласку
2.Дикое животное со следующими свойствами:
2.1 Место обитания
2.2 Дата нахождения
Реализовать классы следующих животных, реализующих интерфейсы домашнего животного или дикого животного
(надеюсь сами поймёте какое животное домашнее, а какое - дикое):
1.Кот со свойством:
1.1 Наличие шерсти(доступным только для чтения внешним классам)
2.1 Тигр
3.Собака со свойством:
3.1 Наличие дрессировки(доступным только для чтения внешним классам)
и методом:
3.2 Дрессировать
4.Волк со свойством:
4.1 Вожак стаи(доступным только для чтения внешним классам)
Так же реализовать абстрактный класс "Птица", реализующий интерфейс животное, у которого будет защищённое поле:
1.Высота полёта
и метод:
2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта
и защищённый конструктор:
3.Конструктор принемающий высоту полёта
И следующие классы-наследники:
1.Курица
2.Аист
Для всех классов реализовать методы издавать звук, чтобы он печатал на консоль звук, примерно похожий на звук,
 который издаёт животное в реальном мире, а метод напечатать информацию, печатающий на экран все свойства,
 которые есть у данного животного. Так же для всех классов реализовать набор конструкторов,
 которые необходимы для задания всех свойств объекта, которые они у него есть.
Так же реализовать класс "Зоопарк", в котором будет храниться любая структура данных животных(массив, стек, очередь),
в котором организовать приватный массив объектов-животных со следующими методами:
1.Добавить животное в зоопарк(добавляет новое животное в структуру данных, для массива использовать следующий алгоритм
https://gospodaretsva.com/urok-27-vstavka-elementov-v-massiv.html , для стека и очереди вы алгоритмы уже знаете)
2.Убирает животное с номером i из зоопарка(Использовать этот алгоритм
https://gospodaretsva.com/urok-26-udalenie-elementa-iz-odnomernogo-massiva.html
для удаления из массива, для удаления из стека и очереди вы алгоритмы знаете)
3.Посмотреть информацию о животном с номером i
4.Заставить животное с номером i издать звук
5.Напечатать информацию о животных, которые есть на данный момент в зоопарке
6.Заставить всех животных, которые на данный момент есть в зоопарке, издать звук
Предоставить пользователю консольный интерфейс(консольное меню),
который позволяет пользователю добавлять новых животных в зоопарк, убирать животных из зоопарка,
печатать информацию о конкретном животном(вводя его номер),
печатать информацию о всех животных в зоопарке на данный момент,
заставлять животное издавать звук(введя номер животное),
заставлять издавать звук всех животных, которые на данный момент есть в зоопарке)
Сделать возможность у животных летать, если это животное птица, проявлять ласку,
если это домашнее животное и дрессировать, если это животное собака.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello visitor! Welcome to our Zoo! Make your choice, or type 'exit' to exit");
        Zoo zoo = new Zoo();
        while (true) {
            Menu.showMenu(Menu.mainMenu());
            Scanner scanner = new Scanner(System.in);
            int menuChoice = Validator.valMenuChoice(scanner.nextLine(), 8);
            switch (menuChoice) {
                case 1 -> {
                    System.out.println();
                    zoo.showAnimalsId(zoo.getTempZoolist());
                    System.out.print("\nWhich animal to add?: ");
                    int addAnimal = Validator.valInt(scanner.nextLine());
                    System.out.println();
                    zoo.addAnimal(addAnimal);
                }
                case 2 -> {
                    System.out.println();
                    zoo.showAnimalsId(zoo.getZoolist());
                    System.out.print("\nWhich animal to remove?: ");
                    int removeAnimal = Validator.valInt(scanner.nextLine());
                    System.out.println();
                    zoo.removeAnimal(removeAnimal);
                }
                case 3 -> {
                    System.out.println();
                    zoo.showAnimalsId(zoo.getZoolist());
                    System.out.print("\nWhich animal want to see?: ");
                    int showAnimalInfo = Validator.valInt(scanner.nextLine());
                    zoo.getInfoAboutAnimal(showAnimalInfo);
                    enterToContinue();
                }
                case 4 -> {
                    System.out.println();
                    zoo.getInfoAboutAllAnimal();
                    enterToContinue();
                }
                case 5 -> {
                    System.out.println();
                    zoo.showAnimalsId(zoo.getZoolist());
                    System.out.print("\nWhich of animal makes sound?: ");
                    int makeSoundAnimal = Validator.valInt(scanner.nextLine());
                    zoo.makeAnimalNoize(makeSoundAnimal);
                    enterToContinue();
                }
                case 6 -> {
                    System.out.println();
                    zoo.makeAllNoize();
                    System.out.println();
                    enterToContinue();
                }
                case 7 -> {
                    System.out.println();
                    zoo.showAnimalsId(zoo.getZoolist());
                    System.out.print("\nWhich kind of animal to show what it can do?: ");
                    int whatAnimalCanDo = Validator.valInt(scanner.nextLine());
                    zoo.whatAnimalDo(whatAnimalCanDo);
                    enterToContinue();
                }
                case 8 -> System.exit(0);
            }
        }

    }

    static void enterToContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Push 'Enter' to continue");
        String temp = scanner.nextLine();
    }
}
