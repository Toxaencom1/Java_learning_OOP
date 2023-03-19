package OOP_DZ.DZ5.ui;


import java.util.ArrayList;
import java.util.Arrays;


public class Menu {
    private final ArrayList<String> mainMenuList;

    public Menu() {
        this.mainMenuList = new ArrayList<>(Arrays.asList("Info output", "Add record",
                "Remove record", "Change record", "Exit"));
    }


    public ArrayList<String> getMainMenuList() {
        return mainMenuList;
    }
}
