package OOP_DZ.DZ5.ui;


import OOP_DZ.DZ5.ui.commands.*;

import java.util.ArrayList;


public class Menu {
    private View view;

    private final ArrayList<ICommand> menuList;

    public Menu(View view) {
        this.view = view;
        this.menuList = new ArrayList<>();
        menuList.add(new InfoOutput(view));
        menuList.add(new AddRecord(view));
        menuList.add(new RemoveRecord(view));
        menuList.add(new ChangeRecord(view));
        menuList.add(new Exit(view));
    }

    public View getView() {
        return view;
    }

    public void execute(int num) {
        ICommand command = menuList.get(num - 1);
        command.runCommand();
    }

    public void showMenu() {
        int num = 1;
        System.out.println();
        for (ICommand item : menuList) {
            System.out.println(num + " " + item.description());
            num += 1;
        }
    }

    public ArrayList<ICommand> getMenuList() {
        return menuList;
    }
}
