package OOP_DZ.DZ5.ui;

import OOP_DZ.DZ5.presenter.Presenter;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Presenter presenter;
    private Scanner scanner;
    private Menu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        menu = new Menu();
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        System.out.println("Welcome Home User!");
        while (true) {
            showMenu(menu.getMainMenuList());
            int menuChoice = scan();
            presenter.choice(menuChoice);
        }
    }

    @Override
    public int scan() {
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();
        return Validator.valInt(choice, scanner);
    }


    @Override
    public void succeeded(boolean isWork, String title) {
        if (!isWork) {
            System.out.println(title);
        } else System.out.println("Success!");
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void showMenu(List<String> menu) {
        System.out.println();
        for (int i = 0; i < menu.size(); i++) {
            System.out.printf("%d %s\n", i + 1, menu.get(i));
        }
    }

    @Override
    public String scanRecord() {
        System.out.print("Enter new Record: ");
        return Validator.emergency_exit(scanner.nextLine());
    }
}
