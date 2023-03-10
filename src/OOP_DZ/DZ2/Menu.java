package OOP_DZ.DZ2;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {
    private final ArrayList<String> mainMenuList;

    public Menu() {
        this.mainMenuList = new ArrayList<>(Arrays.asList("Add animal", "Remove animal",
                "Show animal info", "Show all animals info",
                "How sounds animal", "How all animal sounds",
                "What animal can do", "Exit"));
    }

//    public Menu(ArrayList<String> mainMenuList) { // not needed at the end
//        this.mainMenuList = mainMenuList;
//    }

    public void showMenu() {
        System.out.println();
        for (int i = 0; i < this.mainMenuList.size(); i++) {
            System.out.printf("%d %s\n", i + 1, this.mainMenuList.get(i));
        }
        System.out.print("Your choice: ");
    }

    public ArrayList<String> getMainMenuList() {
        return mainMenuList;
    }
}
