package OOP_DZ.DZ2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    public static List<String> mainMenu() {
        return new ArrayList<>(Arrays.asList("Add animal","Remove animal","Show animal info","Show all animals info",
                "How sounds animal","How all animal sounds","What animal can do","Exit"));
    }
    public static void showMenu(List<String> menuList) {
        System.out.println();
        for (int i = 0; i < menuList.size(); i++) {
            System.out.printf("%d %s\n", i + 1, menuList.get(i));
        }
        System.out.print("Your choice: ");

    }
}
