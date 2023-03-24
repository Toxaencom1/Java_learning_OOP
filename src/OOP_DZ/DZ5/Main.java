package OOP_DZ.DZ5;

import OOP_DZ.DZ5.notebook.Service;
import OOP_DZ.DZ5.notebook.storage.File;
import OOP_DZ.DZ5.notebook.storage.JsonFile;
import OOP_DZ.DZ5.notebook.storage.Storage;
import OOP_DZ.DZ5.presenter.PresenterMVP;
import OOP_DZ.DZ5.ui.ConsoleUI;
import OOP_DZ.DZ5.ui.View;


/*
Все материалы прикреплены в описанию урока. к сожалению к материалам урока не получилось)
Создать в формате MVP проект блокнот. Суть: пользователь может делать какие-то записи для себя
(список продуктов или запись к врачу, не важно, просто текст, который надо сохранить).
Приложение сохраняет эти записи и при просьбе пользователя может выдавать список всех записей.
Сохранять можно в обычный список (например ArrayList) или в файл*.
Все общение с пользователем должно быть во view части проекта.
Можно построить диалог с пользователем по типу: выберите команду: 1- добавить фразу, 2- вывести весь список.
Усложнение проекта на свой вкус) например можно сохранять в формате JSON или реализовать возможность удаления или
изменения записей.
Работу принимаю только в виде ссылки на гит или (что идеально) в виде PR,
где есть возможность оставлять комментарии к каждой строке(fork можно сделать от проекта
https://github.com/Liberate520/homeWork). инструкция на PR в материалах к уроку (буквально видео на 5 мин)
 */

public class Main {

    public static void main(String[] args) {
        Storage storage = new JsonFile();// есть подмена на простое хранение записей в текстовый файл " * = new File();"
        Service service = storage.read();
        View view = new ConsoleUI();
        new PresenterMVP(view, service);
        view.start();
        storage.write(service);
    }
}
