package OOP_DZ.DZ5;

import OOP_DZ.DZ5.notebook.RecordsList;
import OOP_DZ.DZ5.notebook.Service;
import OOP_DZ.DZ5.presenter.Presenter;
import OOP_DZ.DZ5.ui.ConsoleUI;
import OOP_DZ.DZ5.ui.View;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

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
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {

        Service service = readFileJson();
        View view = new ConsoleUI();
        new Presenter(view, service);
        view.start();
        String json = GSON.toJson(service);
        writeToFile(json);
    }

    private static Service readFileJson() {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("\\src\\OOP_DZ\\DZ5\\files\\file.json");
        try (FileReader reader = new FileReader(pathFile)) {
            if (new File(pathFile).length() != 0) {
                return GSON.fromJson(reader, RecordsList.class);
            } else {

                return new RecordsList();
            }
        } catch (Exception e) {
            System.out.println("Parsing error " + e);
        }
        return null;
    }

    private static void writeToFile(String data) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("\\src\\OOP_DZ\\DZ5\\files\\file.json");
            File file = new File(pathFile);
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.write(data + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Not on plan(((");
        }
    }
}
