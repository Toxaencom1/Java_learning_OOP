package OOP_DZ.DZ3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private final ArrayList<String> mainMenuList;
    private final ArrayList<String> figureSelectList;

    public Menu() {
        this.mainMenuList = new ArrayList<>(Arrays.asList("Info output", "Add Figure",
                "Remove figure", "Change figure",
                "Sort Figures and output info ", "Exit"));
        this.figureSelectList = new ArrayList<>(Arrays.asList("Circle", "Triangle","Rectangle","Square",
                "Back to main menu"));

    }

//    public Menu(ArrayList<String> mainMenuList) { // not needed at the end
//        this.mainMenuList = mainMenuList;
//    }

    public void showMenu(List<String> menu) {
        System.out.println();
        for (int i = 0; i < menu.size(); i++) {
            System.out.printf("%d %s\n", i + 1, menu.get(i));
        }
        System.out.print("Your choice: ");
    }

    public ArrayList<String> getMainMenuList() {
        return mainMenuList;
    }

    public ArrayList<String> getFigureSelectList() {
        return figureSelectList;
    }
}
